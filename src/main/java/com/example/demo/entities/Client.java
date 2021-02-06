package com.example.demo.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String m2p;
	private boolean admin;
	
	@OneToMany(mappedBy = "cli")
	Set<Commande> list_c = new HashSet<Commande>();
	
	public Client(Long id, String nom, String prenom, String email, String m2p) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.m2p = m2p;
		this.admin=false;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	public String getM2p() {
		return m2p;
	}
	public void setM2p(String m2p) {
		this.m2p = m2p;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	
	
}
