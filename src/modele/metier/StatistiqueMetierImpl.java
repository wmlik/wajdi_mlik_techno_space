package modele.metier;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Statistique;

public class StatistiqueMetierImpl implements StatistiqueMetierInterface {
	private DaoInterface dao = null;

	public StatistiqueMetierImpl() {
		dao = new DaoImpl();
	}
	
	@Override
	public List<Statistique> liste_benefice_par_date() {
		List<Statistique> cs1 = new ArrayList<Statistique>();

		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT `date_sortie`,SUM(`qte_vendu`*(`prix_vente`-`prix_achat`)) benefice, SUM(`qte_vendu`) qt_vend,COUNT(`date_sortie`) qt_art FROM `nouveauxpcinfo`  GROUP BY `date_sortie`  ORDER BY benefice DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setBenefice(rs.getInt("benefice"));
					c.setDate_sortie(rs.getString("date_sortie"));
					c.setQt_vend(rs.getInt("qt_vend"));
					c.setQt_art(rs.getInt("qt_art"));			
					// ajouter l'objet "Cpu" dans la liste
					cs1.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs1;
	}

	@Override
	public List<Statistique> liste_benefice_qte_pc() {
		List<Statistique> cs2 = new ArrayList<Statistique>();

		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT  `marquePC`,`processor_number`, SUM(`qte_vendu`) qt_vend,SUM(`qte_vendu`*(`prix_vente`-`prix_achat`)) benefice FROM `nouveauxpcinfo`,`cpu` WHERE `nouveauxpcinfo`.`id_pc` = `cpu`.`id_cpu`  GROUP BY `marquePC`,`processor_number`  ORDER BY benefice DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setMarque_pc(rs.getString("marquepc"));
					c.setBenefice(rs.getInt("benefice"));
					c.setQt_vend(rs.getInt("qt_vend"));
					c.setProcessor_number(rs.getString("processor_number"));			
					// ajouter l'objet "Cpu" dans la liste
					cs2.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs2;
		
		
	}

	@Override
	public List<Statistique> list_benefice_par_pc() {
		List<Statistique> cs3 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT  `marquePC`,`processor_number`,`generationCpu`,`marqueGpu`,`capaciteGpu`,(`prix_vente`-`prix_achat`) benefice FROM `nouveauxpcinfo`,`cpu`,`gpu` WHERE `nouveauxpcinfo`.`id_pc` = `cpu`.`id_cpu` AND `nouveauxpcinfo`.`id_gpu` = `gpu`.`id_gpu`  ORDER BY benefice DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setMarque_pc(rs.getString("marquepc"));
					c.setBenefice(rs.getInt("benefice"));
					c.setMarque_gpu(rs.getString("marqueGpu"));
					c.setProcessor_number(rs.getString("processor_number"));
					c.setGenerationCpu(rs.getString("generationCpu"));
					c.setCapacitegpu(rs.getInt("capaciteGpu"));
					// ajouter l'objet "Cpu" dans la liste
					cs3.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs3;
	}

	@Override
	public List<Statistique> list_vente_par_couleur() {
		List<Statistique> cs4 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT SUM(`qte_vendu`) qte_vend_par_couleur,`couleur` FROM `nouveauxpcinfo`  GROUP BY `couleur`  ORDER BY qte_vend_par_couleur DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setQt_vend(rs.getInt("qte_vend_par_couleur"));
					c.setCouleur(rs.getString("couleur"));
					// ajouter l'objet "Cpu" dans la liste
					cs4.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs4;
	}

	@Override
	public List<Statistique> list_vente_par_hdd() {
		List<Statistique> cs5 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT `type`,`capaciteHdd` ,SUM(`qte_vendu`) qte_vend_par_hdd FROM `nouveauxpcinfo`,`hdd` WHERE  `nouveauxpcinfo`.`id_hdd`=`hdd`.`id_hdd` GROUP BY `type`,`capaciteHdd`  ORDER BY qte_vend_par_hdd DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setQt_vend(rs.getInt("qte_vend_par_hdd"));
					c.setType(rs.getString("type"));
					c.setCapaciteHdd(rs.getInt("capaciteHdd"));
					// ajouter l'objet "Cpu" dans la liste
					cs5.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs5;
	}

	@Override
	public List<Statistique> list_vente_par_gpu() {
		List<Statistique> cs6 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT `marqueGpu`,`capaciteGpu` ,SUM(`qte_vendu`) qte_vend_par_gpu FROM `nouveauxpcinfo`,`gpu` WHERE  `nouveauxpcinfo`.`id_gpu`=`gpu`.`id_gpu` GROUP BY  `marqueGpu`,`capaciteGpu` ORDER BY qte_vend_par_gpu DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setQt_vend(rs.getInt("qte_vend_par_gpu"));
					c.setMarque_gpu(rs.getString("marqueGpu"));
					c.setCapacitegpu(rs.getInt("capacitegpu"));
					// ajouter l'objet "Cpu" dans la liste
					cs6.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs6;
	}

	@Override
	public List<Statistique> list_vente_par_fornissuer() {
		List<Statistique> cs7 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT `nom_fournisseur`, SUM(`prix_achat`*(`prix_vente`+`qte_stock`)) somme_achat, SUM(`qte_vendu`+`qte_stock`) qt_acha_forniss, COUNT(`nouveauxpcinfo`.`id_fournisseur`) qte_art,SUM(`qte_vendu`*(`prix_vente`-`prix_achat`)) benefice,SUM(`qte_stock`) qte_stok FROM `nouveauxpcinfo`,`fournisseur` WHERE `nouveauxpcinfo`.`id_fournisseur` = `fournisseur`.`id_fournisseur` GROUP BY `nom_fournisseur` ORDER BY qt_acha_forniss DESC;");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setNom_fournisseur(rs.getString("nom_fournisseur"));
					c.setBenefice(rs.getInt("benefice"));
					c.setSomme_achat(rs.getInt("somme_achat"));
					c.setQt_achat(rs.getInt("qt_acha_forniss"));
					c.setQt_art(rs.getInt("qte_art"));
					c.setQte_stok(rs.getInt("qte_stok"));
					// ajouter l'objet "Cpu" dans la liste
					cs7.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs7;
	}

	@Override
	public List<Statistique> list_qteStock_par_marque_cpu() {
		List<Statistique> cs8 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT  `marquePC`,`processor_number`, SUM(`qte_stock`) qt_stok FROM `nouveauxpcinfo`,`cpu` WHERE `nouveauxpcinfo`.`id_pc` = `cpu`.`id_cpu`  GROUP BY `marquePC`,`processor_number`  ORDER BY qt_stok");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setMarque_pc(rs.getString("marquepc"));
					c.setProcessor_number(rs.getString("processor_number"));;
					c.setQte_stok(rs.getInt("qt_stok"));
					// ajouter l'objet "Cpu" dans la liste
					cs8.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs8;
	}

	@Override
	public List<Statistique> list_vente_par_gamme() {
		List<Statistique> cs9 = new ArrayList<Statistique>();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement("SELECT  `gamme`, SUM(`qte_vendu`) qt_vend FROM `nouveauxpcinfo`  GROUP BY `gamme`  ORDER BY qt_vend DESC");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Statistique c = new Statistique();
					c.setQt_vend(rs.getInt("qt_vend"));
					c.setGamme(rs.getString("gamme"));
					// ajouter l'objet "Cpu" dans la liste
					cs9.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs9;
	}

	

}
