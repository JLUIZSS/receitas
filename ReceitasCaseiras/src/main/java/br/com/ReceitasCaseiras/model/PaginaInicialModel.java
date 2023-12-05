package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paginainicial",schema = "receitas_caseiras")

public class PaginaInicialModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "nome")
	private String nome ;
	
	@Column(name = "categoria")
	private String categoria ;
	
	@Column(name = "cadastro")
	private String cadastro ;

	@Column(name = "sobrenos")
	private String sobrenos ;

	@Column(name = "contato")
	private String contato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public String getSobrenos() {
		return sobrenos;
	}

	public void setSobrenos(String sobrenos) {
		this.sobrenos = sobrenos;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}


}
