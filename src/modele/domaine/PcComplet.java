package modele.domaine;

import java.io.Serializable;

public class PcComplet implements Serializable{
	
	private int	id_pc	;
	private String	MarquePc	;
	private	String gamme	;
	private	String couleur	;
	private	String date_entree	;
	private	String date_sortie	;
	private	double prix_achat	;
	private	double prix_vente	;
	private	int qte_stock	;
	private	int qte_vendu	;
	private	int	id_fournisseurPc	;
	private	int	id_cpuPc	;
	private	int	id_gpuPc	;
	private	int	id_hddPc;
	private	int	id_ramPc;
	
	private int id_cpu;
	private String processor_number;
	private String generationCpu;
	private String speed;
	private int nombre_de_coeur;
	
	private int id_ram;
	private String capaciteRam;
	private String marqueRam; 
	private String generationRam;
	
	private int id_hdd;
	private String marqueHdd;	
	private int capaciteHdd;	
	private String bande_passante;
	private String type;
	
	private int id_gpu;
	private String marqueGpu;
	private String capaciteGpu;
	private String vitesse;
	
	private int id_fournisseur ;
	private String nom_fournisseur;
	private String addresse;
	private String tlf;
	private String email;
	
	
	
	public int getId_fournisseur() {
		return id_fournisseur;
	}




	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}




	public String getNom_fournisseur() {
		return nom_fournisseur;
	}




	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}




	public String getAddresse() {
		return addresse;
	}




	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}




	public String getTlf() {
		return tlf;
	}




	public void setTlf(String tlf) {
		this.tlf = tlf;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public PcComplet() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public PcComplet(int id_pc, String marquePc, String gamme, String couleur, String date_entree, String date_sortie,
			double prix_achat, double prix_vente, int qte_stock, int qte_vendu, int id_fournisseurPc, int id_cpuPc,
			int id_gpuPc, int id_hddPc, int id_ramPc, int id_cpu, String processor_number, String generationCpu,
			String speed, int nombre_de_coeur, int id_ram, String capaciteRam, String marqueRam, String generationRam,
			int id_hdd, String marqueHdd, int capaciteHdd, String bande_passante, String type, int id_gpu,
			String marqueGpu, String capaciteGpu, String vitesse, int id_fournisseur, String nom_fournisseur,
			String addresse, String tlf, String email) {
		super();
		this.id_pc = id_pc;
		MarquePc = marquePc;
		this.gamme = gamme;
		this.couleur = couleur;
		this.date_entree = date_entree;
		this.date_sortie = date_sortie;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
		this.qte_stock = qte_stock;
		this.qte_vendu = qte_vendu;
		this.id_fournisseurPc = id_fournisseurPc;
		this.id_cpuPc = id_cpuPc;
		this.id_gpuPc = id_gpuPc;
		this.id_hddPc = id_hddPc;
		this.id_ramPc = id_ramPc;
		this.id_cpu = id_cpu;
		this.processor_number = processor_number;
		this.generationCpu = generationCpu;
		this.speed = speed;
		this.nombre_de_coeur = nombre_de_coeur;
		this.id_ram = id_ram;
		this.capaciteRam = capaciteRam;
		this.marqueRam = marqueRam;
		this.generationRam = generationRam;
		this.id_hdd = id_hdd;
		this.marqueHdd = marqueHdd;
		this.capaciteHdd = capaciteHdd;
		this.bande_passante = bande_passante;
		this.type = type;
		this.id_gpu = id_gpu;
		this.marqueGpu = marqueGpu;
		this.capaciteGpu = capaciteGpu;
		this.vitesse = vitesse;
		this.id_fournisseur = id_fournisseur;
		this.nom_fournisseur = nom_fournisseur;
		this.addresse = addresse;
		this.tlf = tlf;
		this.email = email;
	}




	
	public PcComplet(String marquePc, String gamme, String couleur, String date_entree, String date_sortie,
			double prix_achat, double prix_vente, int qte_stock, int qte_vendu, int id_fournisseurPc, int id_cpuPc,
			int id_gpuPc, int id_hddPc, int id_ramPc, String processor_number, String generationCpu, String speed,
			int nombre_de_coeur, String capaciteRam, String marqueRam, String generationRam, String marqueHdd,
			int capaciteHdd, String bande_passante, String type, String marqueGpu, String capaciteGpu, String vitesse,
			String nom_fournisseur, String addresse, String tlf, String email) {
		super();
		MarquePc = marquePc;
		this.gamme = gamme;
		this.couleur = couleur;
		this.date_entree = date_entree;
		this.date_sortie = date_sortie;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
		this.qte_stock = qte_stock;
		this.qte_vendu = qte_vendu;
		this.id_fournisseurPc = id_fournisseurPc;
		this.id_cpuPc = id_cpuPc;
		this.id_gpuPc = id_gpuPc;
		this.id_hddPc = id_hddPc;
		this.id_ramPc = id_ramPc;
		this.processor_number = processor_number;
		this.generationCpu = generationCpu;
		this.speed = speed;
		this.nombre_de_coeur = nombre_de_coeur;
		this.capaciteRam = capaciteRam;
		this.marqueRam = marqueRam;
		this.generationRam = generationRam;
		this.marqueHdd = marqueHdd;
		this.capaciteHdd = capaciteHdd;
		this.bande_passante = bande_passante;
		this.type = type;
		this.marqueGpu = marqueGpu;
		this.capaciteGpu = capaciteGpu;
		this.vitesse = vitesse;
		this.nom_fournisseur = nom_fournisseur;
		this.addresse = addresse;
		this.tlf = tlf;
		this.email = email;
	}

	@Override
	public String toString() {
		return "PcComplet [id_pc=" + id_pc + ", MarquePc=" + MarquePc + ", gamme=" + gamme + ", couleur=" + couleur
				+ ", date_entree=" + date_entree + ", date_sortie=" + date_sortie + ", prix_achat=" + prix_achat
				+ ", prix_vente=" + prix_vente + ", qte_stock=" + qte_stock + ", qte_vendu=" + qte_vendu
				+ ", id_fournisseurPc=" + id_fournisseurPc + ", id_cpuPc=" + id_cpuPc + ", id_gpuPc=" + id_gpuPc
				+ ", id_hddPc=" + id_hddPc + ", id_ramPc=" + id_ramPc + ", id_cpu=" + id_cpu + ", processor_number="
				+ processor_number + ", generationCpu=" + generationCpu + ", speed=" + speed + ", nombre_de_coeur="
				+ nombre_de_coeur + ", id_ram=" + id_ram + ", capaciteRam=" + capaciteRam + ", marqueRam=" + marqueRam
				+ ", generationRam=" + generationRam + ", id_hdd=" + id_hdd + ", marqueHdd=" + marqueHdd
				+ ", capaciteHdd=" + capaciteHdd + ", bande_passante=" + bande_passante + ", type=" + type + ", id_gpu="
				+ id_gpu + ", marqueGpu=" + marqueGpu + ", capaciteGpu=" + capaciteGpu + ", vitesse=" + vitesse
				+ ", id_fournisseur=" + id_fournisseur + ", nom_fournisseur=" + nom_fournisseur + ", addresse="
				+ addresse + ", tlf=" + tlf + ", email=" + email + ", getId_fournisseur()=" + getId_fournisseur()
				+ ", getNom_fournisseur()=" + getNom_fournisseur() + ", getAddresse()=" + getAddresse() + ", getTlf()="
				+ getTlf() + ", getEmail()=" + getEmail() + ", getId_cpu()=" + getId_cpu() + ", getProcessor_number()="
				+ getProcessor_number() + ", getGenerationCpu()=" + getGenerationCpu() + ", getSpeed()=" + getSpeed()
				+ ", getNombre_de_coeur()=" + getNombre_de_coeur() + ", getId_gpu()=" + getId_gpu()
				+ ", getMarqueGpu()=" + getMarqueGpu() + ", getCapaciteGpu()=" + getCapaciteGpu() + ", getVitesse()="
				+ getVitesse() + ", getId_hdd()=" + getId_hdd() + ", getMarqueHdd()=" + getMarqueHdd()
				+ ", getCapaciteHdd()=" + getCapaciteHdd() + ", getBande_passante()=" + getBande_passante()
				+ ", getType()=" + getType() + ", getId_pc()=" + getId_pc() + ", getMarquePc()=" + getMarquePc()
				+ ", getGamme()=" + getGamme() + ", getCouleur()=" + getCouleur() + ", getDate_entree()="
				+ getDate_entree() + ", getDate_sortie()=" + getDate_sortie() + ", getPrix_achat()=" + getPrix_achat()
				+ ", getPrix_vente()=" + getPrix_vente() + ", getQte_stock()=" + getQte_stock() + ", getQte_vendu()="
				+ getQte_vendu() + ", getId_fournisseurPc()=" + getId_fournisseurPc() + ", getId_cpuPc()="
				+ getId_cpuPc() + ", getId_gpuPc()=" + getId_gpuPc() + ", getId_hddPc()=" + getId_hddPc()
				+ ", getId_ramPc()=" + getId_ramPc() + ", getId_ram()=" + getId_ram() + ", getCapaciteRam()="
				+ getCapaciteRam() + ", getMarqueRam()=" + getMarqueRam() + ", getGenerationRam()=" + getGenerationRam()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public int getId_pc() {
		return id_pc;
	}
	public void setId_pc(int id_pc) {
		this.id_pc = id_pc;
	}
	public String getMarquePc() {
		return MarquePc;
	}
	public void setMarquePc(String marquePc) {
		MarquePc = marquePc;
	}
	public String getGamme() {
		return gamme;
	}
	public void setGamme(String gamme) {
		this.gamme = gamme;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public String getDate_entree() {
		return date_entree;
	}
	public void setDate_entree(String date_entree) {
		this.date_entree = date_entree;
	}
	public String getDate_sortie() {
		return date_sortie;
	}
	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}
	public double getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}
	public double getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}
	public int getQte_stock() {
		return qte_stock;
	}
	public void setQte_stock(int qte_stock) {
		this.qte_stock = qte_stock;
	}
	public int getQte_vendu() {
		return qte_vendu;
	}
	public void setQte_vendu(int qte_vendu) {
		this.qte_vendu = qte_vendu;
	}
	public int getId_fournisseurPc() {
		return id_fournisseurPc;
	}
	public void setId_fournisseurPc(int id_fournisseur) {
		this.id_fournisseurPc = id_fournisseur;
	}
	public int getId_cpuPc() {
		return id_cpuPc;
	}
	public void setId_cpuPc(int id_cpuPc) {
		this.id_cpuPc = id_cpuPc;
	}
	public int getId_gpuPc() {
		return id_gpuPc;
	}
	public void setId_gpuPc(int id_gpuPc) {
		this.id_gpuPc = id_gpuPc;
	}
	public int getId_hddPc() {
		return id_hddPc;
	}
	public void setId_hddPc(int id_hddPc) {
		this.id_hddPc = id_hddPc;
	}
	public int getId_ramPc() {
		return id_ramPc;
	}
	public void setId_ramPc(int id_ramPc) {
		this.id_ramPc = id_ramPc;
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
