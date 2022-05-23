package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Gpu;


public class GpuMetierImpl implements GpuMetierInterface {

	private DaoInterface dao = null;	
	
	public GpuMetierImpl() {
		 dao = new DaoImpl();
	}
	
	@Override
	public List<Gpu> listeGpu() {
		// TODO Auto-generated method stub
		List<Gpu> cs= new ArrayList<Gpu>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from Gpu ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "Gpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Gpu c = new Gpu();
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setMarqueGpu(rs.getString("marqueGpu"));
					c.setCapaciteGpu(rs.getString("capaciteGpu"));
					c.setVitesse(rs.getString("vitesse"));
					
					 //ajouter l'objet "Gpu" dans la liste
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
	public Gpu getGpuById(int id) {
		Gpu c = new Gpu();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from Gpu where id_gpu = ?");
			ps.setInt(1,id);
			
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				while(rs.next())
				{
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setMarqueGpu(rs.getString("marqueGpu"));
					c.setCapaciteGpu(rs.getString("capaciteGpu"));
					c.setVitesse(rs.getString("vitesse"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<Gpu> listGpuByinfo(String motDeRecherche) {
		List<Gpu> users= new ArrayList<Gpu>();

		try {
			// préparer la requête SQL
			String sql= "select * from Gpu where marqueGpu like ? or capaciteGpu like ? or vitesse like ?";
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
					//Construire un objet "Gpu" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					Gpu c = new Gpu();
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setMarqueGpu(rs.getString("marqueGpu"));
					c.setCapaciteGpu(rs.getString("capaciteGpu"));
					c.setVitesse(rs.getString("vitesse"));
					// ajouter l'objet "Gpu" dans la liste
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
	public void addGpu(Gpu p) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into gpu values (0,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getMarqueGpu());
			ps.setString(2, p.getCapaciteGpu());
			ps.setString(3, p.getVitesse());
			
			// executer la requête
			dao.ecrire(ps);
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void updateGpu(Gpu u) {
		try {
			// préparer la requête SQL
			String sql = " update gpu set id_gpu=?, marqueGpu=?, capaciteGpu=?, vitesse =?  where id_gpu=?";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, u.getId_gpu());
			ps.setString(2, u.getMarqueGpu());
			ps.setString(3, u.getCapaciteGpu());
			ps.setString(4, u.getVitesse());
			ps.setInt(5, u.getId_gpu());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteGpu(int id) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from gpu  where id_gpu=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
