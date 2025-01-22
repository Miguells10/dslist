package com.miguellucas.dslist.repositories;

import com.miguellucas.dslist.entities.Game;
import com.miguellucas.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository  extends JpaRepository<GameList, Long> {
}
