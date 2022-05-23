package controleur.cpu;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.domaine.Cpu;
import modele.metier.CpuMetierImpl;
import modele.metier.CpuMetierInterface;

/**
 * Servlet implementation class FormCpuAction
 */
@WebServlet("/FormCpuAction")
public class FormCpuAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormCpuAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Déclarer un objet "métier"
	CpuMetierInterface metier = null;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// instancier le métier
		metier = new CpuMetierImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// Récupérer les paramètres
		String id = request.getParameter("id");
		String mode = request.getParameter("mode");

		// gérer le mode "Edition"
		if (mode != null && mode.equals("Edition")) {

			Cpu p = metier.getCpuById(Integer.parseInt(id));
			// passer l'objet trouvé comme attribut dans la requête
			request.setAttribute("cpu", p);
			// passer au formulaire
			request.getRequestDispatcher("CpuForm.jsp").forward(request, response);
		}
		// gérer le mode "Suppression"
		if (mode != null && mode.equals("Suppression")) {

			int index = Integer.parseInt(id);

			// Supprimer dans la base de données
			metier.deleteCpu(index);

			// Charger la liste des produits
			List<Cpu> lp = metier.listeCpu();
			request.setAttribute("ListCpu", lp);
			// passer à la liste
			request.getRequestDispatcher("CpuList.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// tableau pour stocker les erreurs éventuelles
		ArrayList erreurs = new ArrayList();

		// Récupérer les paramètres du formulaire
		String processor_number = request.getParameter("processor_number");
		String generationCpu = request.getParameter("generationCpu");
		String speed = request.getParameter("speed");
		String nombre_de_coeur = request.getParameter("nombre_de_coeur");
		String id_cpu = request.getParameter("id_cpu");

		// Contrôler les valeurs saisies
		if (processor_number == null || processor_number.equals(""))
			erreurs.add("Veuillez remplir le champ login");

		if (generationCpu == null || generationCpu.equals(""))
			erreurs.add("Veuillez remplir le champ password");

		if (speed == null || speed.equals(""))
			erreurs.add("Veuillez remplir le champ nom");

		if (nombre_de_coeur == null || nombre_de_coeur.equals(""))
			erreurs.add("Veuillez remplir le champ prenom");

		if (erreurs.size() != 0) {
			// en cas d'existence de champs nulls
			request.setAttribute("err", erreurs);
			// reenvoyer les paramètres du formulaire s'ils existent sous forme
			// d'un objet 'User' passé comme attribut nommé "user"
			Cpu uf = new Cpu(Integer.parseInt(id_cpu), processor_number, generationCpu, speed,
					Integer.parseInt(nombre_de_coeur));
			request.setAttribute("cpu", uf);

			// retourner au formulaire
			request.getRequestDispatcher("CpuForm.jsp").forward(request, response);
		} else // La saisie est correcte
		{

			// lire à partir de la session ( portée session)
			// HttpSession session = request.getSession(true);
			// Récupérer le tableau des users de la session
			List<Cpu> cpusStore;
			// session.getAttribute("listOfCpus");

			// Mode Ajout
			if (id_cpu != null && id_cpu.equals("0")) {

				// Créer une instance "User" en lui passant une valeur pour l'id et les champs
				// récupérés
				Cpu u = new Cpu(0, processor_number, generationCpu, speed, Integer.parseInt(nombre_de_coeur));

				// Ajouter le nouvel objet dans la base de données
				metier.addCpu(u);
			}
			// Mode Edition
			else {
				// Modifier l'objet en question
				Cpu u = new Cpu(Integer.parseInt(id_cpu), processor_number, generationCpu, speed,
						Integer.parseInt(nombre_de_coeur));
				metier.updateCpu(u);

			}

			// Charger la liste des utilisateurs;
			cpusStore = metier.listeCpu();

			// passer le tableau dans le session
			request.setAttribute("ListCpu", cpusStore);

			// passer à la vue de liste des utilisateurs
			request.getRequestDispatcher("CpuList.jsp").forward(request, response);

		}
	}

}
