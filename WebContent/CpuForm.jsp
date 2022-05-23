<%@page language="java" import="java.util.ArrayList,modele.domaine.Cpu"%>
<%@include file="entete.jsp" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Fiche Cpu</title>
</head>
<body >


		Veuillez saisir les propriétés de Cpu...
		<hr>
		
		<%
		
	      //gestion des erreurs
			ArrayList erreurs = (ArrayList) request.getAttribute("err");
			if (erreurs != null) 
			{
				%>
				<div class="erreur">
				<%
				out.println("<ul>");
				for (int i = 0; i < erreurs.size(); i++) {
					out.println("<li> " + (String) erreurs.get(i) + "</li>");
				}
				out.println("</ul>");
				%>
				</div>
			<%
			}
			
			
			// gestion de la saisie de  Cpu en cours
			int id_cpu=0;
			String processor_number=null;
			String generationCpu=null;
			String speed=null;
			int nombre_de_coeur=0;
	 
			Cpu u = (Cpu)request.getAttribute("cpu");
			if (u!=null)
			{
				id_cpu=u.getId_cpu();
				processor_number = u.getProcessor_number();
			 generationCpu = u.getGenerationCpu();
			 speed = u.getSpeed();
			 nombre_de_coeur = u.getNombre_de_coeur();
			}
			
			// Correction des  valleurs nulles
			if (processor_number==null)processor_number="";
			if (generationCpu==null)generationCpu="";
			if (speed==null)speed="";
			
		%>
		
		<form action="FormCpuAction" method="POST">
			<table>
			<tr>
				<td><input type="hidden" name="id_cpu" value ="<%=id_cpu%>"/></td>
			</tr>
			<tr>
				<td>Nom de processeur:</td>
				<td><input type="text" name="processor_number" value ="<%=processor_number%>"/></td>
			</tr>
			<tr>
				<td>génération du Cpu</td>
				<td><input type="password" name="generationCpu" value ="<%=generationCpu%>"/></td>
			</tr>
			<tr>
				<td>vitesse</td>
				<td><input type="text" name="speed" value ="<%=speed%>"/></td>
			</tr>
			<tr>
				<td>nombre de coeur</td>
				<td><input type="number" name="nombre_de_coeur" value ="<%=nombre_de_coeur%>"/></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><input type="submit" value="ok" />
					<input type="reset" value="Annuler" /></td>
			</tr>

		</table>
	</form>

</body>
</html>