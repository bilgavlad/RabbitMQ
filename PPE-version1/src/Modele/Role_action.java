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

@Entity @Table(name = "role_action")
public class Role_action {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role_action;
	@ManyToOne @JoinColumn(name = "role_FK")
	private Role role;
	@ManyToOne @JoinColumn(name = "action_FK")
	private Action action;
	@Temporal(TemporalType.TIMESTAMP) @Column(nullable = false)
	private Date derniere_mise_a_jour;
	@Column(nullable = false)
	private String modifie_par;

	public Role_action() {
		super();
	}

	public Role_action(Date derniere_mise_a_jour, String modifie_par) {
		super();
		this.derniere_mise_a_jour = derniere_mise_a_jour;
		this.modifie_par = modifie_par;
	}

	public int getId_role_action() {
		return id_role_action;
	}

	public void setId_role_action(int id_role_action) {
		this.id_role_action = id_role_action;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
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

}
