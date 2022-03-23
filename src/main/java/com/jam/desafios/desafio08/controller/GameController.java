package com.jam.desafios.desafio08.controller;

import com.jam.desafios.desafio08.dto.GameDto;
import com.jam.desafios.desafio08.entity.Game;
import com.jam.desafios.desafio08.service.GameService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/games")
public class GameController extends GenericController<Game, GameDto, Integer> {

    public GameController(GameService service) {
        super(service);
    }
}
