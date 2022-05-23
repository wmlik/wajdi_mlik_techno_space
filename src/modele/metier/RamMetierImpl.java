package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Ram;


public class RamMetierImpl implements RamMetierInterface {

	private DaoInterface dao = null;	
	
	public RamMetierImpl() {
		 dao = new DaoImpl();
	}
	
	@Override
	public List<Ram> listeRam() {
		// TODO Auto-generated method stub
		List<Ram> cs= new ArrayList<Ram>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from Ram ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "Ram" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Ram c = new Ram();
					c.setId_ram(rs.getInt("id_ram"));
					c.setCapaciteRam(rs.getString("capaciteRam"));
					c.setMarqueRam(rs.getString("marqueRam"));
					c.setGenerationRam(rs.getString("generationRam"));
				
					 //ajouter l'objet "Ram" dans la liste
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
	public Ram getRamById(int id) {
		Ram c = new Ram();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from Ram where id_ram = ?");
			ps.setInt(1,id);
			
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				while(rs.next())
				{
					c.setId_ram(rs.getInt("id_ram"));
					c.setCapaciteRam(rs.getString("capaciteRam"));
					c.setMarqueRam(rs.getString("marqueRam"));
					c.setGenerationRam(rs.getString("generationRam"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Ram> listRamByinfo(String motDeRecherche) {
		List<Ram> users= new ArrayList<Ram>();

		try {
			// préparer la requête SQL
			String sql= "select * from Ram where marqueRam like ? or capaciteRam like ? or generationRam like ?  ";
			System.out.println(sql);
			System.out.println("mr:"+motDeRecherche);
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			//Affecter la valeur du paramètre
			ps.setString(1,"%"+motDeRecherche+"%");
			ps.setString(2,"%"+motDeRecherche+"%");
			ps.setString(3,"%"+motDeRecherche+"%");
			

			//ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "Ram" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Ram c = new Ram();
					c.setId_ram(rs.getInt("id_ram"));
					c.setCapaciteRam(rs.getString("capaciteRam"));
					c.setMarqueRam(rs.getString("marqueRam"));
					c.setGenerationRam(rs.getString("generationRam"));
					// ajouter l'objet "Ram" dans la liste
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
	public void addRam(Ram p) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into ram values (0,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getCapaciteRam());
			ps.setString(2, p.getMarqueRam());
			ps.setString(3, p.getGenerationRam());
		
			// executer la requête
			dao.ecrire(ps);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void updateRam(Ram u) {
		try {
			// préparer la requête SQL
			String sql = " update ram set id_ram = ?, capaciteRam=?, MarqueRam=?, GenerationRam =? where id_ram=? ";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, u.getId_ram());
			ps.setString(2, u.getCapaciteRam());
			ps.setString(3, u.getMarqueRam());
			ps.setString(4, u.getGenerationRam());
			ps.setInt(5, u.getId_ram());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteRam(int id) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from ram  where id_ram=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
