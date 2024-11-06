package saude.api.api.controller;

import saude.api.api.model.Refeicao;
import saude.api.api.repository.RefeicaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/refeicao")
public class RefeicaoController {

    @Autowired
    private RefeicaoRepository refeicaoRepository;

    @GetMapping("/listar")
    public List<Refeicao> listarRefeicoes() {
        return refeicaoRepository.findAll();
    }

    @PostMapping("/salvar")
    public String salvarRefeicao(@RequestBody Refeicao refeicao) {
        refeicaoRepository.save(refeicao);
        return "Refeição salva com sucesso!";
    }

    @PutMapping("/editar/{id}")
    public Refeicao atualizarRefeicao(@PathVariable Long id, @RequestBody Refeicao refeicaoAtualizada) {
        Refeicao refeicao = refeicaoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Refeição não encontrada: " + id));

        refeicao.setNome(refeicaoAtualizada.getNome());
        refeicao.setTipo(refeicaoAtualizada.getTipo());
        refeicao.setQuantidade(refeicaoAtualizada.getQuantidade());
        refeicao.setData(refeicaoAtualizada.getData());

        return refeicaoRepository.save(refeicao);
    }

    @DeleteMapping("/excluir/{id}")
    public String excluirRefeicao(@PathVariable Long id) {
        if (!refeicaoRepository.existsById(id)) {
            return "Refeição não encontrada!";
        }
        refeicaoRepository.deleteById(id);
        return "Refeição excluída com sucesso!";
    }
}
