package modele.domaine;

import java.io.Serializable;

public class Ram implements Serializable{

	private int id_ram;
	private String capaciteRam;
	private String marqueRam; 
	private String generationRam;
	
	public Ram(int id_ram, String capaciteRam, String marqueRam, String generationRam) {
		super();
		this.id_ram = id_ram;
		this.capaciteRam = capaciteRam;
		this.marqueRam = marqueRam;
		this.generationRam = generationRam;
	}
	
	public Ram(String capaciteRam, String marqueRam, String generationRam) {
		super();
		this.capaciteRam = capaciteRam;
		this.marqueRam = marqueRam;
		this.generationRam = generationRam;
	}

	public Ram() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Ram [id_ram=" + id_ram + ", capaciteRam=" + capaciteRam + ", marqueRam=" + marqueRam + ", generationRam=" + generationRam
				+ "]";
	}
	public int getId_ram() {
		return id_ram;
	}
	public void setId_ram(int id_ram) {
		this.id_ram = id_ram;
	}
	public String getCapaciteRam() {
		return capaciteRam;
	}
	public void setCapaciteRam(String capaciteRam) {
		this.capaciteRam = capaciteRam;
	}
	public String getMarqueRam() {
		return marqueRam;
	}
	public void setMarqueRam(String marqueRam) {
		this.marqueRam = marqueRam;
	}
	public String getGenerationRam() {
		return generationRam;
	}
	public void setGenerationRam(String generationRam) {
		this.generationRam = generationRam;
	}
	
	
	

}
