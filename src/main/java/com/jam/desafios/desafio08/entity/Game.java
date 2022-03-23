package com.jam.desafios.desafio08.entity;

import com.jam.desafios.desafio08.enums.Status;
import com.jam.desafios.desafio08.dto.GameDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Game implements GenericEntity<GameDto>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String gender;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Override
    public void updateByDto(GameDto gameDto) {

        this.title = gameDto.getTitle();
        this.gender = gameDto.getGender();
    }
}
