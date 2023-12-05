package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "salgados",schema = "receitas_caseiras")

public class SalgadosModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "receita_salgados")
	private String salgados;

	public String getSalgados() {
		return salgados;
	}

	public void setSalgados(String salgados) {
		this.salgados = salgados;
	}
	

}

