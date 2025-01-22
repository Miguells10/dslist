package com.miguellucas.dslist.controlers;

import com.miguellucas.dslist.dto.GameDTO;
import com.miguellucas.dslist.dto.GameMinDTO;
import com.miguellucas.dslist.entities.Game;
import com.miguellucas.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameControler {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById( @PathVariable Long id){
        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping
    public List<GameMinDTO> findall(){
        List<GameMinDTO> result = gameService.findAll();
        return result;

    }

}
