package saude.api.api.controller;

import saude.api.api.model.Exercicio;
import saude.api.api.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicio")
public class ExercicioController {

    @Autowired
    private ExercicioRepository exercicioRepository;

    @GetMapping("/listar")
    public List<Exercicio> listarExercicios() {
        return exercicioRepository.findAll();
    }

    @PostMapping("/salvar")
    public String salvarExercicio(@RequestBody Exercicio exercicio) {
        exercicioRepository.save(exercicio);
        return "Exercício salvo com sucesso!";
    }

    @PutMapping("/editar/{id}")
    public Exercicio atualizarExercicio(@PathVariable Long id, @RequestBody Exercicio exercicioAtualizado) {
        Exercicio exercicio = exercicioRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Exercício não encontrado: " + id));
        // Atualize os campos necessários
        exercicio.setNome(exercicioAtualizado.getNome());
        exercicio.setSeries(exercicioAtualizado.getSeries());
        exercicio.setRepeticoes(exercicioAtualizado.getRepeticoes());
        exercicio.setCarga(exercicioAtualizado.getCarga());
        exercicio.setTempo(exercicioAtualizado.getTempo());
        return exercicioRepository.save(exercicio);
    }

    @DeleteMapping("/excluir/{id}")
    public String excluirExercicio(@PathVariable Long id) {
        if (!exercicioRepository.existsById(id)) {
            return "Exercício não encontrado!";
        }
        exercicioRepository.deleteById(id);
        return "Exercício excluído com sucesso!";
    }

}
