package com.tibs.biblioteca.service;

import com.tibs.biblioteca.domain.Emprestimo;
import com.tibs.biblioteca.domain.Multa;
import com.tibs.biblioteca.domain.Users;

import java.util.List;

public interface IUsersService {
    Users criarUsuarios(Users users);

    Users retornarUser(Long id);

    List<Users> listarTodos();

    /*
    Users update (Long id);

    List<Emprestimo> listarLivrosAlugados(???);
    */

    void deletarUser(Long id);

    List<Multa> listarMultasUsuario(Long id);

    List<Emprestimo> listarEmprestimosUsuario(Long id);


}
