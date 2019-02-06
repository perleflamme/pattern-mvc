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


@WebServlet("/utilisateur")
public class utilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UtilisateurBusiness utilisateurBusiness = new UtilisateurBusiness();   

	public utilisateurServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<utilisateur> listeUtilisateur = utilisateurBusiness.getUtilisateur();

		request.setAttribute("utilisateur", listeUtilisateur);

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/utilisateur/utilisateur.jsp")
		.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}