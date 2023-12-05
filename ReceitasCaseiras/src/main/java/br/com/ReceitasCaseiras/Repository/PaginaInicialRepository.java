package br.com.ReceitasCaseiras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ReceitasCaseiras.model.PaginaInicialModel;
	
	@Repository
	public interface PaginaInicialRepository extends JpaRepository<PaginaInicialModel, Long>{

	

	}

