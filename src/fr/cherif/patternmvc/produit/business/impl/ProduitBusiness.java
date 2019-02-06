package fr.cherif.patternmvc.produit.business.impl;

import java.util.ArrayList;

import fr.cherif.patternmvc.produit.bean.produit;
import fr.cherif.patternmvc.produit.business.IProduitBusiness;

public class ProduitBusiness implements IProduitBusiness{

	@Override
	public  ArrayList<produit> getProduit() {
		produit mthy = new produit("Thym",8.50 ,"ressources/images/produit/mielthym.jpg" , "http://www.mieldethym.fr/vertus.php");
		produit msap = new produit("Sapin", 6.50, "ressources/images/produit/mielsapin.jpg", "https://www.apiculture.net/miel-400g/312-miel-de-sapin-400-g.html?search_query=sapin&results=5");
		produit mron = new produit("Rose", 9.00, "ressources/images/produit/mielrose.jpg", "https://www.boutique-terroir.com/miels-et-confitures/miel-a-la-rose/ter306");
		produit mros = new produit("Ronce", 11.75, "ressources/images/produit/mielronce.jpg", "https://www.apiculture.net/blog/tout-savoir-sur-le-miel-de-ronce-n147");
		produit mpis = new produit("Pissenlit", 8.90, "ressources/images/produit/mielpissenlit.jpg", "http://www.guide-du-miel.com/lesmiels/Miel-de-pissenlit.html");
		produit mjuj = new produit("Jujubier", 49.50, "ressources/images/produit/mieljujubier.jpg", "https://mieldejujubier.com/fr/miel-de-jujubier-sidr/1-miel-du-yemen-de-jujubier-sidr-maliky-90-de-jujubier.html");
		produit mcha = new produit("Chataîgnier", 8.20, "ressources/images/produit/mielchataignier.jpg", "https://www.apiculture.net/blog/savoir-miel-de-chataignier-n111");
		produit maca = new produit("Acacia", 6.95, "ressources/images/produit/mielacacia.jpg", "https://www.apiculture.net/blog/miel-dacacia-n97");

		ArrayList<produit> listeProduit = new ArrayList<>();

		listeProduit.add(mthy);
		listeProduit.add(msap);
		listeProduit.add(mron);
		listeProduit.add(mros);
		listeProduit.add(mpis);
		listeProduit.add(mjuj);
		listeProduit.add(mcha);
		listeProduit.add(maca);

		return listeProduit;

	}
}