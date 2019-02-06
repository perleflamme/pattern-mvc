package fr.cherif.patternmvc.utilisateur.business.impl;

import java.util.ArrayList;

import fr.cherif.patternmvc.utilisateur.bean.utilisateur;
import fr.cherif.patternmvc.utilisateur.business.IUtilisateurBusiness;

public class UtilisateurBusiness implements IUtilisateurBusiness{

	@Override
	public ArrayList<utilisateur> getUtilisateur() {
		String dossier = "ressources/images/utilisateur/";
		utilisateur tom = new utilisateur("Hanks", "Tom", 59, "ressources/images/utilisateur/" + "tomHanks.jpg");
		utilisateur robert = new utilisateur ("De Niro", "Robert", 68, "ressources/images/utilisateur/" + "robertDeniro.jpg");
		utilisateur julia = new utilisateur ("Roberts", "Julia", 58, dossier + "juliaRoberts.jpg");
		utilisateur keanu = new utilisateur ("Reeves", "Keanu", 57, dossier + "keanuReeves.jpg");
		utilisateur morgan = new utilisateur ("Freeman", "Morgan", 67, dossier + "morganFreeman.jpg");
		utilisateur sandra = new utilisateur ("Bullock", "Sandra", 54, dossier + "sandraBullock.jpg");
		utilisateur downey = new utilisateur ("Downey JR", "Robert", 44, dossier + "DowneyJr.jpg");
		utilisateur denzel = new utilisateur ("Washington", "Denzel", 55, dossier + "DenzelWashington.jpg");

		ArrayList<utilisateur> listeUtilisateur = new ArrayList<>();
		listeUtilisateur.add(denzel);
		listeUtilisateur.add(downey);
		listeUtilisateur.add(sandra);
		listeUtilisateur.add(morgan);
		listeUtilisateur.add(keanu);
		listeUtilisateur.add(julia);
		listeUtilisateur.add(robert);
		listeUtilisateur.add(tom);
		
		return listeUtilisateur;

		
}
}