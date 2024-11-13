package com.devsuperior.dlist.repositories;

import com.devsuperior.dlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

//<Tipo da entidade, tipo do id da entidade>
public interface GameRepository extends JpaRepository <Game, Long> {
}
