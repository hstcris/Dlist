package com.devsuperior.dlist.controllers;

import com.devsuperior.dlist.entities.Game;
import com.devsuperior.dlist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameService.findAll();
        return result;
    }
}
