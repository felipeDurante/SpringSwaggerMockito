package io.swagger.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import io.swagger.exception.CadastroException;
import io.swagger.model.Usuario;
import io.swagger.repository.UsuarioRepository;
import io.swagger.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private UsuarioRepository repo;

	@Override
	public ResponseEntity<Usuario> gravarUsuario(Usuario usuario) {
		try {
			Usuario usu = repo.save(usuario);

			return new ResponseEntity<Usuario>(usu,
					usu != null ? HttpStatus.CREATED : HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (RuntimeException e) {
			throw new CadastroException("Não foi possível gravar o usuário. Verifique os dados");
		}
	}

	@Override
	public Iterable<Usuario> findByEmail(String email) {
		return repo.findByEmail(email);
	}

}
