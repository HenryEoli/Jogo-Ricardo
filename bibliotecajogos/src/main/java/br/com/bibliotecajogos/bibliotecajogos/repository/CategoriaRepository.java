package br.com.bibliotecajogos.bibliotecajogos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.bibliotecajogos.bibliotecajogos.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
