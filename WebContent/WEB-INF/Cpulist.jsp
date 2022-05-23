<%@ page language="java" import="java.util.ArrayList,modele.domaine.Cpu" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<table border ="1">
			<tr>
				<th>Code:</th>
				<th>Désignation:</th>
				<th>Prix:</th>
				<th>Catéegorie:</th>
				
				
			</tr>
		<%

			ArrayList lp = (ArrayList) request.getAttribute("Cpu");
			if (lp != null) {
				
				for (int i = 0; i < lp.size(); i++) 
				{
					out.println("<tr>");
					out.println("<td> " + ((Cpu) lp.get(i)).getId_cpu() + "</td>");
					out.println("<td> " + ((Cpu) lp.get(i)).getProcessor_number() + "</td>");
					out.println("<td> " + ((Cpu) lp.get(i)).getSpeed() + "</td>");
					out.println("<td> " + ((Cpu) lp.get(i)).getNombre_de_coeur() + "</td>");
					out.println("</tr>");
				}
				
			}
		%>
		
			
		</table>
</body>
</html>