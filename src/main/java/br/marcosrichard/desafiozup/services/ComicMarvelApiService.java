package br.marcosrichard.desafiozup.services;

import br.marcosrichard.desafiozup.modells.Comics;
import br.marcosrichard.desafiozup.modells.Response;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url="https://gateway.marvel.com:443/v1/public/",name="marvel")
public interface ComicMarvelApiService {

    String apikey = "0baa52fdc4db2de332a334c079470c08&hash=84fa6e36a685730e6c40ddb8aa1892e2&ts=10";

    @GetMapping("comics?apikey="+apikey)
    Page<List<Comics>> salvaComic();

    @GetMapping("comics?apikey="+apikey)
    Response getCommic();

}
