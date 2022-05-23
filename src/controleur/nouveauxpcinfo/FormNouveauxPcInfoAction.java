package controleur.nouveauxpcinfo;

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
import modele.domaine.Fournisseur;
import modele.domaine.Gpu;
import modele.domaine.Hdd;
import modele.domaine.NouveauxPcInfo;
import modele.domaine.Ram;
import modele.domaine.NouveauxPcInfo;
import modele.metier.CpuMetierImpl;
import modele.metier.CpuMetierInterface;
import modele.metier.FournisseurMetierImpl;
import modele.metier.FournisseurMetierInterface;
import modele.metier.GpuMetierImpl;
import modele.metier.GpuMetierInterface;
import modele.metier.HddMetierImpl;
import modele.metier.HddMetierInterface;
import modele.metier.NouveauxPcInfoMetierImpl;
import modele.metier.NouveauxPcInfoMetierInterface;
import modele.metier.RamMetierImpl;
import modele.metier.RamMetierInterface;

/**
 * Servlet implementation class FormNouveauxPcInfoAction
 */
@WebServlet("/FormNouveauxPcInfoAction")
public class FormNouveauxPcInfoAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FormNouveauxPcInfoAction() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Déclarer un objet "métier"
	NouveauxPcInfoMetierInterface metierpc = null;
	FournisseurMetierInterface metierfournisseur = null;
	CpuMetierInterface metiercpu = null;
	GpuMetierInterface metiergpu = null;
	RamMetierInterface metierram = null;
	HddMetierInterface metierhdd = null;
	

	@Override
	public void init(ServletConfig config) throws ServletException {
		// instancier le métier
		metierpc = new NouveauxPcInfoMetierImpl();
		metierfournisseur = new FournisseurMetierImpl();
		metiercpu = new CpuMetierImpl();
		metiergpu = new GpuMetierImpl();
		metierram = new RamMetierImpl();
		metierhdd = new HddMetierImpl();
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
		
		System.out.println("mode"+mode);
		System.out.println("id"+id);
		//test for add or update
		if (mode == null && id == null) { //for add
			
			List<Fournisseur> fournisseurs = metierfournisseur.listeFournisseur();
			List<Cpu> cpus = metiercpu.listeCpu();
			List<Gpu> gpus = metiergpu.listeGpu();
			List<Ram> rams = metierram.listeRam();
			List<Hdd> hdds = metierhdd.listeHdd();
			
			request.setAttribute("ListFournisseur", fournisseurs);
			request.setAttribute("ListCpu", cpus);
			request.setAttribute("ListGpu", gpus);
			request.setAttribute("ListRam", rams);
			request.setAttribute("ListHdd", hdds);
			
			request.getRequestDispatcher("NouveauxPcInfoForm.jsp").forward(request, response);
			
			
		}
		else {
			// gérer le mode "Edition" MODIFIER
			if (mode != null && mode.equals("Edition")) {

				NouveauxPcInfo p = metierpc.getNouveauxPcInfoById(Integer.parseInt(id));
				// passer l'objet trouvé comme attribut dans la requête
				request.setAttribute("pc", p);
				
				System.out.println("id_hdd contr----------------"+p.getId_hdd());
				List<Fournisseur> fournisseurs = metierfournisseur.listeFournisseur();
				List<Cpu> cpus = metiercpu.listeCpu();
				List<Gpu> gpus = metiergpu.listeGpu();
				List<Ram> rams = metierram.listeRam();
				List<Hdd> hdds = metierhdd.listeHdd();
				
				request.setAttribute("ListFournisseur", fournisseurs);
				request.setAttribute("ListCpu", cpus);
				request.setAttribute("ListGpu", gpus);
				request.setAttribute("ListRam", rams);
				request.setAttribute("ListHdd", hdds);
				
				// passer au formulaire
				request.getRequestDispatcher("NouveauxPcInfoForm.jsp").forward(request, response);
			}
			// gérer le mode "Suppression"
			if (mode != null && mode.equals("Suppression")) {

				int index = Integer.parseInt(id);

				// Supprimer dans la base de données
				metierpc.deleteNouveauxPcInfo(index);

				// Charger la liste des produits
				List<NouveauxPcInfo> lp = metierpc.listeNouveauxPcInfo();
				request.setAttribute("ListNouveauxPcInfo", lp);
				// passer à la liste
				request.getRequestDispatcher("PcCompletListController").forward(request, response);
			}
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
		String id_pc = request.getParameter("id_pc");
		String MarquePc = request.getParameter("MarquePc");
		String gamme = request.getParameter("gamme");
		String couleur = request.getParameter("couleur");
		String date_entree = request.getParameter("date_entree");
		String date_sortie = request.getParameter("date_sortie");
		String prix_achat = request.getParameter("prix_achat");
		String prix_vente = request.getParameter("prix_vente");
		String qte_stock = request.getParameter("qte_stock");
		String qte_vendu = request.getParameter("qte_vendu");
		String id_fournisseur =  request.getParameter("id_fournisseur");
		String id_cpu = request.getParameter("id_cpu");
		String id_gpu = request.getParameter("id_gpu");
		String id_hdd =request.getParameter("id_hdd");
		String id_ram = request.getParameter("id_ram");

		// Contrôler les valeurs saisies
		if (MarquePc == null || MarquePc.equals(""))
			erreurs.add("Veuillez remplir le champ MarquePc");

		if (gamme == null || gamme.equals(""))
			erreurs.add("Veuillez remplir le champ gamme");

		if (couleur == null || couleur.equals(""))
			erreurs.add("Veuillez remplir le champ couleur");
		
		if (date_entree == null || date_entree.equals(""))
			erreurs.add("Veuillez remplir le champ date_entree");

		if (  date_sortie.equals(""))
			date_sortie = null;

		if (prix_achat == null || prix_achat.equals("")||Double.parseDouble(prix_achat)==0)
			erreurs.add("Veuillez remplir le champ prix_achat");

		if (prix_vente == null ||prix_vente.equals("")||Double.parseDouble(prix_vente)==0)
			erreurs.add("Veuillez remplir le champ prix_vente");
		
		if (qte_stock == null || qte_stock.equals(""))
			erreurs.add("Veuillez remplir le champ qte_stock");

		if (qte_vendu == null || qte_vendu.equals(""))
			qte_vendu = "0";

		if (id_fournisseur == null || id_fournisseur.equals("")|| id_fournisseur.equals("0"))
			erreurs.add("Veuillez remplir le champ fournisseur");

		if (id_cpu == null || id_cpu.equals("")|| id_cpu.equals("0"))
			erreurs.add("Veuillez remplir le champ cpu");
		
		if (id_gpu == null || id_gpu.equals("")|| id_gpu.equals("0"))
			erreurs.add("Veuillez remplir le champ gpu");

		if (id_hdd == null || id_hdd.equals("")|| id_hdd.equals("0"))
			erreurs.add("Veuillez remplir le champ hdd");
		
		if (id_ram == null || id_ram.equals("")|| id_ram.equals("0"))
			erreurs.add("Veuillez remplir le champ ram");
		
		if (erreurs.size() != 0) {
			// en cas d'existence de champs nulls
			request.setAttribute("err", erreurs);
			// reenvoyer les paramètres du formulaire s'ils existent sous forme
			// d'un objet 'User' passé comme attribut nommé "user"
			NouveauxPcInfo uf = new NouveauxPcInfo(Integer.parseInt(id_pc), MarquePc, gamme, couleur, date_entree, date_sortie, Double.parseDouble(prix_achat), Double.parseDouble(prix_vente), Integer.parseInt(qte_stock), Integer.parseInt(qte_vendu), Integer.parseInt(id_fournisseur), Integer.parseInt(id_cpu), Integer.parseInt(id_gpu), Integer.parseInt(id_hdd), Integer.parseInt(id_ram));
			
			request.setAttribute("pc", uf);
			
			List<Fournisseur> fournisseurs = metierfournisseur.listeFournisseur();
			List<Cpu> cpus = metiercpu.listeCpu();
			List<Gpu> gpus = metiergpu.listeGpu();
			List<Ram> rams = metierram.listeRam();
			List<Hdd> hdds = metierhdd.listeHdd();
			
			request.setAttribute("ListFournisseur", fournisseurs);
			request.setAttribute("ListCpu", cpus);
			request.setAttribute("ListGpu", gpus);
			request.setAttribute("ListRam", rams);
			request.setAttribute("ListHdd", hdds);

			// retourner au formulaire
			request.getRequestDispatcher("NouveauxPcInfoForm.jsp").forward(request, response);
		} else // La saisie est correcte
		{

			// lire à partir de la session ( portée session)
			// HttpSession session = request.getSession(true);
			// Récupérer le tableau des users de la session
			List<NouveauxPcInfo> cpusStore;
			// session.getAttribute("listOfNouveauxPcInfos");

			// Mode Ajout
			if (id_pc != null && id_pc.equals("0")) {

				// Créer une instance "User" en lui passant une valeur pour l'id et les champs
				// récupérés
				//NouveauxPcInfo u = new NouveauxPcInfo(0,MarquePc, gamme, couleur, date_entree, date_sortie, Double.parseDouble(prix_achat), Double.parseDouble(prix_vente), Integer.parseInt(qte_stock), Integer.parseInt(qte_vendu), 1, 1, 1, 1, 1);
				NouveauxPcInfo u = new NouveauxPcInfo(0,MarquePc, gamme, couleur, date_entree, date_sortie, Double.parseDouble(prix_achat), Double.parseDouble(prix_vente), Integer.parseInt(qte_stock), Integer.parseInt(qte_vendu), Integer.parseInt(id_fournisseur), Integer.parseInt(id_cpu), Integer.parseInt(id_gpu), Integer.parseInt(id_hdd), Integer.parseInt(id_ram));

				// Ajouter le nouvel objet dans la base de données
				metierpc.addNouveauxPcInfo(u);
			}
			// Mode Edition
			else {
				// Modifier l'objet en question
				
				NouveauxPcInfo u = new NouveauxPcInfo( Integer.parseInt(id_pc), MarquePc, gamme, couleur, date_entree, date_sortie, Double.parseDouble(prix_achat), Double.parseDouble(prix_vente), Integer.parseInt(qte_stock), Integer.parseInt(qte_vendu), Integer.parseInt(id_fournisseur), Integer.parseInt(id_cpu), Integer.parseInt(id_gpu), Integer.parseInt(id_hdd), Integer.parseInt(id_ram));
				System.out.println("id mta3 update form controler /////////// "+id_pc);
				System.out.println("ob mta3 update form controler /////////// "+u);
				metierpc.updateNouveauxPcInfo(u);

			}

			// Charger la liste des utilisateurs;
			//cpusStore = metierpc.listeNouveauxPcInfo();

			// passer le tableau dans le session
			//request.setAttribute("ListNouveauxPcInfo", cpusStore);

			// passer à la vue de liste des utilisateurs
			request.getRequestDispatcher("PcCompletListController").forward(request, response);

		}
	}

}
