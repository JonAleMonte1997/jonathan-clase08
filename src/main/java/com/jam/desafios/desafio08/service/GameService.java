package com.jam.desafios.desafio08.service;

import com.jam.desafios.desafio08.dto.GameDto;
import com.jam.desafios.desafio08.entity.Game;
import com.jam.desafios.desafio08.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class GameService extends GenericService<Game, GameDto, Integer> {

    public GameService(GameRepository repository) {
        super(repository);
    }
}
