package model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class CompagnieVolKey implements Serializable {
	@ManyToOne
	@JoinColumn(name = "id_compagnie")
	private Compagnie idcompagnie;
	@ManyToOne
	@JoinColumn(name = "id_compagnie")
	private Vol idvol;

	public CompagnieVolKey() {

	}

	public Compagnie getIdcompagnie() {
		return idcompagnie;
	}

	public void setIdcompagnie(Compagnie idcompagnie) {
		this.idcompagnie = idcompagnie;
	}
	public Vol getIdvol() {
		return idvol;
	}
	public void setIdvol(Vol idvol) {
		this.idvol = idvol;
	}


}
