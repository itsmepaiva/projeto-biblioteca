package com.tibs.biblioteca.DTO;

import com.tibs.biblioteca.domain.enums.Genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LivroDTO {
    private String titulo;
    private LocalDate dataLancamento;
    private Genero genero;
    private String autor;
}
