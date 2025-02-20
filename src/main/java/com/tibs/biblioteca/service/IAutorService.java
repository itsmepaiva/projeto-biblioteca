package com.tibs.biblioteca.service;

import com.tibs.biblioteca.DTO.AutorDTO;
import com.tibs.biblioteca.domain.Autor;
import com.tibs.biblioteca.domain.Livro;

import java.util.List;
import java.util.Optional;

public interface IAutorService {
    Autor adicionarAutor(Long userid, AutorDTO autorDTO);

    Optional<Autor> retornarAutor(Long id);

    List<Livro> listarTodosLivrosDoAutor(Long id);

    List<Autor> listarTodosAutores();

    void deletarAutor(Long id);

    /*
    Autor update (Long id);
     */


}
