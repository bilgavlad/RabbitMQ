package crud;

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

	public static void main (String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("titi");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		
		/*Utilisateur u1= new Utilisateur("test@hotmail.fr", "test", "steven", new Date(), "steven");
		Action a1= new Action("supprimer une annonce", new Date(), "Steven", "Parpeint à gogo !");
		Role r1= new Role("Admin", new Date(), "Steven", "C'est moi le papa !");
		
		Role_Utilisateur ru1= new Role_Utilisateur(new Date(), "Steven");
		Role_action ra1= new Role_action(new Date(), "Steven");
		
		
		
		em.persist(u1);
		em.persist(a1);
		em.persist(r1);*/
		
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
