package com.jam.desafios.desafio08.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ExceptionResponse {

    private int status;

    private Date timestamp;

    private String message;
}
