package modele.metier;

import java.util.List;

import modele.domaine.PcComplet;
import modele.domaine.PcComplet;

public interface PcCompletMetierInterface {
	
	List<PcComplet> listePcComplet();
	List<PcComplet> listPcCompletByinfo(String motDeRecherche);
	PcComplet getPcCompletById(int id);
	void addPcComplet(PcComplet p);
	void updatePcComplet(PcComplet p);
	void deletePcComplet(int id);

}
