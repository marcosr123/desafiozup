package br.marcosrichard.desafiozup.services;

import br.marcosrichard.desafiozup.modells.Response;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ComicMarvelApiServiceTest {

    @Autowired
    private ComicMarvelApiService comicMarvelApiService;

    @Test
    void deveRetornarUmaListaComic(){
      Response response = comicMarvelApiService.getCommic();

        assertThat(response)
                .isNotNull();
        assertThat(response.getData().getTotal())
                .isEqualTo(49335);
        assertThat(response.getData().getResults())
                .isNotEmpty();
    }
}