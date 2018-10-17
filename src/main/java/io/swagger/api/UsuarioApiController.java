//package io.swagger.api;
//
//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.Valid;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import io.swagger.annotations.ApiParam;
//import io.swagger.model.Usuario;
//
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T12:19:32.013Z")
//
//@Controller
//public class UsuarioApiController implements UsuarioApi {
//
//	private static final Logger log = LoggerFactory.getLogger(UsuarioApiController.class);
//
//	private final ObjectMapper objectMapper;
//
//	private final HttpServletRequest request;
//
//	@org.springframework.beans.factory.annotation.Autowired
//	public UsuarioApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//		this.objectMapper = objectMapper;
//		this.request = request;
//	}
//
//	public ResponseEntity<Usuario> alteraUsuario(
//			@ApiParam(value = "id do usuário", required = true) @PathVariable("id") Integer id,
//			@ApiParam(value = "") @Valid @RequestBody Usuario usuario) {
//		String accept = request.getHeader("Accept");
//		if (accept != null && accept.contains("application/json")) {
//			try {
//				return new ResponseEntity<Usuario>(objectMapper.readValue(
//						"{  \"dataNasc\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"email\" : \"email\",  \"status\" : true,  \"perfil\" : \"ROLE_ADMIN\"}",
//						Usuario.class), HttpStatus.NOT_IMPLEMENTED);
//			} catch (IOException e) {
//				log.error("Couldn't serialize response for content type application/json", e);
//				return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//		}
//
//		return new ResponseEntity<Usuario>(HttpStatus.NOT_IMPLEMENTED);
//	}
//
//	public ResponseEntity<Usuario> cadastraNovoUsuario(@ApiParam(value = "") @Valid @RequestBody Usuario cliente) {
//		String accept = request.getHeader("Accept");
//		if (accept != null && accept.contains("application/json")) {
//			try {
//				return new ResponseEntity<Usuario>(objectMapper.readValue(
//						"{  \"dataNasc\" : \"2000-01-23\",  \"nome\" : \"nome\",  \"id\" : 0,  \"email\" : \"email\",  \"status\" : true,  \"perfil\" : \"ROLE_ADMIN\"}",
//						Usuario.class), HttpStatus.NOT_IMPLEMENTED);
//			} catch (IOException e) {
//				log.error("Couldn't serialize response for content type application/json", e);
//				return new ResponseEntity<Usuario>(HttpStatus.INTERNAL_SERVER_ERROR);
//			}
//		}
//
//		return new ResponseEntity<Usuario>(HttpStatus.NOT_IMPLEMENTED);
//	}
//
//}
