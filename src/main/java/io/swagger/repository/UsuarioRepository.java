package io.swagger.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import io.swagger.model.Usuario;

//@Transactional(readOnly = true)
@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Iterable<Usuario> findByEmail(String email);

}
