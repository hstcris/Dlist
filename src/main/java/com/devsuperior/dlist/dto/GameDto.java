package com.devsuperior.dlist.dto;


import com.devsuperior.dlist.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDto {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDto(){

    }

    public GameDto(Game entity){
        BeanUtils.copyProperties(entity, this);
    }
}
