package com.afpa.cda.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Personne {
	
	@Id
	private int id;
	
	private String name;

	private String prenom;
	
	private Date dateDeNaissance;
	
	private String metier;
	
	private String adresse;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getMetier() {
		return metier;
	}

	public String getAdresse() {
		return adresse;
	}
	
	
	
}