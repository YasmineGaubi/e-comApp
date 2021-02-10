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
@Table(name="produit")
public class Produit implements Serializable{
	@Id
	@GeneratedValue
	private Long id ;
	private String nomP;
	
	private String Desce;
	private String img;
	private float prix;	
	private int qte;
	
	@OneToMany(mappedBy = "pro")
	Set<Commande> list_c = new HashSet<Commande>();
	
	public Produit() {
		super();
	}
	
	public Produit(String nomP,float prix,String desce,  String img, int qte) {
		super();
		
		this.nomP = nomP;
		this.Desce = desce;
		this.prix = prix;
		this.img = img;
		this.qte= qte;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomP() {
		return nomP;
	}
	public void setNomP(String nomP) {
		this.nomP = nomP;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public String getDesce() {
		return Desce;
	}
	public void setDesce(String desce) {
		Desce = desce;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}		
}

