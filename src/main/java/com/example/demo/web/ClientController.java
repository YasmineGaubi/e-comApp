package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.ClietnDAO;
import com.example.demo.entities.Client;

@Controller
@RequestMapping("/client")
public class ClientController {
	@Autowired
	ClietnDAO cl ;
	
	@RequestMapping("/add")
	public String ajouter(Model m ) {
		Client c = new Client();
		m.addAttribute("client",c);
		return "register";
	}
	
	
	@RequestMapping("/save")
	public String sauvgarder(Model m, Client c ) {
		cl.save(c);
		return "redirect:/ecom/login";
		
	}
}
