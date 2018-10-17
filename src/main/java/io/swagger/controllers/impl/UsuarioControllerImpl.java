package io.swagger.controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.controllers.IUsuarioController;
import io.swagger.exception.CadastroException;
import io.swagger.model.Usuario;
import io.swagger.repository.UsuarioRepository;
import io.swagger.service.UsuarioService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UsuarioControllerImpl implements IUsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@Autowired
	UsuarioRepository rep;

	@Override
	public ResponseEntity<Usuario> alteraUsuario(Integer id, Usuario usuario) {

		Usuario oldUsu = rep.findOne(new Long(id));
		if (oldUsu != null) {
			oldUsu = usuario;
			oldUsu = rep.save(oldUsu);
			return new ResponseEntity<Usuario>(oldUsu, HttpStatus.ACCEPTED);
		}

		throw new CadastroException("Não foi possível gravar o usuário. Verifique os dados");
	}

	@Override
	public ResponseEntity<Usuario> cadastraNovoUsuario(Usuario usuario) {
		return usuarioService.gravarUsuario(usuario);
	}
}
