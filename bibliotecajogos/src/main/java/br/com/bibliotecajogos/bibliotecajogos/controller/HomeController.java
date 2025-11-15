package br.com.bibliotecajogos.bibliotecajogos.controller;

import br.com.bibliotecajogos.bibliotecajogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    private JogoService jogoService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("jogos", jogoService.listarTodos());
        return "index";
    }
}
