<%@page language="java" import="modele.domaine.User"%>
<%
User us= (User)session.getAttribute("user");
if (us==null)
{
   request.getRequestDispatcher("UserConnexion.jsp").forward(request, response);
}
else
{
%>



<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title></title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/cssold/style.css" />
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/cssold/style-4.css" />
</head>
<body >

	<nav class="style-4">
		<ul class="menu-4">
		  <li class="user">BienVenue   : <%=us.getNom()%>    <%=us.getPrenom()%></li>
		  <li ><a href="StatistiqueController" data-hover="Bienvenue">  A.c.c.u.e.i.l</a></li>
		  <li><a href="UserListController" data-hover="utilisateur">utilisateur</a></li>
		  <li><a href="PcCompletListController" data-hover="List Pc">List Pc</a></li>
		  <li><a href="CpuListController" data-hover="Cpu">Cpu</a></li>
		  
		  <li><a href="UserDeconnexionController" onclick="return confirm('Voulez vous vraiment quitter ?')" data-hover="Au revoir">Déconnexion</a></li>
		</ul>
	</nav>	
</body>
</html>
<%
}
%>