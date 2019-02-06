package fr.cherif.patternmvc.utilisateur.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cherif.patternmvc.utilisateur.bean.utilisateur;
import fr.cherif.patternmvc.utilisateur.business.impl.UtilisateurBusiness;

@WebServlet(name = "utilisateurinfos", urlPatterns = { "/utilisateur-infos" })
public class utilisateurInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurBusiness utilisateurBusiness = new UtilisateurBusiness();

	public utilisateurInfosServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iString =
				request.getParameter("i");
		int i = Integer.parseInt(iString);
		
		ArrayList<utilisateur> listeUtilisateur = utilisateurBusiness.getUtilisateur(); 
		
		utilisateur Utilisateur =
				listeUtilisateur.get(i);
			

		request.setAttribute("utilisateur", Utilisateur);

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur/utilisateur-infos.jsp")
		.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
