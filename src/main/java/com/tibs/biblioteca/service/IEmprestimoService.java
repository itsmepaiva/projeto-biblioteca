package com.tibs.biblioteca.service;

import com.tibs.biblioteca.domain.Emprestimo;

import java.time.LocalDate;
import java.util.List;

public interface IEmprestimoService {
    Emprestimo novoEmprestimo(Emprestimo emprestimo);

    Emprestimo retornarEmprestimo(Long id);

    List<Emprestimo> listarEmprestimos();

    /*UPDATE ???*/
    Emprestimo extenderPrazo(Long id, LocalDate dataNova);

    /*UPDATE ???*/
    Emprestimo devolverLivro(Long id);

    void excluirEmprestimo(Long id);




}
