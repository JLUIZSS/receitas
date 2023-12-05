package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria",schema = "receitas_caseiras")

public class CategoriaModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id_categoria")
	private Long idcategoria;
	
	@Column(name = "nome_categoria")
	private Long nomecategoria;
	
	@Column(name = "descrição_categoria")
	private Long descriçãocategoria;

	public Long getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(Long idcategoria) {
		this.idcategoria = idcategoria;
	}

	public Long getNomecategoria() {
		return nomecategoria;
	}

	public void setNomecategoria(Long nomecategoria) {
		this.nomecategoria = nomecategoria;
	}

	public Long getDescriçãocategoria() {
		return descriçãocategoria;
	}

	public void setDescriçãocategoria(Long descriçãocategoria) {
		this.descriçãocategoria = descriçãocategoria;
	}
	

}
