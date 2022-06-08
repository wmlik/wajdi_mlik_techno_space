package modele.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnexion 
{
	private static Connection connection =null;
	static 
	//useSSL=false&
	{String unicode="autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";
		try {
			//Charger le pilote d'accès à la BD
			Class.forName("com.mysql.jdbc.Driver");
			//Etablir la connection à la BD "MAGASIN"
			connection=DriverManager.getConnection("jdbc:mysql://sql506.main-hosting.eu/u503324270_space?"+unicode,"u503324270_wmlik","442/C8B+Bb");
			
			
		} catch (Exception e) {
			// Message d'erreur en cas de problème de connexion
			System.out.println("Problème de connexion à la BD..");
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		//return l'objet de connexion
		return connection;
	}
}
