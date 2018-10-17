package io.swagger.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.threeten.bp.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.enums.PerfilEnum;
import lombok.Builder;
import lombok.Data;

/**
 * Usuario
 */
//@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-17T12:19:32.013Z")
@Data
@Builder
@Entity
public class Usuario {

	private static final String DATE_FORMAT = "yyyy-MM-dd";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	@NotNull
	private long id;

	@JsonProperty("nome")
	private String nome;

	@JsonProperty("email")
	private String email;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = DATE_FORMAT)
	private LocalDate dataNasc;

	@JsonProperty("status")
	private Boolean status;

	/**
	 * Gets or Sets perfil
	 */

//	private PerfilEnum perfil;

	@JsonProperty("perfil")
	private PerfilEnum perfil;

	public Usuario id(Integer id) {
		this.id = id;
		return this;
	}

	/**
	 * identificador do usuario
	 * 
	 * @return id
	 **/
	@ApiModelProperty(value = "identificador do usuario")

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Usuario nome(String nome) {
		this.nome = nome;
		return this;
	}

	/**
	 * Nome do usuario
	 * 
	 * @return nome
	 **/
	@ApiModelProperty(value = "Nome do usuario")

	@Size(min = 5, max = 100)
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Usuario email(String email) {
		this.email = email;
		return this;
	}

	/**
	 * E-mail do usuario
	 * 
	 * @return email
	 **/
	@ApiModelProperty(value = "E-mail do usuario")

	@Size(min = 10, max = 100)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Usuario dataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
		return this;
	}

	/**
	 * Data de aniversário do usuario.
	 * 
	 * @return dataNasc
	 **/
	@ApiModelProperty(value = "Data de aniversário do usuario.")

	@Valid

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Usuario status(Boolean status) {
		this.status = status;
		return this;
	}

	/**
	 * Status ativo ou inativo do usuario.
	 * 
	 * @return status
	 **/
	@ApiModelProperty(value = "Status ativo ou inativo do usuario.")

	public Boolean isStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Usuario perfil(PerfilEnum perfil) {
		this.perfil = perfil;
		return this;
	}

	/**
	 * Get perfil
	 * 
	 * @return perfil
	 **/
	@ApiModelProperty(value = "")

	public PerfilEnum getPerfil() {
		return perfil;
	}

	public void setPerfil(PerfilEnum perfil) {
		this.perfil = perfil;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Usuario usuario = (Usuario) o;
		return Objects.equals(this.id, usuario.id) && Objects.equals(this.nome, usuario.nome)
				&& Objects.equals(this.email, usuario.email) && Objects.equals(this.dataNasc, usuario.dataNasc)
				&& Objects.equals(this.status, usuario.status) && Objects.equals(this.perfil, usuario.perfil);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, email, dataNasc, status, perfil);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class Usuario {\n");

		sb.append("    id: ").append(toIndentedString(id)).append("\n");
		sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
		sb.append("    email: ").append(toIndentedString(email)).append("\n");
		sb.append("    dataNasc: ").append(toIndentedString(dataNasc)).append("\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
		sb.append("    perfil: ").append(toIndentedString(perfil)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces
	 * (except the first line).
	 */
	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
