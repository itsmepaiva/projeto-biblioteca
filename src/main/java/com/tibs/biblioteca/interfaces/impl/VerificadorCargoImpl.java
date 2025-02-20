package com.tibs.biblioteca.interfaces.impl;

import com.tibs.biblioteca.domain.Users;
import com.tibs.biblioteca.interfaces.VerificadorCargo;
import com.tibs.biblioteca.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificadorCargoImpl implements VerificadorCargo {

    @Autowired
    private UsersRepository userRepository;

    @Override
    public Boolean temPapel(Long userId) {
        Users user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        String cargo = user.getPapel().name();
        return cargo == "BIBLIOTECARIO";
    }
}
