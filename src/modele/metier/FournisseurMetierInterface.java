package modele.metier;

import java.util.List;

import modele.domaine.Fournisseur;

public interface FournisseurMetierInterface {
	
	List<Fournisseur> listeFournisseur();
	List<Fournisseur> listFournisseurByinfo(String motDeRecherche);
	Fournisseur getFournisseurById(int id);
	void addFournisseur(Fournisseur p);
	void updateFournisseur(Fournisseur p);
	void deleteFournisseur(int id);

}
