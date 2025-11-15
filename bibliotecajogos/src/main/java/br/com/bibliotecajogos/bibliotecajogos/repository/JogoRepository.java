package br.com.bibliotecajogos.bibliotecajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bibliotecajogos.bibliotecajogos.model.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long> {
}
