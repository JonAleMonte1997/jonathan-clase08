package com.jam.desafios.desafio08.entity;

import com.jam.desafios.desafio08.enums.Status;

public interface GenericEntity <DTO>{

    void setStatus(Status status);
    Status getStatus();

    void updateByDto(DTO dto);
}
