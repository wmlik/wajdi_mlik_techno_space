package modele.metier;

import java.util.ArrayList;
import java.util.List;

import modele.domaine.NouveauxPcInfo;
import modele.domaine.PcComplet;

import modele.domaine.Cpu;
import modele.domaine.Fournisseur;
import modele.domaine.User;
import modele.domaine.Gpu;
import modele.domaine.Hdd;
import modele.domaine.Ram;
import modele.domaine.Statistique;

public class TestMetier {

	public static void main(String[] args) {
		
		
		
		
		//Test d'ajout
		/*metier.addUser(new User ("Ben Saleh", "Mohamed","11","22"));
		System.out.println("------------------------------\n");
		//Test d'affichage de la liste totale des objets "User"
		List<User> users = metier.listUsers();
		for (User u: users)
		{
			System.out.println(u);
		}
		System.out.println("------------------------------\n");
		//Test d'affichage d'un objet "User" en donnant le login et le password
		User u = metier.getUserByLoginAndPassword("11", "22");
		System.out.println(u);
		System.out.println("------------------------------\n");
		//Tester la mise à jour
		u.setNom("Sallemi");
		metier.updateUser(u);
		
		List<User> users2 = metier.listUsers();
		for (User u2: users2)
		{
			System.out.println(u2);
		}
		System.out.println("------------------------------\n");*/
		
		/*List<Cpu> cpus1 = metier.listeCpu();
		for (Cpu u2: cpus1 )
		{
			System.out.println(u2);
		}
		System.out.println("------------------------------\n");*/
		/*List<Object> cpus1 = metier.listeNPc();
		for (Object u2: cpus1 )
		{
			System.out.println(u2);
		}*/
		
		/*List<Cpu> cpus1 = metier.listCpuByprocessor_number("11");
		for (Object u2: cpus1 )
		{
			System.out.println(u2);
		}*/
		
		//*****************************************************************************************************
		
		StatistiqueMetierImpl metier= new StatistiqueMetierImpl();
		
		List<Statistique> l = new ArrayList<Statistique>();
		
		//List
		l =  metier.list_vente_par_gamme();
		for (Statistique u2: l )
		{
			 
			 System.out.println(u2.list_vente_par_gamme());
			
		}
		 System.out.println("done");
		
		
		
		//byid
		//o = metier.getPcCompletById(1);
	//	System.out.println(o);
		
		
		//by info
	//	l = metier.listPcCompletByinfo("pro");
	//	for (Object u2: l )
	//		{
		//		System.out.println(u2);
		//	}
	
		//add
		//metier.addPcComplet(o);
		//metier2.addCpu(o2);
	//	System.out.println("done");
		
		//update
		//metier.updatePcComplet(o);
		//System.out.println("done");
		
		//delete
	//metier.deleteNouveauxPcInfo(101);
		
		
		
		
	}
}
