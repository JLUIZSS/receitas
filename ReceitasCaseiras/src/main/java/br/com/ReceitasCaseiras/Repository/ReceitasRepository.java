package br.com.ReceitasCaseiras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ReceitasCaseiras.model.ReceitasModel;
	
	@Repository
	public interface ReceitasRepository extends JpaRepository<ReceitasModel, Long>{

	}

