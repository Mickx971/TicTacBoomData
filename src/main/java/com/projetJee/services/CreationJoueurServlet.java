package com.projetJee.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.http.HttpServlet;

import com.projetJee.controllers.Utilisateur;
import com.projetJee.domain.Joueur;

public class CreationJoueurServlet extends HttpServlet {

	private static final long serialVersionUID = -7372395777343490647L;
	EntityManager entityManager;

	public CreationJoueurServlet() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		entityManager = emf.createEntityManager();
	}

	/**
	 * Réception d'une voiture venant du web servie, création d'une voiture JPA
	 * et sauvegarde dans la base de données.
	 * 
	 * @param voiture
	 */
	public void ajouterJoueur(Utilisateur joueur) {
		Joueur joueurJPA = new Joueur(joueur);
		EntityTransaction tx = entityManager.getTransaction();
		tx.begin();
		entityManager.persist(joueurJPA);
		tx.commit();
	}
	/*
	 * @Override protected void doPost(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * super.doPost(request, response); String nom =
	 * request.getParameter("nom_Joueur"); String prenom =
	 * request.getParameter("prenom_Joueur"); String email =
	 * request.getParameter("email_Joueur"); }
	 * 
	 */

	public List<Utilisateur> listerJoueur() {
		List<Joueur> joueurJPA = entityManager.createQuery("select j from Joueur j").getResultList();
		List<Utilisateur> joueurDTO = new ArrayList<Utilisateur>();
		Joueur jpa;
		for (int i = 0; i < joueurJPA.size(); i++) {
			jpa = (Joueur) joueurJPA.get(i);
			Utilisateur dto = new Utilisateur(jpa.getNom(), jpa.getPrenom(), jpa.getEmail());
			joueurDTO.add(dto);
		}
		return joueurDTO;
	}
}
