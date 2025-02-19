package com.tibs.biblioteca.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tibs.biblioteca.domain.enums.Papel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tb_users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    @Enumerated(EnumType.STRING)
    private Papel papel;

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Emprestimo> emprestimos = new ArrayList<>();

    @OneToMany(mappedBy = "users", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<Multa> multas = new ArrayList<>();


}
