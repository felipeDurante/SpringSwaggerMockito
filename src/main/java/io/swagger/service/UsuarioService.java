package io.swagger.service;

import org.springframework.http.ResponseEntity;

import io.swagger.model.Usuario;

public interface UsuarioService {

	ResponseEntity<Usuario> gravarUsuario(Usuario usuario);

	Iterable<Usuario> findByEmail(String email);
}
