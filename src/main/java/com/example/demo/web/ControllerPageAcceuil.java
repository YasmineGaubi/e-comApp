package com.example.demo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dao.ClietnDAO;
import com.example.demo.dao.CommandeDAO;
import com.example.demo.entities.Client;
import com.example.demo.entities.Commande;

@Controller
@RequestMapping("/ecom")
public class ControllerPageAcceuil {
	@Autowired
	ClietnDAO cd;
	
	@Autowired
	CommandeDAO cm;
	
	
	@RequestMapping ( value = "/login" , method = RequestMethod.GET )
	public String LoginPage ( Model m ) {
		Client clt = new Client () ; 
		
		m.addAttribute("client", clt) ; 
		return "login" ;
	
	}
	
	
	@RequestMapping("/veriflogin")
	public String verif(Model m ,Client clt,HttpServletRequest request ) {
		List<Client> cl = cd.findAll();
		for (Client ce:cl) 
			if(ce.getEmail().equals(clt.getEmail()) && ce.getM2p().equals(clt.getM2p()))  {
				m.addAttribute("client",ce);
				HttpSession session = request.getSession(true);
				session.setAttribute("y",true);
				session.setAttribute("user",ce);
				//m.addAttribute("y",true);
				return "PageAcceuil";
			}
			m.addAttribute("y",false);
			m.addAttribute("msg","Client doesn't exist! Please register.");
			return "login";			
			//houny bch yzid yeshri
		//System.out.println(c.getEmail()+c.getM2p());
    }
	
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		List<Commande> c = cm.findAll();
		session.setAttribute("y", false);;
		session.invalidate();	
		cm.deleteAll();
		return "redirect:login";
	}
	
	
}

