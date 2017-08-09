<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="Dashboard">
<meta name="keyword"
	content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

<title>Liste des comptes</title>

<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />

<!-- Custom styles for this template -->
<link href="assets/css/style.css" rel="stylesheet">
<link href="assets/css/style-responsive.css" rel="stylesheet">

<!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body>

	<section id="container"> <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
	<!--header start--> <header class="header black-bg">
	<div class="sidebar-toggle-box">
		<div class="fa fa-bars tooltips" data-placement="right"
			data-original-title="Toggle Navigation"></div>
	</div>
	<!--logo start--> <a href="#" class="logo"><b>ProxiBanque</b></a> <!--logo end-->
	<div class="nav notify-row" id="top_menu">
		<!--  notification start -->
		<ul class="nav top-menu">
			<!-- settings start -->
			<li class="dropdown"><a data-toggle="dropdown"
				class="dropdown-toggle" href="#"> <i class="fa fa-tasks"></i> <span
					class="badge bg-theme">0</span>
			</a>
				<ul class="dropdown-menu extended tasks-bar">
					<div class="notify-arrow notify-arrow-green"></div>
					<li>
						<p class="green">Vous n'avez aucune taches en attente</p>
					</li>
					<li></li>
					<li class="external"><a href="#">Voir mes taches</a></li>
				</ul></li>
			<!-- settings end -->
			<!-- inbox dropdown start-->
			<li id="header_inbox_bar" class="dropdown"><a
				data-toggle="dropdown" class="dropdown-toggle" href="index.html#">
					<i class="fa fa-envelope-o"></i> <span class="badge bg-theme">5</span>
			</a>
				<ul class="dropdown-menu extended inbox">
					<div class="notify-arrow notify-arrow-green"></div>
					<li>
						<p class="green">Vous avez 5 nouveaux messages</p>
					</li>
					<li><a href="#"> <span class="subject"> <span
								class="from">Madame Michu</span> <span class="time">A
									l'instant</span>
						</span> <span class="message"> A propos de mon viager... </span>
					</a></li>
					<li><a href="#"> <span class="subject"> <span
								class="from">Divya Manian</span> <span class="time">40
									mins.</span>
						</span> <span class="message"> Demande de prêt... </span>
					</a></li>
					<li><a href="#"> <span class="subject"> <span
								class="from">Dan Rogers</span> <span class="time">2 hrs.</span>
						</span> <span class="message"> Découvert autorisé... </span>
					</a></li>
					<li><a href="#"> <span class="subject"> <span
								class="from">Dj Sherman</span> <span class="time">4 hrs.</span>
						</span> <span class="message"> Dépot de liquide... </span>
					</a></li>
					<li><a href="#">Voir vos messages</a></li>
				</ul></li>
			<!-- inbox dropdown end -->
		</ul>
		<!--  notification end -->
	</div>
	<div class="top-menu">
		<ul class="nav pull-right top-menu">
			<li><a class="logout" href="Accueil.jsp">Deconnection</a></li>
		</ul>
	</div>
	</header> <!--header end--> <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
	<!--sidebar start--> <aside>
	<div id="sidebar" class="nav-collapse ">
		<!-- sidebar menu start-->
		<ul class="sidebar-menu" id="nav-accordion">

			<p class="centered">
				<img src="assets/img/ui-sam.jpg" class="img-circle" width="60">
			</p>
			<h5 class="centered">Pierre Richard</h5>

			<li class="mt"><a href="#"> <i class="fa fa-dashboard"></i>
					<span>Liste Client</span>
			</a></li>

			<li class="sub-menu"><a href="Edit.jsp"> <i
					class="fa fa-desktop"></i> <span>Modifier Client</span>
			</a>
				<ul class="sub">
					<li><a href="Edit.jsp">Modification</a></li>
					<li><a href="AddClient.jsp">Ajout de client</a></li>
					<li><a href="DeleteClient.jsp">Suppression de client</a></li>
				</ul></li>

			<li class="sub-menu"><a href="ListeCompte.jsp"> <i
					class="fa fa-cogs"></i> <span>Liste Compte</span>
			</a></li>
			<li class="sub-menu"><a href="Virement.jsp"> <i
					class="fa fa-book"></i> <span>Gestion des virements</span>
			</a></li>
		</ul>
		<!-- sidebar menu end-->
	</div>
	</aside> <!--sidebar end--> <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
	<!--main content start--> <section id="main-content"> <section
		class="wrapper">
	<h3>
		<i class="fa fa-angle-right"></i> Liste Compte
	</h3>
	<div class="row">

		<div class="col-md-12 mt">
			<div class="content-panel">
				<table class="table table-hover">
					<h4>
						<i class="fa fa-angle-right"></i> Compte client de Pierre Richard
					</h4>
					<hr>
					<thead>
						<tr>
							<th>#</th>
							<th>Numéro de compte</th>
							<th>Nom client</th>
							<th>Solde</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>155069875</td>
							<td>Rabineau</td>
							<td>1550</td>
						</tr>
						<tr>
							<td>2</td>
							<td>147829645</td>
							<td>Bouaouli</td>
							<td>14785</td>
						</tr>
						<tr>
							<td>3</td>
							<td>154784547</td>
							<td>Crea'ch</td>
							<td>1698756</td>
						</tr>
					</tbody>
				</table>
			</div>
			<! --/content-panel -->
		</div>
		<!-- /col-md-12 -->
	</div>
	<!-- row --> </section>
	<! --/wrapper --> </section><!-- /MAIN CONTENT --> <!--main content end--> <!--footer start-->
	<footer class="site-footer">
	<div class="text-center">
		ProxiBanque Cyril-Nabil 2017 <a href="#" class="go-top"> <i
			class="fa fa-angle-up"></i>
		</a>
	</div>
	</footer> <!--footer end--> </section>

	<!-- js placed at the end of the document so the pages load faster -->
	<script src="assets/js/jquery.js"></script>
	<script src="assets/js/bootstrap.min.js"></script>
	<script class="include" type="text/javascript"
		src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
	<script src="assets/js/jquery.scrollTo.min.js"></script>
	<script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


	<!--common script for all pages-->
	<script src="assets/js/common-scripts.js"></script>

	<!--script for this page-->

	<script>
		//custom select box

		$(function() {
			$('select.styled').customSelect();
		});
	</script>

</body>
</html>