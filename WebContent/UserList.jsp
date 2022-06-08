<%@page language="java" import="java.util.ArrayList,modele.domaine.User"%>
<%@include file="entete.jsp" %>
<%
String motDeRecherche =(String) request.getParameter("motDeRecherche");
if (motDeRecherche==null || motDeRecherche.equals(""))
{
	motDeRecherche="";
}
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Consultation</title>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">

</head>
<body id="page-top">
<div  >
S�lectionner un crit�re de recherche (par nom ou prenom) :
	<div>
		<form action=UserListController method="GET">

			<table>
				<tr>
					<td class="label">Crit�re de recherche:</td>
					<td><input type="text" name="motDeRecherche" value="<%=motDeRecherche%>" /></td>
				<td align="center" ><input type="submit" value="Rechercher " />
				</tr>
				
			</table>
		</form>
	</div>


		Liste des utilisateurs
		<hr>
			<table border ="1" class="table table-hover">
			<tr class="table-secondary">
				<th>Nom:</th>
				<th>Prenom:</th>
				<th>Login:</th>
				<th>Mot de passe:</th>
				<th colspan="2">Actions:</th>
				
			</tr>
		<%

			ArrayList users = (ArrayList) session.getAttribute("listOfUsers");
		
			
		
			if (users != null) {
				
				for (int i = 0; i < users.size(); i++) 
				{
					out.println("<tr>");
					out.println("<td> " + ((User) users.get(i)).getNom() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getPrenom() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getLogin() + "</td>");
					out.println("<td> " + ((User) users.get(i)).getPassword() + "</td>");
					out.print("<td  >  <a class='btn btn-info' href ='UserEditionController?id="+((User) users.get(i)).getId()+"&mode=Edition"+"'>Modifier</a> </td>");
					out.println("<td  >  <a class='btn btn-danger' href ='UserEditionController?id="+((User) users.get(i)).getId()+"&mode=Suppression"+"'  onclick='return confirm(\"Voulez vous vraiment supprimer cet utilisateur ?\")'      >Supprimer</a> </td>");

					
					out.println("</tr>");
				}
				
			}
		%>
		
			
		</table>

<hr>
<a href ="UserForm.jsp" class="btn btn-lg btn-primary">Ajouter</a>
</div>

</body>
</html>