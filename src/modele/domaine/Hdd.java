package modele.domaine;

import java.io.Serializable;

public class Hdd implements Serializable{
	private int id_hdd;
	private String marqueHdd;	
	private int capaciteHdd;	
	private String bande_passante;
	private String type;
	public Hdd() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hdd(int id_hdd, String marqueHdd, int capaciteHdd, String bande_passante, String type) {
		super();
		this.id_hdd = id_hdd;
		this.marqueHdd = marqueHdd;
		this.capaciteHdd = capaciteHdd;
		this.bande_passante = bande_passante;
		this.type = type;
	}
	
	public Hdd(String marqueHdd, int capaciteHdd, String bande_passante, String type) {
		super();
		this.marqueHdd = marqueHdd;
		this.capaciteHdd = capaciteHdd;
		this.bande_passante = bande_passante;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Hdd [id_hdd=" + id_hdd + ", marqueHdd=" + marqueHdd + ", capaciteHdd=" + capaciteHdd + ", bande_passante="
				+ bande_passante + ", type=" + type + "]";
	}
	public int getId_hdd() {
		return id_hdd;
	}
	public void setId_hdd(int id_hdd) {
		this.id_hdd = id_hdd;
	}
	public String getMarqueHdd() {
		return marqueHdd;
	}
	public void setMarqueHdd(String marqueHdd) {
		this.marqueHdd = marqueHdd;
	}
	public int getCapaciteHdd() {
		return capaciteHdd;
	}
	public void setCapaciteHdd(int capaciteHdd) {
		this.capaciteHdd = capaciteHdd;
	}
	public String getBande_passante() {
		return bande_passante;
	}
	public void setBande_passante(String bande_passante) {
		this.bande_passante = bande_passante;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
