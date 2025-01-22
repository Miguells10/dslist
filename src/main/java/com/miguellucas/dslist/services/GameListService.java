package com.miguellucas.dslist.services;


import com.miguellucas.dslist.dto.GameListDTO;
import com.miguellucas.dslist.entities.GameList;
import com.miguellucas.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;


    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }
}