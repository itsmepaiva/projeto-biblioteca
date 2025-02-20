package com.tibs.biblioteca.controller;

import com.tibs.biblioteca.DTO.LivroDTO;
import com.tibs.biblioteca.domain.Livro;
import com.tibs.biblioteca.service.ILivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private ILivroService livroService;

    @PostMapping
    public Livro adicionarLivro(@RequestBody Long userId, LivroDTO livroDTO){
        return livroService.adicionarLivro(userId, livroDTO);
    }

    @GetMapping
    public List<Livro> listarLivros(){
        return livroService.listarTodosLivros();
    }
}
