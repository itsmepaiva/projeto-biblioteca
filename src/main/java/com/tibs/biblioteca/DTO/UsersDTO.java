package com.tibs.biblioteca.DTO;

import com.tibs.biblioteca.domain.enums.Papel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsersDTO {
    private String nome;
    private String email;
    private Papel papel;
}
