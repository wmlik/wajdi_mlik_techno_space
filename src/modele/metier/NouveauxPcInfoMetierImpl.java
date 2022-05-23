package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.NouveauxPcInfo;


public class NouveauxPcInfoMetierImpl implements NouveauxPcInfoMetierInterface {

	private DaoInterface dao = null;	
	
	public NouveauxPcInfoMetierImpl() {
		 dao = new DaoImpl();
	}
	
	@Override
	public List<NouveauxPcInfo> listeNouveauxPcInfo() {
		// TODO Auto-generated method stub
		List<NouveauxPcInfo> cs= new ArrayList<NouveauxPcInfo>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from NouveauxPcInfo ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "NouveauxPcInfo" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					NouveauxPcInfo c = new NouveauxPcInfo();
					c.setId_pc(rs.getInt("id_pc"));
					c.setMarquePc(rs.getString("marquePc"));
					c.setGamme(rs.getString("gamme"));
					c.setCouleur(rs.getString("couleur"));
					c.setDate_entree(rs.getString("date_entree"));
					c.setDate_sortie(rs.getString("date_sortie"));
					c.setPrix_achat(rs.getDouble("prix_achat"));
					c.setPrix_vente(rs.getDouble("prix_vente"));
					c.setQte_stock(rs.getInt("qte_stock"));
					c.setQte_vendu(rs.getInt("qte_vendu"));
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setId_ram(rs.getInt("id_ram"));
				
					 //ajouter l'objet "NouveauxPcInfo" dans la liste
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
	public NouveauxPcInfo getNouveauxPcInfoById(int id) {
		NouveauxPcInfo c = new NouveauxPcInfo();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from NouveauxPcInfo where id_pc = ?");
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
					c.setQte_stock(rs.getInt("qte_stock"));
					c.setQte_vendu(rs.getInt("qte_vendu"));
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setId_ram(rs.getInt("id_ram"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}

	@Override
	public List<NouveauxPcInfo> listNouveauxPcInfoByinfo(String motDeRecherche) {
		List<NouveauxPcInfo> users= new ArrayList<NouveauxPcInfo>();

		try {
			// préparer la requête SQL
			String sql= "select * from NouveauxPcInfo where marquePc like ? or gamme like ?";
			System.out.println(sql);
			System.out.println("mr:"+motDeRecherche);
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			//Affecter la valeur du paramètre
			ps.setString(1,"%"+motDeRecherche+"%");
			ps.setString(2,"%"+motDeRecherche+"%");
			
			//ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					//Construire un objet "NouveauxPcInfo" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					NouveauxPcInfo c = new NouveauxPcInfo();
					c.setId_pc(rs.getInt("id_pc"));
					c.setMarquePc(rs.getString("marquePc"));
					c.setGamme(rs.getString("gamme"));
					c.setCouleur(rs.getString("couleur"));
					c.setDate_entree(rs.getString("date_entree"));
					c.setDate_sortie(rs.getString("date_sortie"));
					c.setPrix_achat(rs.getDouble("prix_achat"));
					c.setPrix_vente(rs.getDouble("prix_vente"));
					c.setQte_stock(rs.getInt("qte_stock"));
					c.setQte_vendu(rs.getInt("qte_vendu"));
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setId_ram(rs.getInt("id_ram"));
					// ajouter l'objet "NouveauxPcInfo" dans la liste
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
	public void addNouveauxPcInfo(NouveauxPcInfo p) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" insert into nouveauxpcinfo values (0,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			// passer les paramètres
			ps.setString(1, p.getMarquePc());
			ps.setString(2, p.getGamme());
			ps.setString(3, p.getCouleur());
			ps.setString(4, p.getDate_entree());
			ps.setString(5, p.getDate_sortie());
			ps.setDouble(6, p.getPrix_achat());
			ps.setDouble(7, p.getPrix_vente());
			ps.setInt(8, p.getQte_stock());
			ps.setInt(9, p.getQte_vendu());
			ps.setInt(10, p.getId_fournisseur());
			ps.setInt(11, p.getId_cpu());
			ps.setInt(12, p.getId_gpu());
			ps.setInt(13, p.getId_hdd());
			ps.setInt(14, p.getId_ram());
			
		
			// executer la requête
			dao.ecrire(ps);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void updateNouveauxPcInfo(NouveauxPcInfo p) {
		try {
			// préparer la requête SQL
			String sql = " update nouveauxpcinfo set Id_pc = ?, MarquePc=?, Gamme=?, Couleur =?, "
					+ "Date_entree =?, Date_sortie =?, Prix_achat =?, Prix_vente =?, Qte_stock =?, Qte_vendu =?, "
					+ "Id_fournisseur =?, Id_cpu =?, Id_gpu =?, Id_ram =? where Id_pc=? ";
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			ps.setInt(1, p.getId_pc());
			ps.setString(2, p.getMarquePc());
			ps.setString(3, p.getGamme());
			ps.setString(4, p.getCouleur());
			ps.setString(5, p.getDate_entree());
			ps.setString(6, p.getDate_sortie());
			ps.setDouble(7, p.getPrix_achat());
			ps.setDouble(8, p.getPrix_vente());
			ps.setInt(9, p.getQte_stock());
			ps.setInt(10, p.getQte_vendu());
			ps.setInt(11, p.getId_fournisseur());
			ps.setInt(12, p.getId_cpu());
			ps.setInt(13, p.getId_gpu());
			ps.setInt(14, p.getId_ram());
			ps.setInt(15, p.getId_pc());
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteNouveauxPcInfo(int id) {
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" delete from nouveauxpcinfo  where id_pc=? ");
			ps.setInt(1, id);
			dao.ecrire(ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
