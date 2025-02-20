package com.tibs.biblioteca.repository;

import com.tibs.biblioteca.domain.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
