package com.devsuperior.dlist.controllers;

import com.devsuperior.dlist.dto.GameListDto;
import com.devsuperior.dlist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDto> findAll() {
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

}
