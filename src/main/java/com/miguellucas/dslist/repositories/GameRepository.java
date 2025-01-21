package com.miguellucas.dslist.repositories;

import com.miguellucas.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
