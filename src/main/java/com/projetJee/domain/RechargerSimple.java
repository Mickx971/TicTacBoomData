package com.projetJee.domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "RechargerSimple")
public class RechargerSimple extends Recharger{
	private static  String nom;

	public static String getNom() {
		return nom;
	}

	public static void setNom(String nom) {
		RechargerSimple.nom = nom;
	}
}
