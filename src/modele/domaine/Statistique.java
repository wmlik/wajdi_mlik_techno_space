package modele.domaine;

import java.io.Serializable;

public class Statistique implements Serializable {

	private String nom_fournisseur;
	private String marque_pc;
	private String marque_gpu;
	private String generationCpu;
	private int somme_achat;
	private int benefice;
	private String date_sortie;
	private int qt_vend;
	private int qt_achat;
	private int qt_art;
	private String processor_number;
	private String couleur;
	private int capaciteHdd;
	private String capacitegpu;
	private int qte_stok;
	private String type;
	private String gamme;
	
	
	
	public Statistique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Statistique(int benefice, String date_sortie, int qt_vend, int qt_art) {
		//list marbou7 7aseb nhar fih ,9adech be3na men pc, ou9adech men article
		//liste_benefice_par_date
		super();
		this.benefice = benefice;
		this.date_sortie = date_sortie;
		this.qt_vend = qt_vend;
		this.qt_art = qt_art;
	}
	

	
	public String liste_benefice_par_date() {
		return "Statistique [benefice=" + benefice + ", date_sortie=" + date_sortie + ", qt_vend=" + qt_vend
				+ ", qt_art=" + qt_art + "]";
	}

	public Statistique(String marque_pc, int benefice, int qt_vend, String processor_number) {
		//list marbou7 7asb marque fiha ,cpu ou  9adech be3na men ka3ba
		//liste_benefice_qte_pc
		super();
		this.marque_pc = marque_pc;
		this.benefice = benefice;
		this.qt_vend = qt_vend;
		this.processor_number = processor_number;
	}
	
	public String liste_benefice_qte_pc() {
		return "Statistique [marque_pc=" + marque_pc + ", benefice=" + benefice + ", qt_vend=" + qt_vend
				+ ", processor_number=" + processor_number + "]";
	}

	public Statistique(String marque_pc, String marque_gpu, String generationCpu, int benefice, String processor_number,
			String capacitegpu) {
		//list akthar pc fiha marbou7
		//list_benefice_par_pc
		super();
		this.marque_pc = marque_pc;
		this.marque_gpu = marque_gpu;
		this.generationCpu = generationCpu;
		this.benefice = benefice;
		this.processor_number = processor_number;
		this.capacitegpu = capacitegpu;
	}
	
	
	public String list_benefice_par_pc() {
		return "Statistique [marque_pc=" + marque_pc + ", marque_gpu=" + marque_gpu + ", generationCpu=" + generationCpu
				+ ", benefice=" + benefice + ", processor_number=" + processor_number + ", capacitegpu=" + capacitegpu
				+ "]";
	}

	public Statistique(int qt_vend, String couleur) {
		//list byou3 pc 7asb les couleur
		//list_vente_par_couleur
		super();
		this.qt_vend = qt_vend;
		this.couleur = couleur;
	}

	
	public String list_vente_par_couleur() {
		return "Statistique [qt_vend=" + qt_vend + ", couleur=" + couleur + "]";
	}

	public Statistique(int qt_vend, int capaciteHdd, String type) {
		//list hdd 7aseb 9adech be3na menou
		//list_vente_par_hdd
		super();
		this.qt_vend = qt_vend;
		this.capaciteHdd = capaciteHdd;
		this.type = type;
	}

	
	public String list_vente_par_hdd() {
		return "Statistique [qt_vend=" + qt_vend + ", capaciteHdd=" + capaciteHdd + ", type=" + type + "]";
	}

	public Statistique(String marque_gpu, int qt_vend, String capacitegpu) {
		//list gpu 7aseb 9adech be3na menou
		//list_vente_par_gpu
		super();
		this.marque_gpu = marque_gpu;
		this.qt_vend = qt_vend;
		this.capacitegpu = capacitegpu;
	}

	
	public String list_vente_par_gpu() {
		return "Statistique [marque_gpu=" + marque_gpu + ", qt_vend=" + qt_vend + ", capacitegpu=" + capacitegpu + "]";
	}

	public Statistique(String nom_fournisseur, int somme_achat, int benefice, int qt_achat, int qt_art, int qte_stok) {
		//list fornissuer
		//list_vente_par_fornissuer
		super();
		this.nom_fournisseur = nom_fournisseur;
		this.somme_achat = somme_achat;
		this.benefice = benefice;
		this.qt_achat = qt_achat;
		this.qt_art = qt_art;
		this.qte_stok = qte_stok;
	}

	
	public String list_vente_par_fornissuer() {
		return "Statistique [nom_fournisseur=" + nom_fournisseur + ", somme_achat=" + somme_achat + ", benefice="
				+ benefice + ", qt_achat=" + qt_achat + ", qt_art=" + qt_art + ", qte_stok=" + qte_stok + "]";
	}

	public Statistique(String marque_pc, String processor_number, int qte_stok) {
		//list qte_stok par marque et cpu
		//list_qteStock_par_marque_cpu
		super();
		this.marque_pc = marque_pc;
		this.processor_number = processor_number;
		this.qte_stok = qte_stok;
	}

	
	public String list_qteStock_par_marque_cpu() {
		return "Statistique [marque_pc=" + marque_pc + ", processor_number=" + processor_number + ", qte_stok="
				+ qte_stok + "]";
	}

	public Statistique(String gamme,int qt_vend) {
		//list les gamme par rapport qte vente
		//list_vente_par_gamme
		super();
		this.qt_vend = qt_vend;
		this.gamme = gamme;
	}


	public String list_vente_par_gamme() {
		return "Statistique [qt_vend=" + qt_vend + ", gamme=" + gamme + "]";
	}
	
	

	@Override
	public String toString() {
		return "Statistique [nom_fournisseur=" + nom_fournisseur + ", marque_pc=" + marque_pc + ", marque_gpu="
				+ marque_gpu + ", generationCpu=" + generationCpu + ", somme_achat=" + somme_achat + ", benefice="
				+ benefice + ", date_sortie=" + date_sortie + ", qt_vend=" + qt_vend + ", qt_achat=" + qt_achat
				+ ", qt_art=" + qt_art + ", processor_number=" + processor_number + ", couleur=" + couleur
				+ ", capaciteHdd=" + capaciteHdd + ", capacitegpu=" + capacitegpu + ", qte_stok=" + qte_stok + ", type="
				+ type + ", gamme=" + gamme + "]";
	}

	public String getNom_fournisseur() {
		return nom_fournisseur;
	}

	public void setNom_fournisseur(String nom_fournisseur) {
		this.nom_fournisseur = nom_fournisseur;
	}

	public String getMarque_pc() {
		return marque_pc;
	}

	public void setMarque_pc(String marque_pc) {
		this.marque_pc = marque_pc;
	}

	public String getMarque_gpu() {
		return marque_gpu;
	}

	public void setMarque_gpu(String marque_gpu) {
		this.marque_gpu = marque_gpu;
	}

	public int getSomme_achat() {
		return somme_achat;
	}

	public void setSomme_achat(int somme_achat) {
		this.somme_achat = somme_achat;
	}

	public int getBenefice() {
		return benefice;
	}

	public void setBenefice(int benefice) {
		this.benefice = benefice;
	}

	public String getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(String date_sortie) {
		this.date_sortie = date_sortie;
	}

	public int getQt_vend() {
		return qt_vend;
	}

	public void setQt_vend(int qt_vend) {
		this.qt_vend = qt_vend;
	}

	public int getQt_achat() {
		return qt_achat;
	}

	public void setQt_achat(int qt_achat) {
		this.qt_achat = qt_achat;
	}

	public int getQt_art() {
		return qt_art;
	}

	public void setQt_art(int qt_art) {
		this.qt_art = qt_art;
	}

	public String getProcessor_number() {
		return processor_number;
	}

	public void setProcessor_number(String processor_number) {
		this.processor_number = processor_number;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public int getCapaciteHdd() {
		return capaciteHdd;
	}

	public void setCapaciteHdd(int capaciteHdd) {
		this.capaciteHdd = capaciteHdd;
	}

	public String getCapacitegpu() {
		return capacitegpu;
	}

	public void setCapacitegpu(String capacitegpu) {
		this.capacitegpu = capacitegpu;
	}

	public int getQte_stok() {
		return qte_stok;
	}

	public void setQte_stok(int qte_stok) {
		this.qte_stok = qte_stok;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGamme() {
		return gamme;
	}

	public void setGamme(String gamme) {
		this.gamme = gamme;
	}

	public String getGenerationCpu() {
		return generationCpu;
	}

	public void setGenerationCpu(String generationCpu) {
		this.generationCpu = generationCpu;
	}

	
	
	

}
