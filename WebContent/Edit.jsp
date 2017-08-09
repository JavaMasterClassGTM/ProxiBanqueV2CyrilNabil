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

<title>Editer un client</title>

<!-- Bootstrap core CSS -->
<link href="assets/css/bootstrap.css" rel="stylesheet">
<!--external css-->
<link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" type="text/css"
	href="assets/js/bootstrap-datepicker/css/datepicker.css" />
<link rel="stylesheet" type="text/css"
	href="assets/js/bootstrap-daterangepicker/daterangepicker.css" />

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
	<!--logo start--> <a href="Home.jsp" class="logo"><b>ProxiBanque</b></a>
	<!--logo end-->
	<div class="nav notify-row" id="top_menu">
		<!--  notification start -->
		<ul class="nav top-menu">
			<!-- settings start -->
			<li class="dropdown"><a data-toggle="dropdown"
				class="dropdown-toggle" href="index.html#"> <i
					class="fa fa-tasks"></i> <span class="badge bg-theme">0</span>
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
				<a href="profile.html"><img src="assets/img/ui-sam.jpg"
					class="img-circle" width="60"></a>
			</p>
			<h5 class="centered">Pierre Richard</h5>

			<li class="mt"><a href="Home.jsp"> <i
					class="fa fa-dashboard"></i> <span>Liste Client</span>
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
		<i class="fa fa-angle-right"></i> Modifier les données d'un client
	</h3>

	<!-- BASIC FORM ELELEMNTS -->
	<div class="row mt">
		<div class="col-lg-12">
			<div class="form-panel">
				<h4 class="mb">
					<i class="fa fa-angle-right"></i> Client de Pierre Richard
				</h4>
				<form class="form-horizontal style-form" method="get">
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">Nom</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">Prenom</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">Adresse
							Email</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">Adresse</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">CodePostal</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 col-sm-2 control-label">Ville</label>
						<div class="col-sm-10">
							<input type="text" class="form-control round-form">
						</div>
					</div>
					<button class="btn btn-theme" href="#" type="submit">
						<i class="fa"></i> Valider les modifications
					</button>
				</form>
			</div>
		</div>
		<!-- col-lg-12-->
	</div>
	<!-- /row --> </section>
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
	<script src="assets/js/jquery-ui-1.9.2.custom.min.js"></script>



	<script>
		//custom select box

		$(function() {
			$('select.styled').customSelect();
		});
	</script>

</body>
</html>