package com.tibs.biblioteca.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_multas")
public class Multa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao = "Multa por atraso de devolução";

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    private Users users;

}
