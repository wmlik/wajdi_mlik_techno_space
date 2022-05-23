package modele.metier;

import java.util.List;

import modele.domaine.User;

//liste des traitements m�tier sur un "User"
public interface UserMetierInterface 
{
	//Ajouter un objet "User"
	public void addUser(User u);
	//Retourner la liste de tous les objets "User"
	public List<User> listUsers();
	//Retourner la liste de tous les objets "User" par "nom" ou "prenom"
	public List<User> listUsersByNomOrPrenom(String motDeRecherche);
	//Retourner l'objet "User" ayant le login et le password pass�s en param�tres
	public User getUserByLoginAndPassword(String l, String p);
	//Mettre � jour un objet "User" d�j� existant
	public void updateUser(User u);
	//Supprimer un objet "User" identifi� par son "id"
	public void deleteUser(int id);
	//Retourner un objet "User" par id
	public User getUserById (int id);
	
}
