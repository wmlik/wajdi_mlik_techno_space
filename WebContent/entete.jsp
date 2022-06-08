<%@page language="java" import="modele.domaine.User"%>
<%
User us= (User)session.getAttribute("user");
if (us==null)
{
   request.getRequestDispatcher("index.jsp").forward(request, response);
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
	
	
	
	
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">	
</head>
<body >
 
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<ul class="menu-4">
		  <li class="user">BienVenue   : <%=us.getNom()%>    <%=us.getPrenom()%></li>
		  <li ><a href="StatistiqueController" data-hover="Bienvenue">  A.c.c.u.e.i.l</a></li>
		  <li><a href="UserListController" data-hover="utilisateur">utilisateur</a></li>
		  <li><a href="PcCompletListController" data-hover="List Pc">List Pc</a></li>
		  <li><a href="CpuListController" data-hover="List Cpu">List Cpu</a></li>		  
		  <li><a href="About.jsp" data-hover="A propos">A propos</a></li>		  
		  <li><a href="UserDeconnexionController" onclick="return confirm('Voulez vous vraiment quitter ?')" data-hover="Au revoir">Déconnexion</a></li>
		</ul>
	</nav>	
	
	
	<!-- Bootstrap core JavaScript-->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Core plugin JavaScript-->
	<script src="vendor/jquery-easing/jquery.easing.min.js"></script>

	<!-- Custom scripts for all pages-->
	<script src="js/sb-admin-2.min.js"></script>

	<!-- Page level plugins -->
	<script src="vendor/chart.js/Chart.min.js"></script>

	<!-- Page level custom scripts -->
	<script src="js/demo/chart-area-demo.js"></script>
	<script src="js/demo/chart-pie-demo.js"></script>
</body>
</html>
<%
}
%>