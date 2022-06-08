package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Fournisseur;

public class FournisseurMetierImpl implements FournisseurMetierInterface {

	private DaoInterface dao = null;

	public FournisseurMetierImpl() {
		dao = new DaoImpl();
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		
	}

	@Override
	public List<Fournisseur> listeFournisseur() {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		// TODO Auto-generated method stub
		List<Fournisseur> cs = new ArrayList<Fournisseur>();

		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from fournisseur ");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Fournisseur" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Fournisseur c = new Fournisseur();
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setNom_fournisseur(rs.getString("nom_fournisseur"));
					c.setAddresse(rs.getString("addresse"));
					c.setTlf(rs.getString("tlf"));
					c.setEmail(rs.getString("email"));
					// ajouter l'objet "Fournisseur" dans la liste
					cs.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return cs;
	}

	@Override
	public Fournisseur getFournisseurById(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		Fournisseur c = new Fournisseur();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection
					.prepareStatement(" select * from fournisseur where id_fournisseur = ?");
			ps.setInt(1, id);

			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				while (rs.next()) {
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setNom_fournisseur(rs.getString("nom_fournisseur"));
					c.setAddresse(rs.getString("addresse"));
					c.setTlf(rs.getString("tlf"));
					c.setEmail(rs.getString("email"));

				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Fournisseur> listFournisseurByinfo(String motDeRecherche) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		List<Fournisseur> users = new ArrayList<Fournisseur>();

		try {
			// préparer la requête SQL
			String sql = "select * from fournisseur where nom_fournisseur like ? or addresse like ? or tlf like ?or email like ?";

			PreparedStatement ps = dao.connection.prepareStatement(sql);
			// Affecter la valeur du paramètre
			ps.setString(1, "%" + motDeRecherche + "%");
			ps.setString(2, "%" + motDeRecherche + "%");
			ps.setString(3, "%" + motDeRecherche + "%");
			ps.setString(4, "%" + motDeRecherche + "%");

			// ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Fournisseur" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Fournisseur c = new Fournisseur();
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setNom_fournisseur(rs.getString("nom_fournisseur"));
					c.setAddresse(rs.getString("addresse"));
					c.setTlf(rs.getString("tlf"));
					c.setEmail(rs.getString("email"));
					// ajouter l'objet "Fournisseur" dans la liste
					users.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// retoturner la liste
		return users;
	}

	@Override
	public void addFournisseur(Fournisseur p) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into fournisseur values (0,?,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getNom_fournisseur());
			ps.setString(2, p.getAddresse());
			ps.setString(3, p.getTlf());
			ps.setString(4, p.getEmail());
			// executer la requête
			dao.ecrire(ps);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateFournisseur(Fournisseur u) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			String sql = " update fournisseur set id_fournisseur = ?, nom_fournisseur=?, addresse=?, Tlf =?, email =? where id_fournisseur=? ";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, u.getId_fournisseur());
			ps.setString(2, u.getNom_fournisseur());
			ps.setString(3, u.getAddresse());
			ps.setString(4, u.getTlf());
			ps.setString(5, u.getEmail());
			ps.setInt(6, u.getId_fournisseur());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteFournisseur(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from fournisseur  where id_fournisseur=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
