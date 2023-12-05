package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios",schema = "receitas_caseiras")

public class UsuariosModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_usuarios")
	private String idusuarios;
	
	@Column(name = "endereço_email")
	private String email;
	
	@Column(name = "senha")
	private Integer senha;

	public String getIdusuarios() {
		return idusuarios;
	}

	public void setIdusuarios(String idusuarios) {
		this.idusuarios = idusuarios;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	
	

}
