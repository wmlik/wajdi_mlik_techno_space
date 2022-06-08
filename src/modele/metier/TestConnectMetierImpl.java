package modele.metier;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modele.dao.DaoImpl;
import modele.dao.DaoInterface;
import modele.domaine.Cpu;

public class TestConnectMetierImpl implements TestConnectMetierInterface{

	private DaoInterface dao = null;
	private static int i = 0;

	public TestConnectMetierImpl() {
		dao = new DaoImpl();	
	}

	@Override
	public void test() {
		
		try {
			i++;
			PreparedStatement ps = dao.connection.prepareStatement(" select * from cpu ");
			ResultSet rs = dao.lire(ps);		
			System.out.println("test connection "+i+" created");
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
		

}
