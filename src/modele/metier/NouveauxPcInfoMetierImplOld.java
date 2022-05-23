package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Cpu;
import modele.domaine.NouveauxPcInfo;
import modele.domaine.User;
import modele.domaine.NouveauxPcInfo;

/*public class NouveauxPcInfoMetierImplOld implements NouveauxPcInfoMetierInterface {

	private DaoInterface dao = null;	
	
	public NouveauxPcInfoMetierImplOld() {
		 dao = new DaoImpl();
	}
	
	@Override
	public List<Object> listeNPc() {
		// TODO Auto-generated method stub
		List<Object> tousLesPc= new ArrayList<Object>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from nouveaux_pc_info ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
					
				{    
					PreparedStatement cpuc = dao.connection.prepareStatement(" select * from cpu where id_cpu = ? ");
					cpuc.setInt(1,rs.getInt("id_cpu"));
					ResultSet cpurs= dao.lire(cpuc);
					cpurs.next();
					//Construire un objet "NouveauxPcInfo" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					NouveauxPcInfo c = new NouveauxPcInfo();
					Cpu cpu = new Cpu();
					c.setId_pc(rs.getInt("id_pc"));
					c.setMarquePc(rs.getString("marquePc"));
					c.setGamme(rs.getString("gamme"));
					c.setCouleur(rs.getString("couleur"));
					c.setDate_entree(rs.getString("date_entree"));
					c.setDate_sortie(rs.getString("date_sortie"));
					c.setPrix_achat(rs.getDouble("prix_achat"));
					c.setPrix_vente(rs.getDouble("prix_vente"));
					c.setId_cpu(rs.getInt("id_cpu"));
					cpu.setSpeed(cpurs.getString("speed"));
					cpu.setId_cpu(cpurs.getInt("id_cpu"));
					List<Object> unPcComplet= new ArrayList<Object>();
					unPcComplet.add(c);
					unPcComplet.add(cpu);
					 //ajouter l'objet "NouveauxPcInfo" dans la liste
					tousLesPc.add(unPcComplet);
					cpuc.close();	
				}
			}
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//retoturner la liste
		return tousLesPc;
	}
	
	@Override
	public NouveauxPcInfo getPcById(int id) {
		NouveauxPcInfo c= null;
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from NouveauxPcInfo where id = ?");
			ps.setInt(1,id);
			
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				while(rs.next())
				{
					c.setId_pc(rs.getInt("id_pc"));
					c.setMarquePc(rs.getString("marquePc"));
					c.setGamme(rs.getString("gamme"));
					c.setCouleur(rs.getString("couleur"));
					c.setDate_entree(rs.getString("date_entree"));
					c.setDate_sortie(rs.getString("date_sortie"));
					c.setPrix_achat(rs.getDouble("prix_achat"));
					c.setPrix_vente(rs.getDouble("prix_vente"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<NouveauxPcInfo> listPcByMarque(String motDeRecherche) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public void addNPc(NouveauxPcInfo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateNPc(NouveauxPcInfo p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteNNp(int id) {
		// TODO Auto-generated method stub
		
	}

}*/
