package com.jam.desafios.desafio08.dto;

import com.jam.desafios.desafio08.entity.Game;
import com.jam.desafios.desafio08.enums.Status;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GameDto implements GenericDto<Game> {

    private String title;

    private String gender;

    @Override
    public Game toEntity() {

        Game game = new Game();

        game.setTitle(this.title);
        game.setGender(this.gender);
        game.setStatus(Status.ENABLED);

        return game;
    }
}
