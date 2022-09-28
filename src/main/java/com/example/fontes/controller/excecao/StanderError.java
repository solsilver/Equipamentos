package com.example.fontes.controller.excecao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class StanderError {
    public Integer status;
    public String mensagem;
    public Long tempo;

}
