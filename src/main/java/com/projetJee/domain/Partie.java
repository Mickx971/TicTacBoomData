package com.projetJee.domain;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Partie {
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "Id_Partie" )
	private Long Id;
	
	@Column( name = "Date_Partie" )
	private Date dateDuPartie;
	
	@Column( name = "Duree_Partie" )
	private Date duree;
	
	@Column( name = "Statistique" )
	private String statistiqueDuPartie;
	
	
	@Column( name = "JoueurParticipant_Partie" )
	
	
	@ManyToMany( mappedBy = "listeJoueur" )
	private Collection<Joueur> joueurs;
	
	 
	public Partie(Long id, Date dateDuPartie, Collection<Joueur> joueurs) {
		super();
		Id = id;
		this.dateDuPartie = dateDuPartie;
		this.joueurs = joueurs;
	}
	
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public Date getDateDuPartie() {
		return dateDuPartie;
	}
	public Date getDuree() {
		return duree;
	}
	public void setDuree(Date duree) {
		this.duree = duree;
	}

	public void setDateDuPartie(Date dateDuPartie) {
		this.dateDuPartie = dateDuPartie;
	}
	public Collection<Joueur> getJoueurs() {
		return joueurs;
	}
	public void setJoueurs(Collection<Joueur> joueurs) {
		this.joueurs = joueurs;
	}
	
	public String getStatistiqueDuPartie() {
		return statistiqueDuPartie;
	}
	public void setStatistiqueDuPartie(String statistiqueDuPartie) {
		this.statistiqueDuPartie = statistiqueDuPartie;
	}
	

}
