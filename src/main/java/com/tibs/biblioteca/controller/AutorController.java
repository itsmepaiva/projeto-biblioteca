package com.tibs.biblioteca.controller;

import com.tibs.biblioteca.DTO.AutorDTO;
import com.tibs.biblioteca.domain.Autor;
import com.tibs.biblioteca.service.IAutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autor")
public class AutorController {

    @Autowired
    private IAutorService autorService;

    @GetMapping
    public List<Autor> listarAutores(){
        return autorService.listarTodosAutores();
    }

    @GetMapping("/{id}")
    public Optional<Autor> listarAutor(@PathVariable Long id){
        return autorService.retornarAutor(id);
    }

    @PostMapping
    public Autor adicionarAutor(@RequestBody Long userid, AutorDTO autorDTO){
        return autorService.adicionarAutor(userid, autorDTO);
    }
}
