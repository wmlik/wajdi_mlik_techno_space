package modele.metier;

import java.util.List;

import modele.domaine.NouveauxPcInfo;

public interface NouveauxPcInfoMetierInterface {
	
	List<NouveauxPcInfo> listeNouveauxPcInfo();
	List<NouveauxPcInfo> listNouveauxPcInfoByinfo(String motDeRecherche);
	NouveauxPcInfo getNouveauxPcInfoById(int id);
	void addNouveauxPcInfo(NouveauxPcInfo p);
	void updateNouveauxPcInfo(NouveauxPcInfo p);
	void deleteNouveauxPcInfo(int id);

}
