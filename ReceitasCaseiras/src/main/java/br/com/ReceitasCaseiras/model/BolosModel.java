package br.com.ReceitasCaseiras.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bolos",schema = "receitas_caseiras")

public class BolosModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "receita_bolos")
	private String bolos;

	public String getBolos() {
		return bolos;
	}

	public void setBolos(String bolos) {
		this.bolos = bolos;
	}
	

}
