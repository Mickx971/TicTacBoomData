package com.projetJee.controllers;

public class Utilisateur {
		private String nom;
		private String prenomm;
		private String email;
		
		
		
		public Utilisateur(String nom, String prenomm, String email) {
			super();
			this.nom = nom;
			this.prenomm = prenomm;
			this.email = email;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		
		
		public String getPrenomm() {
			return prenomm;
		}
		public void setPrenomm(String prenomm) {
			this.prenomm = prenomm;
		}
		
		
		public String getEmail() {
			return email;
		}
		public Utilisateur() {
			super();
			// TODO Auto-generated constructor stub
		}
		/*public Joueur(String nom, String prenomm, String email) {
			super();
			this.nom = nom;
			this.prenomm = prenomm;
			this.email = email;
		}*/
		public void setEmail(String email) {
			this.email = email;
		}
		
		
}
