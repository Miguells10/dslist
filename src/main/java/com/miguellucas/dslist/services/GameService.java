package com.miguellucas.dslist.services;

import java.util.*;

import com.miguellucas.dslist.dto.GameDTO;
import com.miguellucas.dslist.dto.GameMinDTO;
import com.miguellucas.dslist.entities.Game;
import com.miguellucas.dslist.projections.GameMinProjection;
import com.miguellucas.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;


    public GameDTO findById(Long id){
       Game result = gameRepository.findById(id).get();
       return new GameDTO(result);
    }

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }

}
