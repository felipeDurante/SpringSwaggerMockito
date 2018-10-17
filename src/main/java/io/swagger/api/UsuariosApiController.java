//package io.swagger.api;
//
//import io.swagger.model.Usuarios;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import io.swagger.annotations.*;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestPart;
//import org.springframework.web.multipart.MultipartFile;
//
//import javax.validation.constraints.*;
//import javax.validation.Valid;
//import javax.servlet.http.HttpServletRequest;
//import java.io.IOException;
//import java.util.List;
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T12:19:32.013Z")
//
//@Controller
//public class UsuariosApiController implements UsuariosApi {
//
//    private static final Logger log = LoggerFactory.getLogger(UsuariosApiController.class);
//
//    private final ObjectMapper objectMapper;
//
//    private final HttpServletRequest request;
//
//    @org.springframework.beans.factory.annotation.Autowired
//    public UsuariosApiController(ObjectMapper objectMapper, HttpServletRequest request) {
//        this.objectMapper = objectMapper;
//        this.request = request;
//    }
//
//    public ResponseEntity<Usuarios> consultaTodos() {
//        String accept = request.getHeader("Accept");
//        if (accept != null && accept.contains("application/json")) {
//            try {
//                return new ResponseEntity<Usuarios>(objectMapper.readValue("\"\"", Usuarios.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<Usuarios>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
//        }
//
//        return new ResponseEntity<Usuarios>(HttpStatus.NOT_IMPLEMENTED);
//    }
//
//}
