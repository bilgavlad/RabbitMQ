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

@Entity @Table(name = "role")
public class Role {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<Role_Utilisateur> role_users = new ArrayList<>();
	@OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
	private List<Role_action> role_actions = new ArrayList<>();
	@Column(nullable = false)
	private String role;
	@Temporal(TemporalType.TIMESTAMP) @Column(nullable = false)
	private Date derniere_mise_a_jour;
	@Column(nullable = false)
	private String modifie_par;
	@Column(nullable = false)
	private String description;

	public Role() {
		super();
	}

	public Role(int id_role, List<Role_Utilisateur> role_users, List<Role_action> role_actions, String role,
			Date derniere_mise_a_jour, String modifie_par, String description) {
		super();
		this.id_role = id_role;
		this.role_users = role_users;
		this.role_actions = role_actions;
		this.role = role;
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
		this.description = description;
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public List<Role_Utilisateur> getRole_users() {
		return role_users;
	}

	public void setRole_users(List<Role_Utilisateur> role_users) {
		this.role_users = role_users;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Role_action> getRole_actions() {
		return role_actions;
	}

	public void setRole_actions(List<Role_action> role_actions) {
		this.role_actions = role_actions;
	}

}
