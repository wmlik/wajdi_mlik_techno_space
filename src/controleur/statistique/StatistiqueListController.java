package controleur.statistique;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.metier.StatistiqueMetierInterface;
import modele.domaine.Statistique;
import modele.domaine.User;
import modele.metier.StatistiqueMetierImpl;

/**
 * Servlet implementation class CpuListController
 */
@WebServlet("/StatistiqueController")
public class StatistiqueListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StatistiqueMetierInterface metier = null;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StatistiqueListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init(ServletConfig config) throws ServletException {
		// instancier le métier
		metier = new StatistiqueMetierImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		// liste_benefice_par_date
		// tableaux
		List<Statistique> liste_benefice_par_date = metier.liste_benefice_par_date();
		request.setAttribute("liste_benefice_par_date", liste_benefice_par_date);
		
		// liste_benefice_qte_pc
		// tableaux
		List<Statistique> liste_benefice_qte_pc = metier.liste_benefice_qte_pc();
		request.setAttribute("liste_benefice_qte_pc", liste_benefice_qte_pc);
		
		// list_benefice_par_pc
		// tableaux
		List<Statistique> list_benefice_par_pc = metier.list_benefice_par_pc();
		request.setAttribute("list_benefice_par_pc", list_benefice_par_pc);
		
		// list_vente_par_couleur
		// pourcentage
		List<Statistique> list_vente_par_couleur = metier.list_vente_par_couleur();
		request.setAttribute("list_vente_par_couleur", list_vente_par_couleur);
		int total_qt_vend_couleur = 0;
		for (Statistique u : list_vente_par_couleur) {
			total_qt_vend_couleur = total_qt_vend_couleur + u.getQt_vend();
		}
		request.setAttribute("total_qt_vend_couleur", total_qt_vend_couleur);
		
		// list_vente_par_hdd
		// tableaux
		List<Statistique> list_vente_par_hdd = metier.list_vente_par_hdd();
		request.setAttribute("list_vente_par_hdd", list_vente_par_hdd);
	
		// list_vente_par_gpu
		// tableaux
		List<Statistique> list_vente_par_gpu = metier.list_vente_par_gpu();
		request.setAttribute("list_vente_par_gpu", list_vente_par_gpu);
		
		// list_vente_par_fornissuer
		// tableaux
		List<Statistique> list_vente_par_fornissuer = metier.list_vente_par_fornissuer();
		request.setAttribute("list_vente_par_fornissuer", list_vente_par_fornissuer);
		
		// list_qteStock_par_marque_cpu
		// tableaux
		List<Statistique> list_qteStock_par_marque_cpu = metier.list_qteStock_par_marque_cpu();
		request.setAttribute("list_qteStock_par_marque_cpu", list_qteStock_par_marque_cpu);
		
		// list_vente_par_gamme
		// pourcentage
		List<Statistique> list_vente_par_gamme= metier.list_vente_par_gamme();
		request.setAttribute("list_vente_par_gamme", list_vente_par_gamme);
		int total_qt_vend_gamme = 0;
		for (Statistique u : list_vente_par_gamme) {
			total_qt_vend_gamme = total_qt_vend_gamme + u.getQt_vend();
		}
		request.setAttribute("total_qt_vend_gamme", total_qt_vend_gamme);
		
		
		System.out.println("----------------------------------------------------");

		// rederiction + ba3then session
		request.getRequestDispatcher("accueil.jsp").forward(request, response);
		System.out.println(request.getAttribute("liste_benefice_par_date"));
		System.out.println(request.getAttribute("liste_benefice_qte_pc"));
		System.out.println(request.getAttribute("list_benefice_par_pc"));
		System.out.println(request.getAttribute("list_vente_par_couleur"));
		System.out.println(request.getAttribute("list_vente_par_hdd"));
		System.out.println(request.getAttribute("list_vente_par_gpu"));
		System.out.println(request.getAttribute("list_vente_par_fornissuer"));
		System.out.println(request.getAttribute("list_qteStock_par_marque_cpu"));
		System.out.println(request.getAttribute("list_vente_par_gamme"));
		System.out.println(request.getAttribute("total_qt_vend_gamme"));
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		User u = (User) session.getAttribute("user");
		if (u == null) {
			request.getRequestDispatcher("UserConnexion.jsp").forward(request, response);
		} else {
			super.service(request, response);
		}
	}

}
