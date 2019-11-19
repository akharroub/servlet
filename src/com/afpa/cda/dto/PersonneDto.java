package com.afpa.cda.dto;

public class PersonneDto {
	private int id;
	private String nom;
	private String prenom;

	private String metier;
	private String adresse;

	public PersonneDto() {
	}

	public PersonneDto(int id, String nom, String prenom,String metier,String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		
		this.metier = metier;
		this.adresse = adresse;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}