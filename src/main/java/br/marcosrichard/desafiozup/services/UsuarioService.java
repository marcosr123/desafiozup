package br.marcosrichard.desafiozup.services;

import br.marcosrichard.desafiozup.modells.Usuario;
import br.marcosrichard.desafiozup.repositories.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario saveUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

}
