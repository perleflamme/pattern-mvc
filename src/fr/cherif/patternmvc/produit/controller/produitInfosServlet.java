package fr.cherif.patternmvc.produit.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.cherif.patternmvc.produit.bean.produit;
import fr.cherif.patternmvc.produit.business.impl.ProduitBusiness;


@WebServlet(name = "produitinfos", urlPatterns = { "/produit-infos" })
public class produitInfosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProduitBusiness produitBusiness = new ProduitBusiness();

	public produitInfosServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String iString =
				request.getParameter("i");
		int i = Integer.parseInt(iString);
		
		ArrayList<produit> listeProduit = produitBusiness.getProduit();
		
		produit Produit =
				listeProduit.get(i);
			

		request.setAttribute("produit", Produit);

		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/produit/produit-infos.jsp")
		.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
