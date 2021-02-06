package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.dao.ClietnDAO;
import com.example.demo.dao.ProduitDAO;
import com.example.demo.entities.Client;
import com.example.demo.entities.Produit;

@SpringBootApplication
public class EComApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(EComApplication.class, args);
		
		
		ClietnDAO cd  = ctx.getBean(ClietnDAO.class); 
		Client clt = new Client ((long)4,"yass","yass","yass@yass.com","yass") ;
		clt.setAdmin(true);
		cd.save(clt); 
	
	
	ProduitDAO ad = ctx.getBean(ProduitDAO.class) ; 
	Produit p1 = new Produit ("Chaîne HiFi Essentielb MS4001BT Bluetooth",500f,"Micro chaine GRUNDIG M","https://cdn.pixabay.com/photo/2019/04/18/11/38/radio-4136732_960_720.png") ; 
	Produit p2 = new Produit ("Chaîne HiFi Essentielb MS4001BT Bluetooth",(float)700,"Micro chaine GRU ReflexTélécommande.","hifi2.png") ; 
	Produit p3 = new Produit ("Chaîne HiFi Essentielb MS4001BT Bluetooth",(float)560,"Micro chaine GRUNDIG MS240.Lecteur CD compatible MP3/WMASimple cassette enregistreur (enregistre la radio, le CD, les ports USB ou SD )Enregistrement synchronisé CD/K7Tuner Digital Prme et SleepMi","jaune.png") ; 
	Produit p4 = new Produit ("Chaîne HiFi Essentielb MS4001BT Bluetooth",(float)870,"Micro chaine GRUNDIG MS240.Lecteur CD compatible MP3/WMASimple cassette enregistreur (enregistre la radio, le CD, les ports USB ou SD )Enregistrement synchronisé CD/onctions Horloge, Alarme et Sl","sony.png") ; 
	Produit p5 = new Produit ("Chaîne HiFi Essentielb MS4001BT Bluetooth",(float)140,"Micro chaine GRUNDIG MS240.Lecteur CD compatible MP3/WMASimple cassette enregistreur (enregistre la radio, le CD, les ports USB ou SD )Enregtal PLL FM RDS 30 mémoiresPort USB + slot SD : Lecture MP3Fonctions","khorda.png") ; 
	Produit p6 = new Produit ("STAR ONE Four Electrique",(float)600,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","robot.jpg") ;
	Produit p7 = new Produit ("STAR ONE Four Electrique",(float)3600,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","ma3oun1.jpg") ; 
	Produit p8 = new Produit ("STAR ONE Four Electrique",(float)6030,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","four1.jpg") ;
	Produit p9 = new Produit ("STAR ONE Four Electrique",(float)780,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","four2.jpg") ; 
	Produit p10 = new Produit ("STAR ONE Four Electrique",(float)300,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","fridge1.jpg") ; 
	Produit p11 = new Produit ("STAR ONE Four Electrique",(float)600,"STAR ONE Four Electrique - 36 Litres - Silver - Garantie 1 an\\n\" + \"Marque: STAR ONE | Produits similaires par STAR ONE","fridge2.jpg") ; 
	ad.save(p1) ;
	ad.save(p2) ;
	ad.save(p3) ;
	ad.save(p4) ;
	ad.save(p5) ;
	ad.save(p6) ;
	ad.save(p7) ;
	ad.save(p8) ;
	ad.save(p9) ;
	ad.save(p10) ;
	ad.save(p11) ;
	
	

	}
}
