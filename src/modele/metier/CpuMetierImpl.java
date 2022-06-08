package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Cpu;

public class CpuMetierImpl implements CpuMetierInterface {

	private DaoInterface dao = null;

	public CpuMetierImpl() {
		dao = new DaoImpl();
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
	}

	@Override
	public List<Cpu> listeCpu() {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		// TODO Auto-generated method stub
		List<Cpu> cs = new ArrayList<Cpu>();

		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from cpu ");

			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Cpu c = new Cpu();
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setProcessor_number(rs.getString("processor_number"));
					c.setSpeed(rs.getString("speed"));
					c.setNombre_de_coeur(rs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(rs.getString("generationCpu"));
					// ajouter l'objet "Cpu" dans la liste
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
	public Cpu getCpuById(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		Cpu c = new Cpu();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from cpu where id_cpu = ?");
			ps.setInt(1, id);

			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				while (rs.next()) {
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setProcessor_number(rs.getString("processor_number"));
					c.setSpeed(rs.getString("speed"));
					c.setNombre_de_coeur(rs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(rs.getString("generationCpu"));

				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Cpu> listCpuByinfo(String motDeRecherche) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		List<Cpu> users = new ArrayList<Cpu>();

		try {
			// préparer la requête SQL
			String sql = "select * from cpu where processor_number like ? or generationCpu like ? or speed like ?";

			PreparedStatement ps = dao.connection.prepareStatement(sql);
			// Affecter la valeur du paramètre
			ps.setString(1, "%" + motDeRecherche + "%");
			ps.setString(2, "%" + motDeRecherche + "%");
			ps.setString(3, "%" + motDeRecherche + "%");

			// ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs = dao.lire(ps);
			if (rs != null) {
				// parcourir le résultat
				while (rs.next()) {
					// Construire un objet "Cpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Cpu c = new Cpu();
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setProcessor_number(rs.getString("processor_number"));
					c.setSpeed(rs.getString("speed"));
					c.setNombre_de_coeur(rs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(rs.getString("generationCpu"));
					// ajouter l'objet "Cpu" dans la liste
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
	public void addCpu(Cpu p) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
	
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into cpu values (0,?,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getProcessor_number());
			ps.setString(2, p.getGenerationCpu());
			ps.setString(3, p.getSpeed());
			ps.setInt(4, p.getNombre_de_coeur());
			// executer la requête
			dao.ecrire(ps);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void updateCpu(Cpu u) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			String sql = " update cpu set id_cpu = ?, processor_number=?, generationCpu=?, speed =?, nombre_de_coeur =? where id_cpu=? ";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, u.getId_cpu());
			ps.setString(2, u.getProcessor_number());
			ps.setString(3, u.getGenerationCpu());
			ps.setString(4, u.getSpeed());
			ps.setInt(5, u.getNombre_de_coeur());
			ps.setInt(6, u.getId_cpu());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void deleteCpu(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from cpu  where id_cpu=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
