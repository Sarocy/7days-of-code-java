package saude.api.api.controller;

import saude.api.api.model.Sono;
import saude.api.api.repository.SonoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sono")
public class SonoController {

    @Autowired
    private SonoRepository sonoRepository;

    @GetMapping("/listar")
    public List<Sono> listarSonos() {
        return sonoRepository.findAll();
    }

    @PostMapping("/salvar")
    public String salvarSono(@RequestBody Sono sono) {
        sonoRepository.save(sono);
        return "Registro de sono salvo com sucesso!";
    }

    @PutMapping("/editar/{id}")
    public Sono atualizarSono(@PathVariable Long id, @RequestBody Sono sonoAtualizado) {
        Sono sono = sonoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Registro de sono não encontrado: " + id));

        sono.setHorasDormidas(sonoAtualizado.getHorasDormidas());
        sono.setQualidade(sonoAtualizado.getQualidade());
        sono.setData(sonoAtualizado.getData());

        return sonoRepository.save(sono);
    }

    @DeleteMapping("/excluir/{id}")
    public String excluirSono(@PathVariable Long id) {
        if (!sonoRepository.existsById(id)) {
            return "Registro de sono não encontrado!";
        }
        sonoRepository.deleteById(id);
        return "Registro de sono excluído com sucesso!";
    }
}
