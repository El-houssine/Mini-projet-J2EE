package Controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.LivreService;
import model.Livre;

/**
 * Servlet implementation class LivreController
 */
public class LivreController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LivreService ls = new LivreService();
		request.setAttribute("livres", ls.livres());

		this.getServletContext().getRequestDispatcher("/infoLivre.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
////		
		String titre = request.getParameter("titre");
		String isbn = request.getParameter("isbn");
		String auteur = request.getParameter("auteur");
		String annee = request.getParameter("annee");
		int nbPage = Integer.parseInt(request.getParameter("nbPage"));
		double prix = Double.parseDouble(request.getParameter("prix"));

		Livre lvr = new Livre(isbn, titre, auteur, annee, nbPage, prix);
		LivreService ls = new LivreService();
		ls.valider(lvr);

		request.setAttribute("livres", ls.livres());
		request.getRequestDispatcher("infoLivre.jsp").forward(request, response);
//	 

	}
}