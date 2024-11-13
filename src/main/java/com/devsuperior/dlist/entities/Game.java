package com.devsuperior.dlist.entities;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "game_year")
    private Integer year;
    private String genre;
    private String platform;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public Game(){
    }

    public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl, String shortDescription, String longDescription, Double score){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.imgUrl = imgUrl;
        this.longDescription = longDescription;
        this.year = year;
        this.platform = platform;
        this.shortDescription = shortDescription;
        this.score = score;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    //O método equals() é usado para comparar se dois objetos são "equivalentes" no sentido de seus valores, ou seja,
    // ele determina se dois objetos têm o mesmo conteúdo, independentemente de serem o mesmo objeto (referência) na memória.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    //O método hashCode() é usado para gerar um código hash (um número inteiro) único para cada objeto.
    // Esse valor é usado para otimizar a inserção e a busca em estruturas de dados baseadas em hash, como HashSet, HashMap e Hashtable.
    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
