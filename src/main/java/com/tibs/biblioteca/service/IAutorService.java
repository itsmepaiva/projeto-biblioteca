package com.tibs.biblioteca.service;

import com.tibs.biblioteca.domain.Autor;
import com.tibs.biblioteca.domain.Livro;

import java.util.List;

public interface IAutorService {
    Autor adicionarAutor(Autor autor);

    Autor retornarAutor(Long id);

    List<Livro> listarTodosLivrosDoAutor(Long id);

    List<Autor> listarTodosAutores();

    void deletarAutor(Long id);

    /*
    Autor update (Long id);
     */


}
