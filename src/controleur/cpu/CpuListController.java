package controleur.cpu;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.metier.CpuMetierInterface;
import modele.domaine.Cpu;
import modele.domaine.User;
import modele.metier.CpuMetierImpl;

/**
 * Servlet implementation class CpuListController
 */
@WebServlet("/CpuListController")
public class CpuListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CpuMetierInterface metier =null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CpuListController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		 //instancier le métier
		metier =new CpuMetierImpl();
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
		List<Cpu> Cpus = metier.listCpuByinfo(motDeRecherche);
		
		
		//Passer la liste comme attribut			
		request.setAttribute("ListCpu", Cpus);
		request.getRequestDispatcher("CpuList.jsp").forward(request, response);
		
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
