///**
// * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
// * https://github.com/swagger-api/swagger-codegen
// * Do not edit the class manually.
// */
//package io.swagger.api;
//
//import javax.validation.Valid;
//
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
//import io.swagger.model.Usuario;
//@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T12:19:32.013Z")
//
//@Api(value = "usuario", description = "the usuario API")
//public interface UsuarioApi {
//
//    @ApiOperation(value = "Altera um usuário existente", nickname = "alteraUsuario", notes = "Essa operação tem por definição alterar um usuário previamente cadastrado", response = Usuario.class, tags={ "Gerenciamento", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 202, message = "Usuário alterado com sucesso", response = Usuario.class),
//        @ApiResponse(code = 400, message = "Alteraçãp inválida"),
//        @ApiResponse(code = 401, message = "Acesso não autorizado"),
//        @ApiResponse(code = 500, message = "Erro interno ao alterar usuário") })
//    @RequestMapping(value = "/usuario/{id}",
//        produces = { "application/json" }, 
//        consumes = { "application/json" },
//        method = RequestMethod.PUT)
//    ResponseEntity<Usuario> alteraUsuario(@ApiParam(value = "id do usuário",required=true) @PathVariable("id") Integer id,@ApiParam(value = ""  )  @Valid @RequestBody Usuario usuario);
//
//
//    @ApiOperation(value = "Cadastro de um novo usuario", nickname = "cadastraNovoUsuario", notes = "Efetua o cadastro do usuario", response = Usuario.class, tags={ "Cadastro", })
//    @ApiResponses(value = { 
//        @ApiResponse(code = 201, message = "Sucesso ao cadastrar novo usuario", response = Usuario.class),
//        @ApiResponse(code = 400, message = "Cadastro inválido"),
//        @ApiResponse(code = 401, message = "Cadastro não autorizado") })
//    @RequestMapping(value = "/usuario",
//        produces = { "application/json" }, 
//        consumes = { "application/json" },
//        method = RequestMethod.POST)
//    ResponseEntity<Usuario> cadastraNovoUsuario(@ApiParam(value = ""  )  @Valid @RequestBody Usuario cliente);
//
//}
