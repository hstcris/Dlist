package com.devsuperior.dlist.repositories;

import com.devsuperior.dlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
