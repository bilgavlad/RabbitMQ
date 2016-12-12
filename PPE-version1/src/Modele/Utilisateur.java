package Modele;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity @Table(name = "Users")
public class Utilisateur {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_users;
	@OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
	private List<Role_Utilisateur> roles = new ArrayList<>(); 
	@Column(nullable= false, unique = true)
	private String email;
	@Column(nullable= false)
	private String nom;
	@Column(nullable= false)
	private String prenom;
	@Temporal(TemporalType.TIMESTAMP) @Column(nullable = false)
	private Date derniere_mise_a_jour;
	@Column(nullable = false)
	private String modifie_par;

	public void addRoleAction(Role_Utilisateur nouveau) {
		roles.add(nouveau);
		nouveau.setUtilisateur(this);
	}
	
	public Utilisateur() {
		super();
	}

	public Utilisateur(String email, String nom, String prenom, Date derniere_mise_a_jour, String modifie_par) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
	}

	public int getId_users() {
		return id_users;
	}

	public void setId_users(int id_users) {
		this.id_users = id_users;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDerniere_mise_a_jour() {
		return derniere_mise_a_jour;
	}

	public void setDerniere_mise_a_jour(Date derniere_mise_a_jour) {
		this.derniere_mise_a_jour = derniere_mise_a_jour;
	}

	public List<Role_Utilisateur> getRoles() {
		return roles;
	}

	public void setRoles(List<Role_Utilisateur> roles) {
		this.roles = roles;
	}

	public String getModifie_par() {
		return modifie_par;
	}

	public void setModifie_par(String modifie_par) {
		this.modifie_par = modifie_par;
	}

}
