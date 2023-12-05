import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doces",schema = "receitas_caseiras")

public class DocesModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "receita_doces")
	private String doces;

	public String getDoces() {
		return doces;
	}

	public void setDoces(String doces) {
		this.doces = doces;
	}

	
	

}