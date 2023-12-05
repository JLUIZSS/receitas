package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "receitas",schema = "receitas_caseiras")

public class ReceitasModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_receitas")
	private Integer idreceitas;
	
	@Column(name = "nome_receitas")
	private String nome;
	
	@Column(name = "lista_ingredientes")
	private String lista;

	@Column(name = "introducao_preparo")
	private String preparo;

	public Integer getIdreceitas() {
		return idreceitas;
	}

	public void setIdreceitas(Integer idreceitas) {
		this.idreceitas = idreceitas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLista() {
		return lista;
	}

	public void setLista(String lista) {
		this.lista = lista;
	}

	public String getPreparo() {
		return preparo;
	}

	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}

	
	

}

