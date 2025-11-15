package br.com.bibliotecajogos.bibliotecajogos.config;

import br.com.bibliotecajogos.bibliotecajogos.model.Categoria;
import br.com.bibliotecajogos.bibliotecajogos.model.Jogo;
import br.com.bibliotecajogos.bibliotecajogos.service.CategoriaService;
import br.com.bibliotecajogos.bibliotecajogos.service.JogoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private JogoService jogoService;

    @Override
    public void run(String... args) throws Exception {
        Categoria cat1 = new Categoria();
        cat1.setNome("RPG");
        categoriaService.salvar(cat1);

        Categoria cat2 = new Categoria();
        cat2.setNome("Ação");
        categoriaService.salvar(cat2);

        Jogo jogo1 = new Jogo();
        jogo1.setTitulo("The Witcher 3");
        jogo1.setAutor("CD Projekt Red");
        jogo1.setAnoLancamento(2015);
        jogo1.setCategoria(cat1);
        jogo1.setFinalizado(true);
        jogoService.salvar(jogo1);

        Jogo jogo2 = new Jogo();
        jogo2.setTitulo("Red Dead Redemption 2");
        jogo2.setAutor("Rockstar Games");
        jogo2.setAnoLancamento(2018);
        jogo2.setCategoria(cat2);
        jogo2.setFinalizado(false);
        jogoService.salvar(jogo2);
    }
}
