package com.devsuperior.dlist.controllers;

import com.devsuperior.dlist.dto.GameDto;
import com.devsuperior.dlist.dto.GameMinDto;
import com.devsuperior.dlist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/games")
public class GameController {

    private final GameService gameService;

    @Autowired
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @GetMapping(value = "/{id}")
    public GameDto findById(@PathVariable Long id){
        GameDto result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDto> findAll(){
        List<GameMinDto> result = gameService.findAll();
        return result;
    }
}
