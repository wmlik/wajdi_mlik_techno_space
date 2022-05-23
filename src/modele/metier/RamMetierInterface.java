package modele.metier;

import java.util.List;

import modele.domaine.Ram;

public interface RamMetierInterface {
	
	List<Ram> listeRam();
	List<Ram> listRamByinfo(String motDeRecherche);
	Ram getRamById(int id);
	void addRam(Ram p);
	void updateRam(Ram p);
	void deleteRam(int id);

}
