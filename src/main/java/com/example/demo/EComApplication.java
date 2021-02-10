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
		Client user = new Client ((long)5,"user","user","user@user.com","user") ;
		user.setAdmin(false);
		cd.save(user); 
	
	
	ProduitDAO ad = ctx.getBean(ProduitDAO.class) ; 
	Produit p1 = new Produit ("CAMBRIDGE AUDIO CXA61 AMPLI STEREO / LUNAR GRAY",500f,"Lorem ipsum dolor sit amet. ","https://cdn.pixabay.com/photo/2019/04/18/11/38/radio-4136732_960_720.png",4) ; 
	Produit p2 = new Produit ("TRIANGLE ZERIUS 902 NOIR ENCEINTES COLONNES LA PAIRE",(float)700," Quisque vel orci mauris. Curabitur mauris lorem","https://img2.pngio.com/chaine-hifi-png-3-png-image-hi-fi-png-494_435.png",10) ; 
	Produit p3 = new Produit ("COMETE 902 COGNAC ENCEINTE BIBLIOTHEQUE LA PAIRE",(float)560," Accumsan aliquet metus nec.","https://zococity.es/media/catalog/product/cache/78d54c8adfc867ddad4b37fa06bea7e6/1/_/1_12.jpg",50) ; 
	Produit p4 = new Produit ("Elipson plant m5.0 noir laque pack d'enceintes compactes",(float)870,"Sollicitudin interdum diam. Integer non auctor ligula.","https://res.cloudinary.com/chal-tec/image/upload/w_450,q_auto,f_auto/bbg/10004797/Gallery/10004797_yy_0001_titel___auna_DS_2_Stereoanlage_MP_Aufnahme_reedit.jpg",4) ; 
	Produit p5 = new Produit ("Triangle concerto blanc laqué enceintes colonnes la paire",(float)140,",Nunc mauris massa, gravida non egestas id, auctor a est.","https://img2.cgtrader.com/items/126992/c0f302d666/yamaha-audio-3d-model-obj-lxo-lxl.jpg",2) ; 
	Produit p6 = new Produit ("Micro ondes THOMSON EASY20BLACK MIROIR",(float)600," Ut rutrum enim sed semper lacinia. Nunc egestas urna sit amet massa tempus, a pellentesque risus pretium.","https://us.123rf.com/450wm/pioneer111/pioneer1111801/pioneer111180100105/94153395-four-micro-ondes-ouvert-isol%C3%A9-sur-un-fond-blanc.jpg?ver=6",12) ;
	Produit p7 = new Produit ("Micro ondes MOULINEX MO20MSBL",(float)3600,"onec eu magna non ipsum fringilla venenatis non rutrum tellus. Maecenas et interdum dui. Proin quis tempor turpis.","https://www.cdiscount.com/pdt2/0/w/6/1/700x700/oceamo20w6/rw/oceanic-amo20w6-micro-ondes-20l-blanc.jpg",4) ; 
	Produit p8 = new Produit ("Refrigerateur Samsung",(float)6030,"Nullam sit amet turpis porttitor, iaculis ex eu, faucibus mi. Pellentesque tincidunt ullamcorper ante sed molestie.","https://www.mega.tn/assets/uploads/img/pr_froid/1559259671_340.jpg",2) ;
	Produit p9 = new Produit ("Four Electrique",(float)780,"Cras molestie ipsum nec massa gravida pellentesque","https://static.mytek.tn/img/p/7/0/5/4/3/70543-large_default.jpg",1) ; 
	Produit p10 = new Produit ("Robot Batteur Electrique",(float)300,"Nam ullamcorper lobortis erat, eget fringilla erat molestie sit amet.","https://www.cdiscount.com/pdt2/4/8/2/1/1200x1200/auc5019705922482/rw/robot-patissier-aicok-robot-de-cuisine-avec-croch.jpg,",3) ; 
	Produit p11 = new Produit ("Robot Patissier Miago",(float)600,"Phasellus pellentesque mi vel pulvinar pulvinar.Interdum et malesuada fames ac ante ipsum primis in faucibus. ","https://www.cdiscount.com/pdt2/5/0/1/4/550x550/mio3665540399501/rw/robot-patissier-miogo-mrpm1-robot-de-cuisine-c.jpg",20) ; 
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
