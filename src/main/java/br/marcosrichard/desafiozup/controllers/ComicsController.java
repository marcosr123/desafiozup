package br.marcosrichard.desafiozup.controllers;

import br.marcosrichard.desafiozup.modells.Comics;
import br.marcosrichard.desafiozup.services.ComicsService;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/v1/comics")
public class ComicsController {
    private final ComicsService comicsService;

    public ComicsController(ComicsService comicsService) {
        this.comicsService = comicsService;
    }

    @GetMapping(produces = "application/json;charset=utf-8")
    public Set<Comics> cadastrarComic(){
        return comicsService.cadastrarComics();
    }
}
