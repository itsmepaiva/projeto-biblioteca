package com.tibs.biblioteca.service;

import com.tibs.biblioteca.DTO.LivroDTO;
import com.tibs.biblioteca.domain.Livro;

import java.util.List;

public interface ILivroService {
    Livro adicionarLivro(Long userId, LivroDTO livroDTO);

    Livro retornarLivro(Long id);

    List<Livro> listarTodosLivros();

    List<Livro> listarLivrosDisponiveis (Boolean disponivel);

    List<Livro> listarLivrosAlugados (Boolean alugados);

    void deletarLivro (Long userId, Long id);

    /*
    Livro update (Long id):
     */



}
