package com.example.fontes.controller.excecao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StanderError {
    public ValidationError(Integer status, String mensagem, LocalDateTime tempo) {
        super(status, mensagem, tempo);
    }
    private List<FieldMessage> fieldMessages = new ArrayList<>();
    public void addError(String fieldName, String message) {
        fieldMessages.add(new FieldMessage(fieldName, message));
    }
}
