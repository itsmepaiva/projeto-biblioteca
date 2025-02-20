package com.tibs.biblioteca.service.impl;

import com.tibs.biblioteca.DTO.UsersDTO;
import com.tibs.biblioteca.domain.Emprestimo;
import com.tibs.biblioteca.domain.Multa;
import com.tibs.biblioteca.domain.Users;
import com.tibs.biblioteca.repository.UsersRepository;
import com.tibs.biblioteca.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements IUsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users criarUsuarios(UsersDTO usersDTO) {
        Users user = new Users();
        user.setNome(usersDTO.getNome());
        user.setEmail(usersDTO.getEmail());
        user.setPapel(usersDTO.getPapel());
        return usersRepository.save(user);
    }

    @Override
    public Users retornarUser(Long id) {
        return usersRepository.findById(id).get();
    }

    @Override
    public List<Users> listarTodos() {
        return usersRepository.findAll();
    }

    @Override
    public void deletarUser(Long id) {
        usersRepository.deleteById(id);
    }

    @Override
    public List<Multa> listarMultasUsuario(Long id) {
        return List.of();
    }

    @Override
    public List<Emprestimo> listarEmprestimosUsuario(Long id) {
        return List.of();
    }
}
