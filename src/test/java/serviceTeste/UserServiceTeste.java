package serviceTeste;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import io.swagger.model.Usuario;
import io.swagger.repository.UsuarioRepository;
import io.swagger.service.impl.UsuarioServiceImpl;

@RunWith(SpringRunner.class)
public class UserServiceTeste {

	@Mock
	UsuarioRepository usuarioRepository;

	@InjectMocks
	UsuarioServiceImpl usuarioService;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void contextLoaded() {

	}

	@Test
	public void list() {
		// Given
//		org.threeten.bp.LocalDate homemNoSpaco = org.threeten.bp.LocalDate.now();
//		when(usuarioRepository.findAll()).thenReturn(Arrays.asList(Usuario.builder().dataNasc(null)).build(),
//				Usuario.builder().build(), Usuario.builder().build()));
//			
//					// When
//		Iterable<Usuario> response = usuarioRepository.findAll();
//		List<Usuario> list = new ArrayList<Usuario>();
//		response.forEach(list::add);
//
//		// Then
//		assertEquals(3, list.size());
	}

	// TODO more unit tests
}
