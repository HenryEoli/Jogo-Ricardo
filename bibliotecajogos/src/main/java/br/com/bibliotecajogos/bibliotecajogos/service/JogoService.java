package br.com.bibliotecajogos.bibliotecajogos.service;

import br.com.bibliotecajogos.bibliotecajogos.model.Jogo;
import br.com.bibliotecajogos.bibliotecajogos.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogoService {

    @Autowired
    private JogoRepository jogoRepository;

    public List<Jogo> listarTodos() {
        return jogoRepository.findAll();
    }

    public Jogo buscarPorId(Long id) {
        return jogoRepository.findById(id).orElse(null);
    }

    public Jogo salvar(Jogo jogo) {
        return jogoRepository.save(jogo);
    }

    public void deletar(Long id) {
        jogoRepository.deleteById(id);
    }
}
