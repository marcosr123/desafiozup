package br.marcosrichard.desafiozup.services;

import br.marcosrichard.desafiozup.modells.Comics;
import br.marcosrichard.desafiozup.repositories.ComicsRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ComicsService {
    private final ComicsRepository comicsRepository;
    private final ComicMarvelApiService comicMarvelApiService;

    public ComicsService(ComicsRepository comicsRepository, ComicMarvelApiService comicMarvelApiService) {
        this.comicsRepository = comicsRepository;
        this.comicMarvelApiService = comicMarvelApiService;
    }

    public Set<Comics> cadastrarComics() {
        Set<Comics> set = new HashSet<>(
                comicMarvelApiService.getCommic().getData().getResults()
        );
        comicsRepository.saveAll(set);
        return set;
    }
}
