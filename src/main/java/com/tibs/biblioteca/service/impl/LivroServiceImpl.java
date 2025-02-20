package com.tibs.biblioteca.service.impl;

import com.tibs.biblioteca.DTO.LivroDTO;
import com.tibs.biblioteca.domain.Autor;
import com.tibs.biblioteca.domain.Livro;
import com.tibs.biblioteca.interfaces.VerificadorCargo;
import com.tibs.biblioteca.repository.AutorRepository;
import com.tibs.biblioteca.repository.LivroRepository;
import com.tibs.biblioteca.service.ILivroService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivroServiceImpl implements ILivroService {

    private final VerificadorCargo verificadorCargo;
    private final LivroRepository livroRepository;
    private final AutorRepository autorRepository;

    public LivroServiceImpl(VerificadorCargo verificadorCargo, LivroRepository livroRepository, AutorRepository autorRepository){
        this.verificadorCargo = verificadorCargo;
        this.livroRepository = livroRepository;
        this.autorRepository = autorRepository;
    }

    @Override
    public Livro adicionarLivro(Long userid, LivroDTO livroDTO) {
        if(!verificadorCargo.temPapel(userid)){
            throw new IllegalStateException("O usuário nao tem permissão para adicionar um livro novo");
        }
        Livro livro = new Livro();
        Autor autor = autorRepository.findByNome(livroDTO.getAutor());
        //TENTATIVA PRINCIPAL
        if(autor == null){
            throw new NullPointerException("O autor indicado nao existe no Banco de Dados, gentileza, verificar");
        }
        livro.setAutor(autor);
        livro.setTitulo(livroDTO.getTitulo());
        livro.setGenero(livroDTO.getGenero());
        livro.setDataLancamento(livroDTO.getDataLancamento());

        return livroRepository.save(livro);
        /*
        //TENTATIVA ALTERNATIVA
        if(autor_id != null){
            livro.serAutor(autor_id)
            return livroRepository.save(livro)
        }
         */
    }

    @Override
    public Livro retornarLivro(Long id) {
        return null;
    }

    @Override
    public List<Livro> listarTodosLivros() {
        return livroRepository.findAll();
    }

    @Override
    public List<Livro> listarLivrosDisponiveis(Boolean disponivel) {
        return List.of();
    }

    @Override
    public List<Livro> listarLivrosAlugados(Boolean alugados) {
        return List.of();
    }

    @Override
    public void deletarLivro(Long userid, Long id) {
        if (!verificadorCargo.temPapel(userid)) {
            throw new IllegalStateException("O usuário nao tem permissão para excluir o livro!");
        }
        if (!livroRepository.findAlugadoById(id)) {
            throw new IllegalStateException("O livro nao pode ser excluido, está alugado!");
        }
        livroRepository.deleteById(id);
    }
}
