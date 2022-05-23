package modele.domaine;

import java.io.Serializable;

public class Fournisseur implements Serializable {
	private int id_fournisseur ;
	 private String nom_fournisseur;
	 private String addresse;
	 private String tlf;
	 private String email;
	
	 public Fournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fournisseur(int id_fournisseur, String nom_fournisseur, String addresse, String tlf, String email) {
		super();
		this.id_fournisseur = id_fournisseur;
		this.nom_fournisseur = nom_fournisseur;
		this.addresse = addresse;
		this.tlf = tlf;
		this.email = email;
	}
	

	public Fournisseur(String nom_fournisseur, String addresse, String tlf, String email) {
		super();
		this.nom_fournisseur = nom_fournisseur;
		this.addresse = addresse;
		this.tlf = tlf;
		this.email = email;
	}

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

	@Override
	public String toString() {
		return "Fournisseur [id_fournisseur=" + id_fournisseur + ", nom_fournisseur=" + nom_fournisseur + ", addresse="
				+ addresse + ", tlf=" + tlf + ", email=" + email + "]";
	}
	
	
}
