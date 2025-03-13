package com.modulo.tallerPracticoModulo.Service;


import com.modulo.tallerPracticoModulo.Entidad.Usuario;
import com.modulo.tallerPracticoModulo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void saveUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }

    public Optional<Usuario> findByUsername(String username) {
        return usuarioRepository.findByUsername(username);
    }
}
