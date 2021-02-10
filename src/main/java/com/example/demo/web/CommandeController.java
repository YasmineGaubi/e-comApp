package com.example.demo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.ClietnDAO;
import com.example.demo.dao.CommandeDAO;
import com.example.demo.dao.ProduitDAO;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;

@Controller
public class CommandeController {
	@Autowired
	CommandeDAO cm;
	@Autowired
	ClietnDAO cd;
	@Autowired
	ProduitDAO pd;
	
		@RequestMapping("/confirmation")
		public String confirme(Model m, HttpServletRequest request) {
			
			List<Commande> ce = cm.findAll();
			HttpSession session = request.getSession(false);
			session.setAttribute("yee", true);
			for (Commande c : ce) {
				int u = c.getPro().getQte();
				c.getPro().setQte(u-1);
				pd.save(c.getPro());
				if ( c.getPro().getQte()<=0) {
					String ms = c.getPro().getNomP();
					session.setAttribute("esm",ms );
					session.setAttribute("yee", false);
					session.setAttribute("msg", "Out of stock");
					}
			
			}
				cm.deleteAll();
			return "redirect:produit/lister";
		}
		/*
		@RequestMapping("/verifstock")
		public String stock(Model m) {
		List<Commande> ce = cm.findAll();
		String msg="";
			Commande c = (Commande) ce;
			 int u = c.getProduit().getQte();
			if ( u <= 0 ) {
			m.addAttribute("yee",false);
			m.addAttribute("out of stock",msg);
			}
			return "redirect:produit/lister";
		}*/
}

