package com.projetJee.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.projetJee.services.CreationJoueurServlet;

public class ControllerUtilisateur {
	CreationJoueurServlet creationJoueur = new  CreationJoueurServlet();
	
	@RequestMapping(value="/joueur", method=RequestMethod.GET)
	@ResponseBody
	@ResponseStatus(HttpStatus.OK)
	public List<Utilisateur> getListeJoueur(){		
		return creationJoueur.listerJoueur();
	}

	@RequestMapping(value="/joueur", method=RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void addJoueurParBodyHTTP(@RequestBody Utilisateur joueur){
		creationJoueur.ajouterJoueur(joueur);
	}
	
	@RequestMapping(value="/joueur", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void modifierVoiture( @RequestBody Utilisateur joueur){
		System.out.println("modifierJoueur : " + joueur);
		// ...
	}
	
	@RequestMapping(value="/joueur", method=RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void deleteVoiture( @RequestBody Utilisateur joueur){
		System.out.println("deleteVoiture : " + joueur);
		// ...
	}
}
