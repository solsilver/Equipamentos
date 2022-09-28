package com.example.fontes.controller.excecao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice

public class ResourceExceptionHandler {
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity <StanderError> badRequest400(BadRequestException b, HttpServletRequest request){
        StanderError e = new StanderError(HttpStatus.BAD_REQUEST.value(),"deu erro",System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
    }


}
