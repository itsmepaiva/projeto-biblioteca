package com.tibs.biblioteca.controller;

import com.tibs.biblioteca.DTO.UsersDTO;
import com.tibs.biblioteca.domain.Users;
import com.tibs.biblioteca.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private IUsersService usersService;

    @PostMapping
    public Users criarUsuario(@RequestBody UsersDTO usersDTO){
        return usersService.criarUsuarios(usersDTO);
    }

    @GetMapping("/{id}")
    public Users retornarUser(@PathVariable Long id){
        return usersService.retornarUser(id);
    }

    @GetMapping
    public List<Users> listarTodos(){
        return usersService.listarTodos();
    }

    @DeleteMapping
    public void deletarUser(@RequestParam Long id){
        usersService.deletarUser(id);
    }
}
