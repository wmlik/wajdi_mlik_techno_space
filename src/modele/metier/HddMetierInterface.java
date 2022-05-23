package modele.metier;

import java.util.List;

import modele.domaine.Hdd;

public interface HddMetierInterface {
	
	List<Hdd> listeHdd();
	List<Hdd> listHddByinfo(String motDeRecherche);
	Hdd getHddById(int id);
	void addHdd(Hdd p);
	void updateHdd(Hdd p);
	void deleteHdd(int id);

}
