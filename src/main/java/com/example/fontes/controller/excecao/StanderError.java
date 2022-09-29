package com.example.fontes.controller.excecao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class StanderError {
    public Integer status;
    public String mensagem;
    public LocalDateTime tempo;

}
