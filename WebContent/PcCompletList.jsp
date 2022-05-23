<%@ page language="java" import="java.util.ArrayList,modele.domaine.PcComplet" contentType="text/html; charset=ISO-8859-1"
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
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>List Pc</title>
</head>
<body>
Sélectionner un critère de recherche (par Marque ou Gamme) :
	<div>
		<form action=PcCompletListController method="GET">

			<table>
				<tr>
					<td class="label">Critère de recherche:</td>
					<td><input type="text" name="motDeRecherche" value="<%=motDeRecherche%>" /></td>
				<td align="center" ><input type="submit" value="Rechercher " />
				</tr>
				
			</table>
		</form>
	</div>

<a href ="FormNouveauxPcInfoAction">Ajouter</a>

	<p>	Liste des Pc </p>
		<hr>
			<table border ="1">
			<tr>
				<th>N°</th>
				<th>Gamme</th>
				<th>Marque</th>
				<th>Couleur</th>
				<th>Nom du Processor</th>
				
				<th>Generation Cpu</th>
				<th>Speed</th>
				<th>Nombre de coeur</th>
				
				<th>Capacite Ram</th>
				<th>Marque Ram</th>				
				<th>Generation Ramr</th>				
				<th>Capacite Hdd</th>				
				<th>Marque Hdd</th>
				
				<th>Bande passante Hdd</th>
				<th>Type</th>
				<th>Marque Gpu</th>
				<th>Capacite Gpu</th>
				<th>Vitesse Gpu</th>				
				<th>date entree</th>
				<th>date sortie</th>
				<th>qte stock</th>
				<th>qte vendu</th>
				<th>prix achat</th>
				<th>prix vendu</th>				
				<th>fournisseur</th>
				
				<th colspan="2">Actions:</th>
				
			</tr>
		<%

			ArrayList lp = (ArrayList) request.getAttribute("pcComplet");
			if (lp != null) {
				double sv = 0;
				double sa = 0;
				double b = 0;
				for (int i = 0; i < lp.size(); i++) 
				{    int c = i+1;
					out.println("<tr>");
					out.println("<td> " + c + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getGamme() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getMarquePc() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getCouleur() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getProcessor_number() + "</td>");					
					out.println("<td> " + ((PcComplet) lp.get(i)).getGenerationCpu() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getSpeed() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getNombre_de_coeur() + "</td>");					
					out.println("<td> " + ((PcComplet) lp.get(i)).getCapaciteRam() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getMarqueRam() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getGenerationRam()+ "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getCapaciteHdd() + " Gb</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getMarqueHdd() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getBande_passante() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getType()+ "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getMarqueGpu() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getCapaciteGpu() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getVitesse()+ "</td>");				
					out.println("<td> " + ((PcComplet) lp.get(i)).getDate_entree() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getDate_sortie() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getQte_stock() + "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getQte_vendu()+ "</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getPrix_achat() + " DT</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getPrix_vente() + " DT</td>");
					out.println("<td> " + ((PcComplet) lp.get(i)).getNom_fournisseur() + "</td>");
					
					out.print("<td>  <a href ='FormNouveauxPcInfoAction?id="+((PcComplet) lp.get(i)).getId_pc()+"&mode=Edition"+"'>Modifier</a> </td>");
					out.println("<td>  <a href ='FormNouveauxPcInfoAction?id="+((PcComplet) lp.get(i)).getId_pc()+"&mode=Suppression"+"'  onclick='return confirm(\"Voulez vous vraiment supprimer cet utilisateur ?\")'      >Supprimer</a> </td>");
					out.println("</tr>");
				}
				
				
			}
		%>
		
			
		</table>

<hr>

</div>
</body>
</html>