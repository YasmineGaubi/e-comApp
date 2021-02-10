package com.example.demo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.ClietnDAO;
import com.example.demo.dao.CommandeDAO;
import com.example.demo.dao.ProduitDAO;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;
import com.example.demo.entities.Produit;


@RequestMapping("/produit")
@Controller
public class ProduitController {
	@Autowired 
	ProduitDAO pd;
	
	@Autowired 
	ClietnDAO cl;
	
	@Autowired
	CommandeDAO co;
	
	
	
	@RequestMapping("/lister")
	public String lister(Model model) {
		List<Produit> prods = pd.findAll();
		model.addAttribute("list_prod",prods);
		return "products";
	}
	
	@RequestMapping("/add_prod")
	public String add(Model model) {
		Produit p = new Produit();
		model.addAttribute("product",p);
		return "add_p";
	}
	
	@RequestMapping("/save_p")
	public String save_p(Produit p) {
		pd.save(p);
		return "redirect:lister";
	}
	
	@RequestMapping("/modify")
	public String modif(Model model,@RequestParam(name="id_prod") Long id ) {
		Produit p = pd.getOne(id);
		model.addAttribute("product",p);
		return "add_p";
	}
	
	@RequestMapping("/add_com")
	public String add_commande(Model model,@RequestParam(name="id_prod") Long id , HttpServletRequest request) {
		Produit p = pd.getOne(id);
		HttpSession session = request.getSession(false); 
		Client c = (Client) session.getAttribute("user");
		Commande m = new Commande(c,p);
		co.save(m);
		return "card_add";
	}
	
	@RequestMapping("/mycard")
	public String afficher_mycard(Model model) {
		List<Commande> prod = co.findAll();
		model.addAttribute("prod_com",prod);
		return "mycards";
	}
	
	
	
}