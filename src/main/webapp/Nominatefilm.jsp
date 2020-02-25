<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submit The Nominate</title>
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
		<a class="navbar-brand" href="Nominatefilm">Nomination</a>
		<ul class="navbar-nav mr-auto mt-2 mt-lg-0 ">
		</ul>
	<form class="form-inline my-2 my-lg-0">
	<a class="nav-link" href="Awardfilm.jsp">Nomination</a>
	</form>
	</div>
	</nav>
	<form action="Save.do">
	<div class="container w-50%">
	<div class="card-body" align="front">
	<h2 class="card-title" font="bold">
	<b>Submit The Nominate</b>
	</h2>
	<div class="form-group">
	  <div class="form-group col-md-6">
	  <label for="filmName"></label> <input name="FilmName" type="text"
	  class="form-control" placeholder="FilmName"
		id="filmName">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="Language"></label> <input name="Language"type="text"
		class="form-control" placeholder="Language"
		id="Language">
	</div>

	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="leadActor"></label> <input name="LeadActor"type="text"
		class="form-control"placeholder="Lead Actor"
		id="leadActor">
	</div>
	
	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="year"></label> <input name="Year"type="text"
		class="form-control"placeholder="Year"
		id="year">
	</div>
	
	<div class="form-group">
		<div class="form-group col-md-6">
		<label for="supportingLead"></label> <input name="SupportingLead" type="text"
		class="form-control"placeholder="Supporting Lead"
		id="supportingLead">
	</div>
	
		<button type="submit" class="btn btn-success">Submit The Nominate</button>
	</div>
	
	<div class="text-center" align="center">
	<span style="color: green; font-family: cursive;">${successMessage}</span>
	<span style="color: red; font-family: cursive;">${failureMessage}</span>
	</div>
	
</form>
</body>
</html>