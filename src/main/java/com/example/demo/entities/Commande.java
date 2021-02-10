package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Commande {
	@Id
	@GeneratedValue
	private Long id;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name="id_c")
	private Client cli;
	
	@ManyToOne
	@JoinColumn(name="id_p")
	private Produit pro;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Client cli, Produit pro) {
		super();
		this.date = new Date();
		this.cli = cli;
		this.pro = pro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Client getCli() {
		return cli;
	}

	public void setCli(Client cli) {
		this.cli = cli;
	}

	public Produit getPro() {
		return pro;
	}

	public void setPro(Produit pro) {
		this.pro = pro;
	}
	
}
