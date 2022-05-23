package modele.metier;

import java.util.List;

import modele.domaine.Cpu;

public interface CpuMetierInterface {
	
	List<Cpu> listeCpu();
	List<Cpu> listCpuByinfo(String motDeRecherche);
	Cpu getCpuById(int id);
	void addCpu(Cpu p);
	void updateCpu(Cpu p);
	void deleteCpu(int id);

}
