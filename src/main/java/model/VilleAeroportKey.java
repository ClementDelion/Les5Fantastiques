package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class VilleAeroportKey implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id_ville")
	private Ville idVille;
	@ManyToOne
	@JoinColumn(name = "id_aeroport")
	private Aeroport idAeroport;

	public VilleAeroportKey() {

	}

	public Ville getIdVille() {
		return idVille;
	}

	public void setIdVille(Ville idVille) {
		this.idVille = idVille;
	}

	public Aeroport getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(Aeroport idAeroport) {
		this.idAeroport = idAeroport;
	}


}
