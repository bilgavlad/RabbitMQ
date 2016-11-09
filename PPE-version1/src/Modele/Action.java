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

@Entity @Table(name = "action")
public class Action {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_action;
	@OneToMany(mappedBy = "action", cascade = CascadeType.ALL)
	private List<Role_action> role_actions = new ArrayList<>();
	@Column(nullable = false)
	private String action;
	@Temporal(TemporalType.TIMESTAMP) @Column(nullable = false)
	private Date derniere_mise_a_jour;
	@Column(nullable = false)
	private String modifie_par;
	@Column(nullable = false)
	private String description;
	
	public void addRoleAction(Role_action nouveau) {
		role_actions.add(nouveau);
		nouveau.setAction(this);
	}

	public Action() {
		super();
	}

	public Action(String action, Date derniere_mise_a_jour, String modifie_par, String description) {
		super();
		this.action = action;
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
		this.description = description;
	}

	public int getId_action() {
		return id_action;
	}

	public void setId_action(int id_action) {
		this.id_action = id_action;
	}

	public List<Role_action> getRole_actions() {
		return role_actions;
	}

	public void setRole_actions(List<Role_action> role_actions) {
		this.role_actions = role_actions;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
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

}
