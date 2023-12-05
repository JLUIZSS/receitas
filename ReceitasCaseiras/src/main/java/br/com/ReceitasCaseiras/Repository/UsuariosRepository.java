package br.com.ReceitasCaseiras.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ReceitasCaseiras.model.UsuariosModel;
	
	@Repository
	public interface UsuariosRepository extends JpaRepository<UsuariosModel, Long>{

	}

