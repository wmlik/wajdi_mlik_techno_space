<%@ page language="java" import="java.util.ArrayList,modele.domaine.Cpu" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@include file="entete.jsp" %>
<%
String motDeRecherche =(String) request.getParameter("motDeRecherche");
if (motDeRecherche==null || motDeRecherche.equals(""))
{
	motDeRecherche="";
}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Sélectionner un critère de recherche (par Nom du processor ou generation Cpu ou vitesse) :
	<div>
		<form action=CpuListController method="GET">

			<table>
				<tr>
					<td class="label">Critère de recherche:</td>
					<td><input type="text" name="motDeRecherche" value="<%=motDeRecherche%>" /></td>
				<td align="center" ><input type="submit" value="Rechercher " />
				</tr>
				
			</table>
		</form>
	</div>
	
	<p><a href ="CpuForm.jsp">Ajouter</a></p>

		<table border ="1">
			<tr>
				<th>ID</th>
				<th>Processor</th>
				<th>Generation</th>
				<th>Speed</th>
				<th>Nombre De Coeur</th>
				<th colspan="2">Actions:</th>
				
				
			</tr>
		<%

			ArrayList cpus = (ArrayList) request.getAttribute("ListCpu");
			
				
			
			if (cpus != null) {
				
				for (int i = 0; i < cpus.size(); i++) 
				{	int c = i +1;
					out.println("<tr>");
					out.println("<td> " + c + "</td>");
					out.println("<td> " + ((Cpu) cpus.get(i)).getProcessor_number() + "</td>");
					out.println("<td> " + ((Cpu) cpus.get(i)).getGenerationCpu() + "</td>");
					out.println("<td> " + ((Cpu) cpus.get(i)).getSpeed() + "</td>");
					out.println("<td> " + ((Cpu) cpus.get(i)).getNombre_de_coeur() + "</td>");
					out.print("<td>  <a href ='FormCpuAction?id="+((Cpu) cpus.get(i)).getId_cpu()+"&mode=Edition"+"'>Modifier</a> </td>");
					out.println("<td>  <a href ='FormCpuAction?id="+((Cpu) cpus.get(i)).getId_cpu()+"&mode=Suppression"+"'  onclick='return confirm(\"Voulez vous vraiment supprimer ce produit ?\")'      >Supprimer</a> </td>");
					out.println("</tr>");
				}
				
			}
		%>
		
			
		</table>
</body>
</html>