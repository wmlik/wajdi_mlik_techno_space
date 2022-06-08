<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="modele.domaine.User,java.util.ArrayList,modele.domaine.Statistique"%>

<%
	User us = (User) session.getAttribute("user");
	if (us == null) {
		request.getRequestDispatcher("UserConnexion.jsp").forward(request, response);
	} else {
%>


<html>
<head>

<title>Acceuil</title>
<!-- Custom fonts for this template-->

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/cssold/style-4.css" />
<link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
	rel="stylesheet">

<!-- Custom styles for this template-->
<link href="css/sb-admin-2.min.css" rel="stylesheet">




</head>
<body id="page-top">
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<ul class="menu-4">
			<li class="user">BienVenue : <%=us.getNom()%> <%=us.getPrenom()%></li>
			<li><a href="StatistiqueController" data-hover="Bienvenue">
					A.c.c.u.e.i.l</a></li>
			<li><a href="UserListController" data-hover="utilisateur">utilisateur</a></li>
			<li><a href="PcCompletListController" data-hover="List Pc">List
					Pc</a></li>
			<li><a href="CpuListController" data-hover="List Cpu">List Cpu</a></li>
			<li><a href="About.jsp" data-hover="A propos">A propos</a></li>		  
	
			<li><a href="UserDeconnexionController"
				onclick="return confirm('Voulez vous vraiment quitter ?')"
				data-hover="Au revoir">Déconnexion</a></li>
		</ul>
	</nav>
	<hr>
	<!-- Page Wrapper -->
	<div id="wrapper">
		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">
			<!-- Main Content -->
			<div id="content">
				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<div
						class="d-sm-flex align-items-center justify-content-between mb-4">
						<h1 class="h3 mb-0 text-gray-800">Dashboard</h1>

					</div>

					<div class="row">
						<!-- Content Column -->


						<div class="col-lg-6 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Pourcentage
										de vente par gamme PC</h6>
								</div>
								<div class="card-body">
									<%
										ArrayList list_vente_par_gamme = (ArrayList) request.getAttribute("list_vente_par_gamme");
											int total_qt_vend_gamme = (int) request.getAttribute("total_qt_vend_gamme");

											if (list_vente_par_gamme != null) {

												for (int i = 0; i < list_vente_par_gamme.size(); i++) {
									%>
									<h4 class="small font-weight-bold">PC gamme
										<%out.println(((Statistique) list_vente_par_gamme.get(i)).getGamme());%>
										<span class="float-right"> <%out.println((((Statistique) list_vente_par_gamme.get(i)).getQt_vend() * 100) / total_qt_vend_gamme);%>%
										</span>
									</h4>
									<div class="progress mb-4">
										<div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar"
											style="width: <%out.println(((((Statistique) list_vente_par_gamme.get(i)).getQt_vend() * 100) / total_qt_vend_gamme)+ "%");%>"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
									</div>
									<%}}%>
								</div>
							</div>

						</div>
						<div class="col-lg-6 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Pourcentage
										de vente par couleur PC</h6>
								</div>
								<div class="card-body">
									<%
										ArrayList list_vente_par_couleur = (ArrayList) request.getAttribute("list_vente_par_couleur");

											if (list_vente_par_couleur != null) {

												for (int i = 0; i < list_vente_par_couleur.size(); i++) {
									%>
									<h4 class="small font-weight-bold">
										PC couleur
										<%
										out.println(((Statistique) list_vente_par_couleur.get(i)).getCouleur());
									%>
										<span class="float-right"> <%
 	out.println((((Statistique) list_vente_par_couleur.get(i)).getQt_vend() * 100)
 						/ total_qt_vend_gamme);
 %>%
										</span>
									</h4>
									<div class="progress mb-4">
										<div class="progress-bar progress-bar-striped progress-bar-animated" role="progressbar"
											style="width: <%out.println(((((Statistique) list_vente_par_couleur.get(i)).getQt_vend() * 100)
								/ total_qt_vend_gamme) + "%");%>"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
									</div>
									<%
										}

											}
									%>

								</div>
							</div>

						</div>


					</div>

					<div class="row">
						<!-- Content Column -->
						<div class="col-lg-6 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Pourcentage
										de vente par type et capacité stockage</h6>
								</div>
								<div class="card-body">
									<%
										ArrayList list_vente_par_hdd = (ArrayList) request.getAttribute("list_vente_par_hdd");

											if (list_vente_par_hdd != null) {

												for (int i = 0; i < list_vente_par_hdd.size(); i++) {
									%>
									<h4 class="small font-weight-bold">
										Type
										<%
										out.println(((Statistique) list_vente_par_hdd.get(i)).getType());
									%>
										<%
											out.println(((Statistique) list_vente_par_hdd.get(i)).getCapaciteHdd());
										%> Go
										<span class="float-right"> <%
 	out.println(
 						(((Statistique) list_vente_par_hdd.get(i)).getQt_vend() * 100) / total_qt_vend_gamme);
 %>%
										</span>
									</h4>
									<div class="progress mb-4">
										<div class="progress-bar bg-danger" role="progressbar"
											style="width: <%out.println(
								((((Statistique) list_vente_par_hdd.get(i)).getQt_vend() * 100) / total_qt_vend_gamme)
										+ "%");%>"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
									</div>
									<%
										}

											}
									%>

								</div>
							</div>

						</div>
						<div class="col-lg-6 mb-4">
							<!-- Project Card Example -->
							<div class="card shadow mb-4">
								<div class="card-header py-3">
									<h6 class="m-0 font-weight-bold text-primary">Pourcentage
										de vente par GPU</h6>
								</div>
								<div class="card-body">
									<%
										ArrayList list_vente_par_gpu = (ArrayList) request.getAttribute("list_vente_par_gpu");

											if (list_vente_par_gpu != null) {

												for (int i = 0; i < list_vente_par_gpu.size(); i++) {
									%>
									<h4 class="small font-weight-bold">
										Marque
										<%
										out.println(((Statistique) list_vente_par_gpu.get(i)).getMarque_gpu());
									%>
										<%
											out.println(((Statistique) list_vente_par_gpu.get(i)).getCapacitegpu());
										%>
										
										<span class="float-right"> <%
 	out.println(
 						(((Statistique) list_vente_par_gpu.get(i)).getQt_vend() * 100) / total_qt_vend_gamme);
 %>%
										</span>
									</h4>
									<div class="progress mb-4">
										<div class="progress-bar bg-danger" role="progressbar"
											style="width: <%out.println(
								((((Statistique) list_vente_par_gpu.get(i)).getQt_vend() * 100) / total_qt_vend_gamme)
										+ "%");%>"
											aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"></div>
									</div>
									<%
										}

											}
									%>

								</div>
							</div>

						</div>

					</div>
					<div class="row">
						<!-- Content Column -->

						<div class="col-sm-6">
							<div class="card">
								<div class="card-header border-0 pb-0">
									<h4 class="mb-0 fs-20 text-black">Bénéfice par rapport
										fournisseur</h4>
									<div class="dropdown custom-dropdown mb-0 tbl-orders-style">


									</div>
								</div>
								<div class="card-body p-3 pb-0">
									<div class="dropdown custom-dropdown d-block tbl-orders">
										<div
											class="btn  d-flex align-items-center border-0 order-bg rounded "
											data-toggle="dropdown">
											<svg width="46" height="46" viewbox="0 0 46 46" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M23.4169 0.00384777C10.7089 -0.226161 0.233857 9.88466 0.00384777 22.5831C-0.226161 35.2815 9.88466 45.7661 22.5831 45.9961C35.2815 46.2261 45.7661 36.1153 45.9961 23.4073C46.2261 10.7089 36.1153 0.224273 23.4169 0.00384777ZM22.6598 41.6834C12.3573 41.4918 4.12485 32.9622 4.31652 22.6598C4.49861 12.3573 13.0281 4.12485 23.3306 4.30694C33.6427 4.49861 41.8655 13.0281 41.6834 23.3306C41.5013 33.6331 32.9622 41.8655 22.6598 41.6834Z"
													fill="#374C98"></path>
                                                <path
													d="M23.3038 6.22751C14.0555 6.06459 6.3981 13.4536 6.23518 22.7019C6.06267 31.9406 13.4517 39.598 22.7 39.7705C31.9483 39.9334 39.6057 32.5444 39.7686 23.3057C39.9315 14.0574 32.5521 6.40002 23.3038 6.22751ZM30.2136 32.7361H14.9564L16.8252 22.3952L14.6593 22.8457V21.0823L17.151 20.5552L18.7707 11.6615H24.8563L23.4763 19.2326L25.6039 18.7822V20.5456L23.1504 21.0535L21.732 28.8738H31.3445L30.2136 32.7361Z"
													fill="#374C98"></path>
                                            </svg>
										</div>
									</div>
									<div class="table-responsive">
										<table
											class="table text-center bg-info-hover tr-rounded order-tbl">
											<thead>
												<tr>
													<th class="text-left">Fournisseur</th>
													<th class="text-left">Somme d'achat</th>
													<th class="text-left">Nb PC achetés</th>
													<th class="text-left">Nombre d'article</th>
													<th class="text-left">Bénéfice</th>
													<th class="text-left">Qte stock</th>
												</tr>
											</thead>
											<tbody>
												<%
													ArrayList list_vente_par_fornissuer = (ArrayList) request.getAttribute("list_vente_par_fornissuer");

														if (list_vente_par_fornissuer != null) {

															for (int i = 0; i < list_vente_par_fornissuer.size(); i++) {
												%>
												<tr>
													<td class="text-left">
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getNom_fournisseur());
														%>
													</td>
													<td>
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getSomme_achat());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getQt_achat());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getQt_art());
														%>
													</td>
													<td>
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getBenefice());
														%>
													</td>
													<td class="text-right">
														<%
															out.println(((Statistique) list_vente_par_fornissuer.get(i)).getQte_stok());
														%>
													</td>
												</tr>
												<%
													}

														}
												%>
											</tbody>
										</table>
									</div>
								</div>

							</div>
						</div>
												<div class="col-sm-6">
							<div class="card">
								<div class="card-header border-0 pb-0">
									<h4 class="mb-0 fs-20 text-black">Quantité en stock </h4>
									<div class="dropdown custom-dropdown mb-0 tbl-orders-style">


									</div>
								</div>
								<div class="card-body p-3 pb-0">
									<div class="dropdown custom-dropdown d-block tbl-orders">
										<div
											class="btn  d-flex align-items-center border-0 order-bg rounded "
											data-toggle="dropdown">
											<svg width="46" height="46" viewbox="0 0 46 46" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M23.4169 0.00384777C10.7089 -0.226161 0.233857 9.88466 0.00384777 22.5831C-0.226161 35.2815 9.88466 45.7661 22.5831 45.9961C35.2815 46.2261 45.7661 36.1153 45.9961 23.4073C46.2261 10.7089 36.1153 0.224273 23.4169 0.00384777ZM22.6598 41.6834C12.3573 41.4918 4.12485 32.9622 4.31652 22.6598C4.49861 12.3573 13.0281 4.12485 23.3306 4.30694C33.6427 4.49861 41.8655 13.0281 41.6834 23.3306C41.5013 33.6331 32.9622 41.8655 22.6598 41.6834Z"
													fill="#374C98"></path>
                                                <path
													d="M23.3038 6.22751C14.0555 6.06459 6.3981 13.4536 6.23518 22.7019C6.06267 31.9406 13.4517 39.598 22.7 39.7705C31.9483 39.9334 39.6057 32.5444 39.7686 23.3057C39.9315 14.0574 32.5521 6.40002 23.3038 6.22751ZM30.2136 32.7361H14.9564L16.8252 22.3952L14.6593 22.8457V21.0823L17.151 20.5552L18.7707 11.6615H24.8563L23.4763 19.2326L25.6039 18.7822V20.5456L23.1504 21.0535L21.732 28.8738H31.3445L30.2136 32.7361Z"
													fill="#374C98"></path>
                                            </svg>
										</div>
									</div>
									<div class="table-responsive">
										<table
											class="table text-center bg-info-hover tr-rounded order-tbl">
											<thead>
												<tr>
													<th class="text-left">marque PC</th>
													<th class="text-left">nom du processeur</th>
													<th class="text-left">Quantité en stock</th>
													
												</tr>
											</thead>
											<tbody>
												<%
													ArrayList list_qteStock_par_marque_cpu = (ArrayList) request.getAttribute("list_qteStock_par_marque_cpu");

														if (list_qteStock_par_marque_cpu != null) {

															for (int i = 0; i < list_qteStock_par_marque_cpu.size(); i++) {
												%>
												<tr>
													<td class="text-left">
														<%
															out.println(((Statistique) list_qteStock_par_marque_cpu.get(i)).getMarque_pc());
														%>
													</td>
													<td>
														<%
															out.println(((Statistique) list_qteStock_par_marque_cpu.get(i)).getProcessor_number());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) list_qteStock_par_marque_cpu.get(i)).getQte_stok());
														%>
													</td>
												</tr>
												<%
													}

														}
												%>
											</tbody>
										</table>
									</div>
								</div>

							</div>
						</div>
					</div>
									<div class="row">
						<!-- Content Column -->

						<div class="col-sm-6">
							<div class="card">
								<div class="card-header border-0 pb-0">
									<h4 class="mb-0 fs-20 text-black">Bénéfice par rapport
										PC</h4>
									<div class="dropdown custom-dropdown mb-0 tbl-orders-style">


									</div>
								</div>
								<div class="card-body p-3 pb-0">
									<div class="dropdown custom-dropdown d-block tbl-orders">
										<div
											class="btn  d-flex align-items-center border-0 order-bg rounded "
											data-toggle="dropdown">
											<svg width="46" height="46" viewbox="0 0 46 46" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M23.4169 0.00384777C10.7089 -0.226161 0.233857 9.88466 0.00384777 22.5831C-0.226161 35.2815 9.88466 45.7661 22.5831 45.9961C35.2815 46.2261 45.7661 36.1153 45.9961 23.4073C46.2261 10.7089 36.1153 0.224273 23.4169 0.00384777ZM22.6598 41.6834C12.3573 41.4918 4.12485 32.9622 4.31652 22.6598C4.49861 12.3573 13.0281 4.12485 23.3306 4.30694C33.6427 4.49861 41.8655 13.0281 41.6834 23.3306C41.5013 33.6331 32.9622 41.8655 22.6598 41.6834Z"
													fill="#374C98"></path>
                                                <path
													d="M23.3038 6.22751C14.0555 6.06459 6.3981 13.4536 6.23518 22.7019C6.06267 31.9406 13.4517 39.598 22.7 39.7705C31.9483 39.9334 39.6057 32.5444 39.7686 23.3057C39.9315 14.0574 32.5521 6.40002 23.3038 6.22751ZM30.2136 32.7361H14.9564L16.8252 22.3952L14.6593 22.8457V21.0823L17.151 20.5552L18.7707 11.6615H24.8563L23.4763 19.2326L25.6039 18.7822V20.5456L23.1504 21.0535L21.732 28.8738H31.3445L30.2136 32.7361Z"
													fill="#374C98"></path>
                                            </svg>
										</div>
									</div>
									<div class="table-responsive">
										<table
											class="table text-center bg-info-hover tr-rounded order-tbl">
											<thead>
												<tr>
													<th class="text-left">Marque PC</th>
													<th class="text-left">Nom du processeur</th>
													<th class="text-left">Quantité vendu</th>
													<th class="text-left">Bénéfice</th>
													
												</tr>
											</thead>
											<tbody>
												<%
													ArrayList liste_benefice_qte_pc  = (ArrayList) request.getAttribute("liste_benefice_qte_pc");

														if (liste_benefice_qte_pc  != null) {

															for (int i = 0; i < liste_benefice_qte_pc.size(); i++) {
												%>
												<tr>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_qte_pc.get(i)).getMarque_pc());
														%>
													</td>
													<td>
														<%
															out.println(((Statistique) liste_benefice_qte_pc.get(i)).getProcessor_number());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_qte_pc.get(i)).getQt_vend());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_qte_pc.get(i)).getBenefice());
														%>
													</td>
												</tr>
												<%
													}

														}
												%>
											</tbody>
										</table>
									</div>
								</div>

							</div>
						</div>
												<div class="col-sm-6">
							<div class="card">
								<div class="card-header border-0 pb-0">
									<h4 class="mb-0 fs-20 text-black">Bénéfice par rapport date
										 vendu</h4>
									<div class="dropdown custom-dropdown mb-0 tbl-orders-style">


									</div>
								</div>
								<div class="card-body p-3 pb-0">
									<div class="dropdown custom-dropdown d-block tbl-orders">
										<div
											class="btn  d-flex align-items-center border-0 order-bg rounded "
											data-toggle="dropdown">
											<svg width="46" height="46" viewbox="0 0 46 46" fill="none"
												xmlns="http://www.w3.org/2000/svg">
                                                <path
													d="M23.4169 0.00384777C10.7089 -0.226161 0.233857 9.88466 0.00384777 22.5831C-0.226161 35.2815 9.88466 45.7661 22.5831 45.9961C35.2815 46.2261 45.7661 36.1153 45.9961 23.4073C46.2261 10.7089 36.1153 0.224273 23.4169 0.00384777ZM22.6598 41.6834C12.3573 41.4918 4.12485 32.9622 4.31652 22.6598C4.49861 12.3573 13.0281 4.12485 23.3306 4.30694C33.6427 4.49861 41.8655 13.0281 41.6834 23.3306C41.5013 33.6331 32.9622 41.8655 22.6598 41.6834Z"
													fill="#374C98"></path>
                                                <path
													d="M23.3038 6.22751C14.0555 6.06459 6.3981 13.4536 6.23518 22.7019C6.06267 31.9406 13.4517 39.598 22.7 39.7705C31.9483 39.9334 39.6057 32.5444 39.7686 23.3057C39.9315 14.0574 32.5521 6.40002 23.3038 6.22751ZM30.2136 32.7361H14.9564L16.8252 22.3952L14.6593 22.8457V21.0823L17.151 20.5552L18.7707 11.6615H24.8563L23.4763 19.2326L25.6039 18.7822V20.5456L23.1504 21.0535L21.732 28.8738H31.3445L30.2136 32.7361Z"
													fill="#374C98"></path>
                                            </svg>
										</div>
									</div>
									<div class="table-responsive">
										<table
											class="table text-center bg-info-hover tr-rounded order-tbl">
											<thead>
												<tr>
													<th class="text-left">Date vendu</th>
													<th class="text-left">Bénéfice</th>
													<th class="text-left">Quantité vendu</th>
													<th class="text-left">Nombre d'article</th>
													
												</tr>
											</thead>
											<tbody>
												<%
													ArrayList liste_benefice_par_date  = (ArrayList) request.getAttribute("liste_benefice_par_date");

														if (liste_benefice_par_date  != null) {

															for (int i = 0; i < liste_benefice_par_date.size(); i++) {
												%>
												<tr>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_par_date.get(i)).getDate_sortie());
														%>
													</td>
													<td>
														<%
															out.println(((Statistique) liste_benefice_par_date.get(i)).getBenefice());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_par_date.get(i)).getQt_vend());
														%>
													</td>
													<td class="text-left">
														<%
															out.println(((Statistique) liste_benefice_par_date.get(i)).getQt_art());
														%>
													</td>
												</tr>
												<%
													}

														}
												%>
											</tbody>
										</table>
									</div>
								</div>

							</div>
						</div>

					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

		</div>
		<!-- End of Content Wrapper -->

	</div>

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