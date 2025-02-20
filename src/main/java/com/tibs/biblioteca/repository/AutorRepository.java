package com.tibs.biblioteca.repository;

import com.tibs.biblioteca.domain.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AutorRepository extends JpaRepository<Autor, Long> {
    Optional<Long> findIdByNome(String nome);
    Autor findByNome(String nome);
}
