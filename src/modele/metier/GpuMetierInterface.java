package modele.metier;

import java.util.List;

import modele.domaine.Gpu;

public interface GpuMetierInterface {
	
	List<Gpu> listeGpu();
	List<Gpu> listGpuByinfo(String motDeRecherche);
	Gpu getGpuById(int id);
	void addGpu(Gpu p);
	void updateGpu(Gpu p);
	void deleteGpu(int id);

}
