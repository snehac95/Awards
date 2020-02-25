<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit The Awards</title>
<link
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-primary bg-dark">
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarTogglerDemo01"
		aria-controls="navbarTogglerDemo01" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarTogglerDemo01">
		<a class="navbar-brand" href="Nominatefilm.jsp">Nomination</a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0 ">
		</ul>
	<form class="form-inline my-2 my-lg-0">
	<a class="nav-link" href="Awardfilm.jsp">Nomination</a>
	</form>
	</div>
	</nav>
	<form action="Submit.do">
	<div class="container w-50%">
	<div class="card-body" align="front">
	<h2 class="card-title" font="bold">
	<b>Submit The Awards</b>
	</h2>
	<div class="form-group">
	  <div class="form-group col-md-6">
	  <label for="awardName"></label> <input name="AwardName" type="text"
	  class="form-control" placeholder="AwardName"
		id="awardName">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="sponsar"></label> <input name="Spansar" type="text"
		class="form-control" placeholder="Sponsar"
		id="sponsar">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="gift"></label> <input name="Gift" type="text"
		class="form-control"placeholder="Gift"
		id="gift">
	</div>
	
		<button type="submit" class="btn btn-success">Submit The Awards</button>
	</div>
	
	<div class="text-center" align="center">
	<span style="color: green; font-family: cursive;">${successMessage}</span>
	<span style="color: red; font-family: cursive;">${failureMessage}</span>
	</div>
	
</form>
</body>
</html>