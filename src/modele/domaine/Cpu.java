package modele.domaine;

import java.io.Serializable;

public class Cpu implements Serializable {
	 private int id_cpu;
	 private String processor_number;
	 private String generationCpu;
	 private String speed;
	 private int nombre_de_coeur;
	 
	public Cpu(int id_cpu, String processor_number, String generationCpu, String speed, int nombre_de_coeur) {
		super();
		this.id_cpu = id_cpu;
		this.processor_number = processor_number;
		this.generationCpu = generationCpu;
		this.speed = speed;
		this.nombre_de_coeur = nombre_de_coeur;
	}
	public Cpu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Cpu(String processor_number, String generationCpu, String speed, int nombre_de_coeur) {
		super();
		this.processor_number = processor_number;
		this.generationCpu = generationCpu;
		this.speed = speed;
		this.nombre_de_coeur = nombre_de_coeur;
	}
	@Override
	public String toString() {
		return "Cpu [id_cpu=" + id_cpu + ", processor_number=" + processor_number + ", generationCpu=" + generationCpu
				+ ", speed=" + speed + ", nombre_de_coeur=" + nombre_de_coeur + "]";
	}
	public int getId_cpu() {
		return id_cpu;
	}
	public void setId_cpu(int id_cpu) {
		this.id_cpu = id_cpu;
	}
	public String getProcessor_number() {
		return processor_number;
	}
	public void setProcessor_number(String processor_number) {
		this.processor_number = processor_number;
	}
	public String getGenerationCpu() {
		return generationCpu;
	}
	public void setGenerationCpu(String generationCpu) {
		this.generationCpu = generationCpu;
	}
	public String getSpeed() {
		return speed;
	}
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	public int getNombre_de_coeur() {
		return nombre_de_coeur;
	}
	public void setNombre_de_coeur(int nombre_de_coeur) {
		this.nombre_de_coeur = nombre_de_coeur;
	}
	
	 
	 
}
