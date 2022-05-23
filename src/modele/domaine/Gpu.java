package modele.domaine;

import java.io.Serializable;

public class Gpu implements Serializable {
	
	 private int id_gpu;
	 private String marqueGpu;
	 private String capaciteGpu;
	 private String vitesse;
	 
	 
	public Gpu(int id_gpu, String marqueGpu, String capaciteGpu, String vitesse) {
		super();
		this.id_gpu = id_gpu;
		this.marqueGpu = marqueGpu;
		this.capaciteGpu = capaciteGpu;
		this.vitesse = vitesse;
	}
	
	public Gpu(String marqueGpu, String capaciteGpu, String vitesse) {
		super();
		this.marqueGpu = marqueGpu;
		this.capaciteGpu = capaciteGpu;
		this.vitesse = vitesse;
	}

	public Gpu() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId_gpu() {
		return id_gpu;
	}
	public void setId_gpu(int id_gpu) {
		this.id_gpu = id_gpu;
	}
	public String getMarqueGpu() {
		return marqueGpu;
	}
	public void setMarqueGpu(String marqueGpu) {
		this.marqueGpu = marqueGpu;
	}
	public String getCapaciteGpu() {
		return capaciteGpu;
	}
	public void setCapaciteGpu(String capaciteGpu) {
		this.capaciteGpu = capaciteGpu;
	}
	public String getVitesse() {
		return vitesse;
	}
	public void setVitesse(String vitesse) {
		this.vitesse = vitesse;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capaciteGpu == null) ? 0 : capaciteGpu.hashCode());
		return result;
	}
	@Override
	public String toString() {
		return "Gpu [id_gpu=" + id_gpu + ", marqueGpu=" + marqueGpu + ", capaciteGpu=" + capaciteGpu + ", vitesse=" + vitesse + "]";
	}
	
	 
	 
}
