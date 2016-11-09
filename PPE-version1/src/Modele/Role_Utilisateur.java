package Modele;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name = "Roles_Users")
public class Role_Utilisateur {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_roles_user;
	@ManyToOne @JoinColumn(name = "utlisateur_FK")
	private Utilisateur utilisateur;
	@ManyToOne @JoinColumn(name = "role_FK")
	private Role role;
	@Temporal(TemporalType.TIMESTAMP) @Column(nullable = false)
	private Date derniere_mise_a_jour;
	@Column(nullable = false)
	private String modifie_par;

	public Role_Utilisateur() {
		super();
	}

	public Role_Utilisateur(int id_roles_user, Utilisateur utilisateur, Role role, Date derniere_mise_a_jour,
			String modifie_par) {
		super();
		this.id_roles_user = id_roles_user;
		this.utilisateur = utilisateur;
		this.role = role;
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
	}

	public int getId_roles_user() {
		return id_roles_user;
	}

	public void setId_roles_user(int id_roles_user) {
		this.id_roles_user = id_roles_user;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Date getDerniere_mise_a_jour() {
		return derniere_mise_a_jour;
	}

	public void setDerniere_mise_a_jour(Date derniere_mise_a_jour) {
		this.derniere_mise_a_jour = derniere_mise_a_jour;
	}

	public String getModifie_par() {
		return modifie_par;
	}

	public void setModifie_par(String modifie_par) {
		this.modifie_par = modifie_par;
	}

}
