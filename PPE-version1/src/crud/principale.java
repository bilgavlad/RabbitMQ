package crud;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modele.Action;
import Modele.Role;
import Modele.Role_Utilisateur;
import Modele.Role_action;
import Modele.Utilisateur;

public class principale {

	public static void main (String[] args) throws ParseException {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("titi");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		
		SimpleDateFormat sdf = new SimpleDateFormat("y/M/d");
		
		Utilisateur steven= new Utilisateur("steven@test.fr", "DE CARVALHO", "Steven", sdf.parse("2010/01/01") , "Steven");
		Utilisateur soufian= new Utilisateur("soufian@test.fr", "AIT TIRITE", "Soufian", new Date(), "Steven");
		Utilisateur jerome= new Utilisateur("jerome@test.fr", "JOUET", "Jerome", new Date(), "Steven");
		Utilisateur elie= new Utilisateur("elie@test.fr", "ABOU HAYDAR", "Elie", new Date(), "Steven");
		
		Role admin= new Role("Administrateur", sdf.parse("2010/01/01"), "Steven", "TOUS LES DROITS");
		Role magasin= new Role("Magasin", new Date(), "Steven", "Annonce et vendre une guitare");
		Role particulier= new Role("Particulier", new Date(), "Steven", "Utilise la plateforme");
		
		Action consultation= new Action("", derniere_mise_a_jour, modifie_par, description)
		
		Action creation= new Action("Créer une section", new Date(), "Steven", "");
		Action ajout= new Action("Ajouter une annonce", new Date(), "Steven", "");
		Action edit= new Action("Editer une annonce", new Date(), "Steven", "");
		Action suppr= new Action("Supprimer une annonce", new Date(), "Steven", "");
		Action ban= new Action("Bannir un client", new Date(), "Steven", "");
		
		Role_Utilisateur ra1= new Role_Utilisateur(new Date(), "Steven");
		
		administrateur.addRoleUtilisateur(ra1);
		
		
		em.persist(steven);
		em.persist(soufian);
		
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
