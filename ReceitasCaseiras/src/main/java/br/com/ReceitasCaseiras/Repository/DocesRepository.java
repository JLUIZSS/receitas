package br.com.ReceitasCaseiras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ReceitasCaseiras.model.DoceModel;
	
	@Repository
	public interface DocesRepository extends JpaRepository<DocesModel, Long>{

	}

