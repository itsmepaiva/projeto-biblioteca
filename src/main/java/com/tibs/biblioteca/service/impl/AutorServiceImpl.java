package com.tibs.biblioteca.service.impl;

import com.tibs.biblioteca.DTO.AutorDTO;
import com.tibs.biblioteca.domain.Autor;
import com.tibs.biblioteca.domain.Livro;
import com.tibs.biblioteca.interfaces.VerificadorCargo;
import com.tibs.biblioteca.repository.AutorRepository;
import com.tibs.biblioteca.service.IAutorService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AutorServiceImpl implements IAutorService {

    private final VerificadorCargo verificadorCargo;
    private final AutorRepository autorRepository;

    public AutorServiceImpl(VerificadorCargo verificadorCargo, AutorRepository autorRepository){
        this.autorRepository = autorRepository;
        this.verificadorCargo = verificadorCargo;
    }


    @Override
    public Autor adicionarAutor(Long userid, AutorDTO autorDTO) {
        if(!verificadorCargo.temPapel(userid)){
            throw new IllegalStateException("O usuário nao tem permissão para adicionar um livro novo");
        }
        Autor autor = new Autor();
        autor.setNome(autorDTO.getNome());
        autor.setNacionalidade(autorDTO.getNacionalidade());
        return autorRepository.save(autor);
    }

    @Override
    public Optional<Autor> retornarAutor(Long id) {
        return autorRepository.findById(id);
    }

    @Override
    public List<Livro> listarTodosLivrosDoAutor(Long id) {
        return List.of();
    }

    @Override
    public List<Autor> listarTodosAutores() {
        return autorRepository.findAll();
    }

    @Override
    public void deletarAutor(Long id) {

    }
}
