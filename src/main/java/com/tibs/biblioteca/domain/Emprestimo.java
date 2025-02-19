package com.tibs.biblioteca.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataEmprestimo;

    private LocalDate dataFinal;

    private Boolean devolvido;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "livro_id")
    private Livro livro;
}
