package modele.metier;

import java.util.List;

import modele.domaine.Statistique;

public interface StatistiqueMetierInterface {
	
	List<Statistique> liste_benefice_par_date();
	List<Statistique> liste_benefice_qte_pc();
	List<Statistique> list_benefice_par_pc();
	List<Statistique> list_vente_par_couleur();
	List<Statistique> list_vente_par_hdd();
	List<Statistique> list_vente_par_gpu();
	List<Statistique> list_vente_par_fornissuer();
	List<Statistique> list_qteStock_par_marque_cpu();
	List<Statistique> list_vente_par_gamme();
}
