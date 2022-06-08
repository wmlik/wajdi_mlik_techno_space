package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.PcComplet;


public class PcCompletMetierImpl implements PcCompletMetierInterface {

	private DaoInterface dao = null;	
	
	public PcCompletMetierImpl() {
		 dao = new DaoImpl();
		 TestConnectMetierInterface test = new TestConnectMetierImpl();
			test.test();
			
	}
	
	@Override
	public List<PcComplet> listePcComplet() {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		// TODO Auto-generated method stub
		List<PcComplet> cs= new ArrayList<PcComplet>();
		
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from nouveauxpcinfo ");
			
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{	
					// préparer la requête SQL Cpu
					PreparedStatement cpuc = dao.connection.prepareStatement(" select * from cpu where id_cpu = ? ");
					cpuc.setInt(1,rs.getInt("id_cpu"));
					ResultSet cpurs= dao.lire(cpuc);
					cpurs.next();
					
					// préparer la requête SQL RAm
					PreparedStatement ramc = dao.connection.prepareStatement(" select * from ram where id_ram = ? ");
					ramc.setInt(1,rs.getInt("id_ram"));
					ResultSet ramrs= dao.lire(ramc);
					ramrs.next();
					
					// préparer la requête SQL Hdd
					PreparedStatement hddc = dao.connection.prepareStatement(" select * from hdd where id_hdd = ? ");
					hddc.setInt(1,rs.getInt("id_ram"));
					ResultSet hddrs= dao.lire(hddc);
					hddrs.next();
					
					// préparer la requête SQL gpu
					PreparedStatement gpuc = dao.connection.prepareStatement(" select * from gpu where id_gpu = ? ");
					gpuc.setInt(1,rs.getInt("id_gpu"));
					ResultSet gpurs= dao.lire(gpuc);
					gpurs.next();
					
				
					//Construire un objet "PcComplet" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					PcComplet c = new PcComplet();
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
					c.setId_cpuPc(rs.getInt("id_cpu"));
					c.setId_gpuPc(rs.getInt("id_gpu"));
					c.setId_hddPc(rs.getInt("id_hdd"));
					c.setId_ramPc(rs.getInt("id_ram"));
					//partie cpu
					c.setId_cpu(cpurs.getInt("id_cpu"));
					c.setProcessor_number(cpurs.getString("processor_number"));
					c.setSpeed(cpurs.getString("speed"));
					c.setNombre_de_coeur(cpurs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(cpurs.getString("generationCpu"));
					//parite ram
					c.setId_ram(ramrs.getInt("id_ram"));
					c.setCapaciteRam(ramrs.getString("capaciteRam"));
					c.setMarqueRam(ramrs.getString("marqueRam"));
					c.setGenerationRam(ramrs.getString("generationRam"));
					//parite hdd
					c.setId_hdd(hddrs.getInt("id_hdd"));
					c.setMarqueHdd(hddrs.getString("marqueHdd"));
					c.setCapaciteHdd(hddrs.getInt("capaciteHdd"));
					c.setBande_passante(hddrs.getString("bande_passante"));
					c.setType(hddrs.getString("type"));
					//parite gpu
					c.setId_gpu(gpurs.getInt("id_gpu"));
					c.setMarqueGpu(gpurs.getString("marqueGpu"));
					c.setCapaciteGpu(gpurs.getString("capaciteGpu"));
					c.setVitesse(gpurs.getString("vitesse"));
					 //ajouter l'objet "PcComplet" dans la liste
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
	public PcComplet getPcCompletById(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		PcComplet c = new PcComplet();
		try {
			// préparer la requête SQL
			PreparedStatement ps = dao.connection.prepareStatement(" select * from nouveauxpcinfo where id_pc = ?");
			ps.setInt(1,id);
			
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				while(rs.next())
				{
					// préparer la requête SQL Cpu
					PreparedStatement cpuc = dao.connection.prepareStatement(" select * from cpu where id_cpu = ? ");
					cpuc.setInt(1,rs.getInt("id_cpu"));
					ResultSet cpurs= dao.lire(cpuc);
					cpurs.next();
					
					// préparer la requête SQL RAm
					PreparedStatement ramc = dao.connection.prepareStatement(" select * from ram where id_ram = ? ");
					ramc.setInt(1,rs.getInt("id_ram"));
					ResultSet ramrs= dao.lire(ramc);
					ramrs.next();
					
					// préparer la requête SQL Hdd
					PreparedStatement hddc = dao.connection.prepareStatement(" select * from hdd where id_hdd = ? ");
					hddc.setInt(1,rs.getInt("id_hdd"));
					ResultSet hddrs= dao.lire(hddc);
					hddrs.next();
					
					// préparer la requête SQL gpu
					PreparedStatement gpuc = dao.connection.prepareStatement(" select * from gpu where id_gpu = ? ");
					gpuc.setInt(1,rs.getInt("id_gpu"));
					ResultSet gpurs= dao.lire(gpuc);
					gpurs.next();
					
				
					//Construire un objet "PcComplet" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					
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
					c.setId_cpuPc(rs.getInt("id_cpu"));
					c.setId_gpuPc(rs.getInt("id_gpu"));
					c.setId_hddPc(rs.getInt("id_hdd"));
					c.setId_ramPc(rs.getInt("id_ram"));
					//partie cpu
					c.setId_cpu(cpurs.getInt("id_cpu"));
					c.setProcessor_number(cpurs.getString("processor_number"));
					c.setSpeed(cpurs.getString("speed"));
					c.setNombre_de_coeur(cpurs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(cpurs.getString("generationCpu"));
					//parite ram
					c.setId_ram(ramrs.getInt("id_ram"));
					c.setCapaciteRam(ramrs.getString("capaciteRam"));
					c.setMarqueRam(ramrs.getString("marqueRam"));
					c.setGenerationRam(ramrs.getString("generationRam"));
					//parite hdd
					c.setId_hdd(hddrs.getInt("id_hdd"));
					c.setMarqueHdd(hddrs.getString("marqueHdd"));
					c.setCapaciteHdd(hddrs.getInt("capaciteHdd"));
					c.setBande_passante(hddrs.getString("bande_passante"));
					c.setType(hddrs.getString("type"));
					//parite gpu
					c.setId_gpu(gpurs.getInt("id_gpu"));
					c.setMarqueGpu(gpurs.getString("marqueGpu"));
					c.setCapaciteGpu(gpurs.getString("capaciteGpu"));
					c.setVitesse(gpurs.getString("vitesse"));
					
				}
			}
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	@Override
	public List<PcComplet> listPcCompletByinfo(String motDeRecherche) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		List<PcComplet> users= new ArrayList<PcComplet>();

		try {
			// préparer la requête SQL
			String sql= "select * from nouveauxpcinfo nv,cpu c, ram r, gpu g, hdd h,fournisseur f where nv.id_cpu = c.id_cpu and"
					+ " nv.id_gpu = g.id_gpu and nv.id_ram = r.id_ram and nv.id_hdd = h.id_hdd and nv.id_fournisseur = f.id_fournisseur and "
					+ "(marquePc like ? or gamme like ? or couleur like ? or processor_number like ? or GenerationCpu like ? "
					+ "or Speed like ? or Nombre_de_coeur like ? or capaciteRam like ? or marqueRam like ? or  generationRam like ? "
					+ "or marqueGpu like ? or capaciteGpu like ? or vitesse like ? "
					+ "or marqueHdd like ? or capaciteHdd like ? or bande_passante like ? or type like ? "
					+ "or nom_fournisseur like ? ) ORDER BY marquePc";
			
			PreparedStatement ps = dao.connection.prepareStatement(sql);
			//Affecter la valeur du paramètre
			ps.setString(1,"%"+motDeRecherche+"%");
			ps.setString(2,"%"+motDeRecherche+"%");
			ps.setString(3,"%"+motDeRecherche+"%");
			ps.setString(4,"%"+motDeRecherche+"%");
			ps.setString(5,"%"+motDeRecherche+"%");
			ps.setString(6,"%"+motDeRecherche+"%");
			ps.setString(7,"%"+motDeRecherche+"%");
			ps.setString(8,"%"+motDeRecherche+"%");
			ps.setString(9,"%"+motDeRecherche+"%");
			ps.setString(10,"%"+motDeRecherche+"%");
			ps.setString(11,"%"+motDeRecherche+"%");
			ps.setString(12,"%"+motDeRecherche+"%");
			ps.setString(13,"%"+motDeRecherche+"%");
			ps.setString(14,"%"+motDeRecherche+"%");
			ps.setString(15,"%"+motDeRecherche+"%");
			ps.setString(16,"%"+motDeRecherche+"%");
			ps.setString(17,"%"+motDeRecherche+"%");
			ps.setString(17,"%"+motDeRecherche+"%");
			ps.setString(18,"%"+motDeRecherche+"%");
			
			//ps.setString(2,motDeRecherche);
			// Récupérer le résultat de la requête
			ResultSet rs= dao.lire(ps);
			if (rs!=null)
			{
				//parcourir le résultat 
				while(rs.next())
				{
					
					//Construire un objet "PcComplet" puis lui affecter les attributs
					// et enfin l'ajouter dans la liste
					PcComplet c = new PcComplet();
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
					c.setId_cpuPc(rs.getInt("id_cpu"));
					c.setId_gpuPc(rs.getInt("id_gpu"));
					c.setId_hddPc(rs.getInt("id_hdd"));
					c.setId_ramPc(rs.getInt("id_ram"));
					//partie cpu
					c.setId_cpu(rs.getInt("id_cpu"));
					c.setProcessor_number(rs.getString("processor_number"));
					c.setSpeed(rs.getString("speed"));
					c.setNombre_de_coeur(rs.getInt("nombre_de_coeur"));
					c.setGenerationCpu(rs.getString("generationCpu"));
					//parite ram
					c.setId_ram(rs.getInt("id_ram"));
					c.setCapaciteRam(rs.getString("capaciteRam"));
					c.setMarqueRam(rs.getString("marqueRam"));
					c.setGenerationRam(rs.getString("generationRam"));
					//parite hdd
					c.setId_hdd(rs.getInt("id_hdd"));
					c.setMarqueHdd(rs.getString("marqueHdd"));
					c.setCapaciteHdd(rs.getInt("capaciteHdd"));
					c.setBande_passante(rs.getString("bande_passante"));
					c.setType(rs.getString("type"));
					//parite gpu
					c.setId_gpu(rs.getInt("id_gpu"));
					c.setMarqueGpu(rs.getString("marqueGpu"));
					c.setCapaciteGpu(rs.getString("capaciteGpu"));
					c.setVitesse(rs.getString("vitesse"));
					//parite fournisseur
					c.setId_fournisseur(rs.getInt("id_fournisseur"));
					c.setNom_fournisseur(rs.getString("nom_fournisseur"));
					c.setAddresse(rs.getString("addresse"));
					c.setTlf(rs.getString("tlf"));
					c.setEmail(rs.getString("email"));
					
					// ajouter l'objet "PcComplet" dans la liste
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
	public void addPcComplet(PcComplet p) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL pc
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
			ps.setInt(11, p.getId_cpuPc());
			ps.setInt(12, p.getId_gpuPc());
			ps.setInt(13, p.getId_hddPc());
			ps.setInt(14, p.getId_ramPc());
			// executer la requête
			dao.ecrire(ps);
			
			// préparer la requête SQL cpu
			PreparedStatement pscpu = dao.connection.prepareStatement(" insert into cpu values (0,?,?,?,?)");
			// passer les paramètres
			pscpu.setString(1, p.getProcessor_number());
			pscpu.setString(2, p.getGenerationCpu());
			pscpu.setString(3, p.getSpeed());
			pscpu.setInt(4, p.getNombre_de_coeur());
			// executer la requête
			dao.ecrire(pscpu);
			
			// préparer la requête SQL ram
			PreparedStatement psram = dao.connection.prepareStatement(" insert into ram values (0,?,?,?)");
			// passer les paramètres
			psram.setString(1, p.getCapaciteRam());
			psram.setString(2, p.getMarqueRam());
			psram.setString(3, p.getGenerationRam());		
			// executer la requête
			dao.ecrire(psram);
			
			// préparer la requête SQL hdd
			PreparedStatement pshdd = dao.connection.prepareStatement(" insert into hdd values (0,?,?,?,?)");
			// passer les paramètres
			pshdd.setString(1, p.getMarqueHdd());
			pshdd.setInt(2, p.getCapaciteHdd());
			pshdd.setString(3, p.getBande_passante());
			pshdd.setString(4, p.getType());
			// executer la requête
			dao.ecrire(pshdd);
			
			// préparer la requête SQL gpu
			PreparedStatement psgpu = dao.connection.prepareStatement(" insert into gpu values (0,?,?,?)");
			// passer les paramètres
			psgpu.setString(1, p.getMarqueGpu());
			psgpu.setString(2, p.getCapaciteGpu());
			psgpu.setString(3, p.getVitesse());			
			// executer la requête
			dao.ecrire(psgpu);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

	@Override
	public void updatePcComplet(PcComplet p) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
		try {
			// préparer la requête SQL
			String sql = " update nouveauxpcinfo set id_pc = ?, marquePc=?, gamme=?, couleur =?, "
					+ "date_entree =?, date_sortie =?, prix_achat =?, prix_vente =?, qte_stock =?, qte_vendu =?, "
					+ "id_fournisseur =?, id_cpu =?, id_gpu =?, id_ram =? where id_pc=? ";
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
			ps.setInt(12, p.getId_cpuPc());
			ps.setInt(13, p.getId_gpuPc());
			ps.setInt(14, p.getId_ramPc());
			ps.setInt(15, p.getId_pc());
			dao.ecrire(ps);
			// préparer la requête SQL cpu
			String sqlcpu = " update cpu set id_cpu = ?, processor_number=?, generationCpu=?, speed =?, nombre_de_coeur =? where id_cpu=? ";
			PreparedStatement pscpu = dao.connection.prepareStatement(sqlcpu);
			pscpu.setInt(1, p.getId_cpu());
			pscpu.setString(2, p.getProcessor_number());
			pscpu.setString(3, p.getGenerationCpu());
			pscpu.setString(4, p.getSpeed());
			pscpu.setInt(5, p.getNombre_de_coeur());
			pscpu.setInt(6, p.getId_cpu());
			dao.ecrire(pscpu);	
			// préparer la requête SQL ram
			String sqlram = " update ram set id_ram = ?, capaciteRam=?, marqueRam=?, generationRam =? where id_ram=? ";
			PreparedStatement psram = dao.connection.prepareStatement(sqlram);
			psram.setInt(1, p.getId_ram());
			psram.setString(2, p.getCapaciteRam());
			psram.setString(3, p.getMarqueRam());
			psram.setString(4, p.getGenerationRam());
			psram.setInt(5, p.getId_ram());
			dao.ecrire(psram);
			// préparer la requête SQL hdd
			String sqlhdd = " update hdd set id_hdd = ?, marqueHdd=?, capaciteHdd=?, bande_passante =?, Type =? where id_hdd=? ";
			PreparedStatement pshdd = dao.connection.prepareStatement(sqlhdd);
			pshdd.setInt(1, p.getId_hdd());
			pshdd.setString(2, p.getMarqueHdd());
			pshdd.setInt(3, p.getCapaciteHdd());
			pshdd.setString(4, p.getBande_passante());
			pshdd.setString(5, p.getType());
			pshdd.setInt(6, p.getId_hdd());
			dao.ecrire(pshdd);
			// préparer la requête SQL hdd
			String sqlgpu = " update gpu set id_gpu=?, marqueGpu=?, capaciteGpu=?, vitesse =?  where id_gpu=?";
			PreparedStatement psgpu = dao.connection.prepareStatement(sqlgpu);
			psgpu.setInt(1, p.getId_gpu());
			psgpu.setString(2, p.getMarqueGpu());
			psgpu.setString(3, p.getCapaciteGpu());
			psgpu.setString(4, p.getVitesse());
			psgpu.setInt(5, p.getId_gpu());
			dao.ecrire(psgpu);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deletePcComplet(int id) {
		TestConnectMetierInterface test = new TestConnectMetierImpl();
		test.test();
		
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
