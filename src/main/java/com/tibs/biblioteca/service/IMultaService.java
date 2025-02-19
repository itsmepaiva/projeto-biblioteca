package com.tibs.biblioteca.service;

import com.tibs.biblioteca.domain.Multa;

import java.util.List;

public interface IMultaService {
    Multa adicionarMulta(Multa multa);

    List<Multa> listarMultas();

    Multa retornarMulta(Long id);

    void deletarMulta(Long id);

    Boolean verificarExpiracao(Long id);

}
