package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.dao.ProduitDAO;

@Controller
@RequestMapping("ecom")
public class Afterlogin {
	
	
	@RequestMapping("/home")
	public String home(){
		
		return "PageAcceuil";
	}
	
}
