<%@page language="java"
	import="java.util.ArrayList,modele.domaine.NouveauxPcInfo,modele.domaine.Fournisseur, modele.domaine.Cpu,modele.domaine.Gpu,modele.domaine.Ram,modele.domaine.Hdd"%>
<%@include file="entete.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=windows-1256">
<title>Fiche PC</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/style.css" />
</head>

<body>


	<div>Veuillez saisir les caractéristiques d'un Pc :</div>


	<hr>

	<%
		//gestion des erreurs
		ArrayList erreurs = (ArrayList) request.getAttribute("err");

		if (erreurs != null) {
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

		// gestion de la saisie d produit en cours
		int id_pc = 0;
		String MarquePc = null;
		String gamme = null;
		String couleur = null;
		String date_entree = null;
		String date_sortie = null;
		double prix_achat = 0;
		double prix_vente = 0;
		int qte_stock = 0;
		int qte_vendu = 0;
		int id_fournisseur = 0;
		int id_cpu = 0;
		int id_gpu = 0;
		int id_hdd = 0;
		int id_ram = 0;

		NouveauxPcInfo p = (NouveauxPcInfo) request.getAttribute("pc");

		if (p != null) {
			id_pc = p.getId_pc();
			MarquePc = p.getMarquePc();
			gamme = p.getGamme();
			couleur = p.getCouleur();
			date_entree = p.getDate_entree();
			date_sortie = p.getDate_sortie();
			prix_achat = p.getPrix_achat();
			prix_vente = p.getPrix_vente();
			qte_stock = p.getQte_stock();
			qte_vendu = p.getQte_vendu();
			id_fournisseur = p.getId_fournisseur();
			id_cpu = p.getId_cpu();
			id_gpu = p.getId_gpu();
			id_hdd = p.getId_hdd();
			id_ram = p.getId_ram();

			
		}

		// Correction des  valleurs nulles
		if (MarquePc == null)
			MarquePc = "";
		if (gamme == null)
			gamme = "";
		if (couleur == null)
			couleur = "";
		if (date_entree == null)
			date_entree = "";
		if (date_sortie == null)
			date_sortie = "";

		// récupérer la liste des ListCpu
		ArrayList<Fournisseur> fournisseurs = (ArrayList<Fournisseur>) request.getAttribute("ListFournisseur");
		ArrayList<Cpu> cpus = (ArrayList<Cpu>) request.getAttribute("ListCpu");
		ArrayList<Gpu> gpus = (ArrayList<Gpu>) request.getAttribute("ListGpu");
		ArrayList<Ram> rams = (ArrayList<Ram>) request.getAttribute("ListRam");
		ArrayList<Hdd> hdds = (ArrayList<Hdd>) request.getAttribute("ListHdd");
	%>


	<div>
		<form action="FormNouveauxPcInfoAction" method="POST">
			<table>
				<tr>
					<td><input type="hidden" name="id_pc" value="<%=id_pc%>" /></td>
				</tr>
				<tr>
					<td class="label">MarquePc:</td>
					<td><input type="text" name="MarquePc" value="<%=MarquePc%>" /></td>
				</tr>
				<tr>
					<td class="label">gamme:</td>
					<td><input type="text" name="gamme" value="<%=gamme%>" placeholder = "Ex: pro, gamer, standard"/></td>
				</tr>
				<tr>
					<td class="label">couleur:</td>
					<td><input type="text" name="couleur" value="<%=couleur%>" /></td>
				</tr>
				<tr>
					<td class="label">date_entree:</td>
					<td><input type="date" name="date_entree"
						value="<%=date_entree%>" /></td>
				</tr>
				<tr>
					<td class="label">date_sortie:</td>
					<td><input type="date" name="date_sortie"
						value="<%=date_sortie%>" /></td>
				</tr>
				<tr>
					<td class="label">prix_achat:</td>
					<td><input type="number" name="prix_achat"
						value="<%=prix_achat%>" min="0" /></td>
				</tr>
				<tr>
					<td class="label">prix_vente:</td>
					<td><input type="number" name="prix_vente"
						value="<%=prix_vente%>" min="0" /></td>
				</tr>
				<tr>
					<td class="label">qte_stock:</td>
					<td><input type="number" name="qte_stock"
						value="<%=qte_stock%>" min="0"/></td>
				</tr>
				<tr>
					<td class="label">qte_vendu:</td>
					<td><input type="number" name="qte_vendu"
						value="<%=qte_vendu%>" min="0"/></td>
				</tr>

				<tr>
					<td class="label">Fournisseur:</td>
					<td><select name="id_fournisseur">

							<option>0</option>
							<%
								for (int j = 0; j < fournisseurs.size(); j++) {
									Fournisseur c = fournisseurs.get(j);
							%>


							<option value="<%=c.getId_fournisseur()%>"
								<%if (id_fournisseur == c.getId_fournisseur()) {
					out.println("selected");
				}%>>
								<%=c.getNom_fournisseur()%>................
								<%=c.getTlf()%>.............
								<%=c.getAddresse()%>.............
								<%=c.getAddresse()%>......................
								<%=c.getEmail()%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>

				<tr>
					<td class="label">Cpu:</td>
					<td><select name="id_cpu">
							<option>0</option>
							<%
								for (int j = 0; j < cpus.size(); j++) {
									Cpu c = cpus.get(j);
							%>
							<option value="<%=c.getId_cpu()%>"
								<%if (id_cpu == c.getId_cpu()) {
					out.println("selected");
				}%>>

								<%=c.getGenerationCpu()%>..........
								<%=c.getNombre_de_coeur()%>..........
								<%=c.getSpeed()%>.............
								<%=c.getProcessor_number()%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
					<td class="label">Gpu:</td>
					<td><select name="id_gpu">
							<option>0</option>
							<%
								for (int j = 0; j < gpus.size(); j++) {
									Gpu c = gpus.get(j);
							%>
							<option value="<%=c.getId_gpu()%>"
								<%if (id_gpu == c.getId_gpu()) {
					out.println("selected");
				}%>>
								<%=c.getMarqueGpu()%>...........
								<%=c.getCapaciteGpu()%>..........
								<%=c.getVitesse()%>...........
							</option>
							<%
								}
							%>
					</select></td>
				</tr>
				<tr>
					<td class="label">Ram:</td>
					<td><select name="id_ram">
							<option>0</option>
							<%
								for (int j = 0; j < rams.size(); j++) {
									Ram c = rams.get(j);
							%>
							<option value="<%=c.getId_ram()%>"
								<%if (id_ram == c.getId_ram()) {
					out.println("selected");}%>>
								<%=c.getCapaciteRam()%>...........
								<%=c.getGenerationRam()%>...........
								<%=c.getMarqueRam()%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>

				<tr>
					<td class="label">Hdd:</td>
					<td><select name="id_hdd">
							<option>0</option>
							<%
								for (int j = 0; j < hdds.size(); j++) {
									Hdd c = hdds.get(j);
							%>
							<option value="<%=c.getId_hdd()%>"
								<%if (id_hdd == c.getId_hdd()) {
					out.println("selected");
				}%>>
								<%=c.getCapaciteHdd()%> Go..........							
								<%=c.getBande_passante()%>.......
								<%=c.getMarqueHdd()%>
							</option>
							<%
								}
							%>
					</select></td>
				</tr>


				<tr>
					<td align="center" colspan="2">
						<input type="submit" value="ok" class="btn btn-primary"/>
						<a href ="PcCompletListController" class="btn btn-secondary">Annuler</a>
					</td>
				</tr>
			</table>
				</form>
</div>	
</body>
</html>