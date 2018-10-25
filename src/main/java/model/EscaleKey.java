package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class EscaleKey implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id_vol")
	private Vol idVol;
	@ManyToOne
	@JoinColumn(name = "id_aeroport")
	private Aeroport idAeroport;
	
	public EscaleKey() {
		
	}

	public Vol getIdVol() {
		return idVol;
	}

	public void setIdVol(Vol idVol) {
		this.idVol = idVol;
	}

	public Aeroport getIdAeroport() {
		return idAeroport;
	}

	public void setIdAeroport(Aeroport idAeroport) {
		this.idAeroport = idAeroport;
	}
}
