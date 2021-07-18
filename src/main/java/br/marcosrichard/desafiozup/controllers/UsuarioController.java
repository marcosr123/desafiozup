package br.marcosrichard.desafiozup.controllers;

import br.marcosrichard.desafiozup.modells.Usuario;
import br.marcosrichard.desafiozup.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/usuario")
public class UsuarioController {
    private final UsuarioService usuarioService;

    @PostMapping("/cadastrar")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario){
        return usuarioService.saveUsuario(usuario);
    }
}
