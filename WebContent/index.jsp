<%@ page language="java"
	import="java.util.ArrayList, java.util.Iterator"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%
	String login = (String) request.getAttribute("login");
	String password = (String) request.getAttribute("password");
	if (login == null)
		login = "";
	if (password == null)
		password = "";
	ArrayList<String> err = (ArrayList<String>) request.getAttribute("tab_err");
%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Connexion</title>

<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet"
	type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">
	

</head>

<body class="bg-gradient-primary">



	<%
		if (err != null && !err.isEmpty()) {
	%>
	<div class="erreur">
		<ul>

			<%
				for (Iterator<String> it = err.iterator(); it.hasNext();) {
			%>
			<li><%=it.next()%></li>
			<%
				}
			%>
		</ul>
	</div>
	<%
		}
	%>

	
	 <div class="container">

        <!-- Outer Row -->
        <div class="row justify-content-center">

            <div class="col-xl-10 col-lg-12 col-md-9">

                <div class="card o-hidden border-0 shadow-lg my-5">
                    <div class="card-body p-0">
                        <!-- Nested Row within Card Body -->
                        <div class="row">
                            <div><img src="img/login.jpg" alt="" width=430 height=570></div>
                            <div class="col-lg-6">
                                <div class="p-5">
                                    <div class="text-center" action="logincode.php" method="POST">
                                        <h1 class="h4 text-gray-900 mb-4">Bienvenue</h1>
                                    </div>
                                    <form class="user" action="UserController" method="POST">
                                        <div class="form-group">
                                            <input type="text" name="login" class="form-control form-control-user" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Login" value="<%=login%>" >
                                        </div>
                                        <div class="form-group">
                                            <input type="password" name="password" class="form-control form-control-user" id="exampleInputPassword" placeholder="Mot de passe" value="<%=password%>">
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox small">
                                                <input type="checkbox" class="custom-control-input" id="customCheck">
                                            </div>
                                        </div>
                                        <button type="submit" name="login_btn" class="btn btn-primary btn-user btn-block" >Se connecter</button>
                                    	<button type="reset" name="reset_btn" class="btn btn-primary btn-user btn-block" >Annuler</button>
                                    </form>
                                    

                                   
                                </div>
                            </div>
                        </div>
                    </div>
                </div>

            </div>

        </div>

    </div>
	
</body>
</html>