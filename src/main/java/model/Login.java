package model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@SequenceGenerator(name="SeqLogin",sequenceName="seq_login",initialValue=10,allocationSize = 1)
@Table(name="Login")

public class Login {
	@Id
	@GeneratedValue(generator="SeqLogin",strategy=GenerationType.SEQUENCE)
	Integer id_login;
	@Column(name="identifiant")
	String login;
	@Column(name="mot_de_passe")
	String motDePasse;
	@Column(name="droit_administrateur")
	Boolean admin_id;
	@Version
	int version;
	
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Login(String login, String motDePasse) {
		super();
		this.login = login;
		this.motDePasse = motDePasse;
	}



	public Integer getId_login() {
		return id_login;
	}
	public void setId_login(Integer id_login) {
		this.id_login = id_login;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public Boolean getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(Boolean admin_id) {
		this.admin_id = admin_id;
	}
	public int getVersion() {
		return version;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_login == null) ? 0 : id_login.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (id_login == null) {
			if (other.id_login != null)
				return false;
		} else if (!id_login.equals(other.id_login))
			return false;
		return true;
	}	
}
