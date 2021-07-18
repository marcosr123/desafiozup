package br.marcosrichard.desafiozup.repositories;

import br.marcosrichard.desafiozup.modells.Comics;
import org.springframework.data.repository.CrudRepository;

public interface ComicsRepository extends CrudRepository<Comics, Long> {
}
