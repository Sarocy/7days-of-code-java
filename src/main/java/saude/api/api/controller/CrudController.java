package saude.api.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.extern.slf4j.Slf4j;
import saude.api.api.model.Exercicio;
import saude.api.api.model.Refeicao;
import saude.api.api.model.Sono;
import saude.api.api.repository.ExercicioRepository;
import saude.api.api.repository.RefeicaoRepository;
import saude.api.api.repository.SonoRepository;

@Slf4j
@Controller
@RequestMapping("/crud")
public class CrudController {

    @Autowired
    private SonoRepository sonoRepository;

    @Autowired
    private ExercicioRepository exercicioRepository;

    @Autowired
    private RefeicaoRepository refeicaoRepository;

    @GetMapping
    public String crud(Model model) {
        try {
            model.addAttribute("sonos", sonoRepository.findAll());
            model.addAttribute("exercicios", exercicioRepository.findAll());
            model.addAttribute("refeicoes", refeicaoRepository.findAll());

            model.addAttribute("exercicio", new Exercicio());
            model.addAttribute("refeicao", new Refeicao());
            model.addAttribute("sono", new Sono());

            return "crud";
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            return "ERRO: " + e.getMessage();
        }

    }

}
