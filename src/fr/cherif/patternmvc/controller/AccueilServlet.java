package fr.cherif.patternmvc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "accueil", urlPatterns = { "/accueil" })
public class AccueilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AccueilServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext()
		.getRequestDispatcher("/WEB-INF/pages/accueil.jsp")
		.forward(request, response);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
