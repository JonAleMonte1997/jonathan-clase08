package com.jam.desafios.desafio08.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.persistence.EntityNotFoundException;
import java.util.Date;

@ControllerAdvice
public class GameExceptionHandler {

    @ResponseBody
    @ExceptionHandler(EntityNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    ExceptionResponse gameEntityNotFoundExceptionHandler(EntityNotFoundException ex) {

        return new ExceptionResponse(404, new Date(), "Juego no encontrado");
    }
}
