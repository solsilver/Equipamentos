package com.example.fontes.controller.excecao;

public class DuplicatedObjectException extends RuntimeException {
    public DuplicatedObjectException(String message) {
        super(message);
    }
}
