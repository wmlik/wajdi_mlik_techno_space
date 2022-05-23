package controleur.pcComplet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.domaine.PcComplet;

import modele.domaine.User;
import modele.metier.PcCompletMetierImpl;
import modele.metier.PcCompletMetierInterface;


/**
 * Servlet implementation class PcCompletListController
 */
@WebServlet("/PcCompletListController")
public class PcCompletListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PcCompletListController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
 // Déclarer un objet "métier"
    PcCompletMetierInterface metier =null; 
    public void init(ServletConfig config) throws ServletException {
		// instancier le métier
		metier =new PcCompletMetierImpl();
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String motDeRecherche =(String) request.getParameter("motDeRecherche");
		if (motDeRecherche==null)
		{
			motDeRecherche="";
		}
		List<PcComplet> pcComplet = metier.listPcCompletByinfo(motDeRecherche);
		//Passer la liste comme attribut			
		request.setAttribute("pcComplet", pcComplet);
		request.getRequestDispatcher("PcCompletList.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		} 
		else {
			super.service(request, response);
		}
	}

}
