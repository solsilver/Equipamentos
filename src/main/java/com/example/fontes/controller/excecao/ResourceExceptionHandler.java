package com.example.fontes.controller.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@ControllerAdvice

public class ResourceExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<StanderError> badRequest400(BadRequestException b, HttpServletRequest request) {
        StanderError e = new StanderError(HttpStatus.BAD_REQUEST.value(), "deu erro", LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
    }

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StanderError> objectNotFoundException404(ObjectNotFoundException b, HttpServletRequest request) {
        StanderError e = new StanderError(HttpStatus.NOT_FOUND.value(), b.getMessage(),LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e);
    }

    @ExceptionHandler(DuplicatedObjectException.class)
    public ResponseEntity<StanderError> duplicatedObjectException(DuplicatedObjectException b, HttpServletRequest request) {
        StanderError e = new StanderError(HttpStatus.BAD_REQUEST.value(), b.getMessage(),LocalDateTime.now(ZoneId.of("America/Sao_Paulo")));
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
    }


}
