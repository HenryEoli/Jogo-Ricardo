package br.com.bibliotecajogos.bibliotecajogos.controller;

import br.com.bibliotecajogos.bibliotecajogos.model.Jogo;
import br.com.bibliotecajogos.bibliotecajogos.service.CategoriaService;
import br.com.bibliotecajogos.bibliotecajogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jogos")
public class JogoController {

    @Autowired
    private JogoService jogoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/novo")
    public String novoJogo(Model model) {
        model.addAttribute("jogo", new Jogo());
        model.addAttribute("categorias", categoriaService.listarTodas());
        return "form";
    }

    @PostMapping("/salvar")
    public String salvarJogo(Jogo jogo) {
        jogoService.salvar(jogo);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String editarJogo(@PathVariable Long id, Model model) {
        model.addAttribute("jogo", jogoService.buscarPorId(id));
        model.addAttribute("categorias", categoriaService.listarTodas());
        return "form";
    }

    @GetMapping("/deletar/{id}")
    public String deletarJogo(@PathVariable Long id) {
        jogoService.deletar(id);
        return "redirect:/";
    }
}
