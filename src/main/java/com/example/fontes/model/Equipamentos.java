package com.example.fontes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Equipamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "escreva o nome")
    @Size(min=1 , max=10 , message="troxa")
    private String nome;
    private String local;
    private Integer quantidade;
    private String codigo;
}
