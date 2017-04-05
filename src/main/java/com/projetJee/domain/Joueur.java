package com.projetJee.domain;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.projetJee.controllers.Utilisateur;

@Entity
@Table( name = "Table_Partie" )
public class Joueur {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "Id_Joueur" )
	private String id;
	
	@Column( name = "Nom" )
	private String nom;
	
	@Column( name = "Prenom" )
	private String prenom;
	
	@Column( name = "email" )
	private String email;
	
	@ManyToMany
    @JoinTable( name = "TableDeJointureEntreJoueurEtPartie", 
      joinColumns = @JoinColumn(name="idJoueur_FK")
	 ,inverseJoinColumns = @JoinColumn(name="idPartie_FK"))
	private Collection <Partie> parties;
	
	
	static int nbreJoueur=0;
	public Joueur (Utilisateur utilisateur){
		this.nom = utilisateur.getNom();
		this.prenom = utilisateur.getPrenomm();
		this.email= utilisateur.getEmail();
		nbreJoueur++;
	}
	
	public Joueur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Joueur(String nom, String prenom, String email) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
