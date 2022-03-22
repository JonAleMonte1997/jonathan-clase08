package com.jam.desafios.desafio08.entity;

public interface GenericEntity <DTO>{

    void setState(boolean state);
    boolean getState();

    void updateByDto(DTO dto);
}
