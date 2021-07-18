package br.marcosrichard.desafiozup.repositories;

import br.marcosrichard.desafiozup.modells.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByNome(String nome);
}
