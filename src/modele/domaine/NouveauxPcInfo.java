package modele.domaine;

import java.io.Serializable;

public class NouveauxPcInfo implements Serializable {

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
	private	int	id_fournisseur	;
	private	int	id_cpu	;
	private	int	id_gpu	;
	private	int	id_hdd;
	private	int	id_ram;
	
	
	public NouveauxPcInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public NouveauxPcInfo(int id_pc, String marquePc, String gamme, String couleur, String date_entree,
			String date_sortie, double prix_achat, double prix_vente, int qte_stock, int qte_vendu, int id_fournisseur,
			int id_cpu, int id_gpu, int id_hdd, int id_ram) {
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
		this.id_fournisseur = id_fournisseur;
		this.id_cpu = id_cpu;
		this.id_gpu = id_gpu;
		this.id_hdd = id_hdd;
		this.id_ram = id_ram;
	}
	
	

	public NouveauxPcInfo(String marquePc, String gamme, String couleur, String date_entree, String date_sortie,
			double prix_achat, double prix_vente, int qte_stock, int qte_vendu, int id_fournisseur, int id_cpu,
			int id_gpu, int id_hdd, int id_ram) {
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
		this.id_fournisseur = id_fournisseur;
		this.id_cpu = id_cpu;
		this.id_gpu = id_gpu;
		this.id_hdd = id_hdd;
		this.id_ram = id_ram;
	}

	
	
	
	@Override
	public String toString() {
		return "NouveauxPcInfo [id_pc=" + id_pc + ", MarquePc=" + MarquePc + ", gamme=" + gamme + ", couleur=" + couleur
				+ ", date_entree=" + date_entree + ", date_sortie=" + date_sortie + ", prix_achat=" + prix_achat
				+ ", prix_vente=" + prix_vente + ", qte_stock=" + qte_stock + ", qte_vendu=" + qte_vendu
				+ ", id_fournisseur=" + id_fournisseur + ", id_cpu=" + id_cpu + ", id_gpu=" + id_gpu + ", id_hdd="
				+ id_hdd + ", id_ram=" + id_ram + ", getId_pc()=" + getId_pc() + ", getMarquePc()=" + getMarquePc()
				+ ", getGamme()=" + getGamme() + ", getCouleur()=" + getCouleur() + ", getDate_entree()="
				+ getDate_entree() + ", getDate_sortie()=" + getDate_sortie() + ", getPrix_achat()=" + getPrix_achat()
				+ ", getPrix_vente()=" + getPrix_vente() + ", getQte_stock()=" + getQte_stock() + ", getQte_vendu()="
				+ getQte_vendu() + ", getId_fournisseur()=" + getId_fournisseur() + ", getId_cpu()=" + getId_cpu()
				+ ", getId_gpu()=" + getId_gpu() + ", getId_hdd()=" + getId_hdd() + ", getId_ram()=" + getId_ram()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	public void setMarquePc(String MarquePc) {
		this.MarquePc = MarquePc;
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
	public int getId_fournisseur() {
		return id_fournisseur;
	}
	public void setId_fournisseur(int id_fournisseur) {
		this.id_fournisseur = id_fournisseur;
	}
	public int getId_cpu() {
		return id_cpu;
	}
	public void setId_cpu(int id_cpu) {
		this.id_cpu = id_cpu;
	}
	public int getId_gpu() {
		return id_gpu;
	}
	public void setId_gpu(int id_gpu) {
		this.id_gpu = id_gpu;
	}
	
	public int getId_hdd() {
		return id_hdd;
	}

	public void setId_hdd(int id_hdd) {
		this.id_hdd = id_hdd;
	}

	public int getId_ram() {
		return id_ram;
	}
	public void setId_ram(int id_ram) {
		this.id_ram = id_ram;
	}
	
	
}
