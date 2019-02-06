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


@WebServlet(name = "produit", urlPatterns = { "/produit" })
public class produitServlet extends HttpServlet {
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	private static final long serialVersionUID = 1L;

	ProduitBusiness produitBusiness = new ProduitBusiness();
	public produitServlet() {
		super();
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<produit> listeProduit = produitBusiness.getProduit();

		request.setAttribute("produits", listeProduit);

		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/produit/produit.jsp")
		.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	// TODO Auto-generated method stub
	doGet(request, response);
}

}