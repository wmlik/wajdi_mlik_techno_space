package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Hdd;


public class HddMetierImpl implements HddMetierInterface {

	private DaoInterface dao = null;	
	
	public HddMetierImpl() {
		 dao = new DaoImpl();
		 TestConnectMetierInterface test = new TestConnectMetierImpl();
			test.test();
			
	}
	
	@Override
	public List<Hdd> listeHdd() {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		// TODO Auto-generated method stub
		List<Hdd> cs= new ArrayList<Hdd>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from hdd ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "Hdd" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Hdd c = new Hdd();
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setMarqueHdd(rs.getString("marqueHdd"));
					c.setCapaciteHdd(rs.getInt("capaciteHdd"));
					c.setBande_passante(rs.getString("bande_passante"));
					c.setType(rs.getString("type"));
					 //ajouter l'objet "Hdd" dans la liste
					cs.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//retoturner la liste
		return cs;
	}
	
	@Override
	public Hdd getHddById(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		Hdd c = new Hdd();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from hdd where id_hdd = ?");
			ps.setInt(1,id);
			
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				while(rs.next())
				{
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setMarqueHdd(rs.getString("marqueHdd"));
					c.setCapaciteHdd(rs.getInt("capaciteHdd"));
					c.setBande_passante(rs.getString("bande_passante"));
					c.setType(rs.getString("type"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Hdd> listHddByinfo(String motDeRecherche) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		List<Hdd> users= new ArrayList<Hdd>();

		try {
			// préparer la requête SQL
			String sql= "select * from hdd where marqueHdd like ? or capaciteHdd like ? or bande_passante like ? or type like ?  ";
			
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			//Affecter la valeur du paramètre
			ps.setString(1,"%"+motDeRecherche+"%");
			ps.setString(2,"%"+motDeRecherche+"%");
			ps.setString(3,"%"+motDeRecherche+"%");
			ps.setString(4,"%"+motDeRecherche+"%");

			//ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "Hdd" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Hdd c = new Hdd();
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setMarqueHdd(rs.getString("marqueHdd"));
					c.setCapaciteHdd(rs.getInt("capaciteHdd"));
					c.setBande_passante(rs.getString("bande_passante"));
					c.setType(rs.getString("type"));
					// ajouter l'objet "Hdd" dans la liste
					users.add(c);
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//retoturner la liste
		return users;
	}

	

	@Override
	public void addHdd(Hdd p) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into hdd values (0,?,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getMarqueHdd());
			ps.setInt(2, p.getCapaciteHdd());
			ps.setString(3, p.getBande_passante());
			ps.setString(4, p.getType());
			// executer la requête
			dao.ecrire(ps);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void updateHdd(Hdd u) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			String sql = " update hdd set id_hdd = ?, marqueHdd=?, capaciteHdd=?, Bande_passante =?, Type =? where id_hdd=? ";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, u.getId_hdd());
			ps.setString(2, u.getMarqueHdd());
			ps.setInt(3, u.getCapaciteHdd());
			ps.setString(4, u.getBande_passante());
			ps.setString(5, u.getType());
			ps.setInt(6, u.getId_hdd());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteHdd(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from hdd  where id_hdd=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
