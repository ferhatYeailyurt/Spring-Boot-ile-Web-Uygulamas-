<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Pragma" content="no-cache"> 
    <meta http-equiv="Cache-Control" content="no-cache"> 
    <meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">
    
    <title>Mebitech Web App| Home</title>
    
       <link href="static/css/bootstrap.min.css" rel="stylesheet">
       <link href="static/css/style.css" rel="stylesheet">
    
   
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	
</head>
<body>


	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Mebitech Web App</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-task">Employee</a></li>
					<li><a href="all-tasks">Department</a></li>
					<li><a href="all-tasks">Meetings</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<div class="container invisible-at-first" id="homeDiv">
		<div class="jumbotron text-center">
			<h1>Hos Geldiniz</h1>
		</div>
	</div>
	
	<div class="container text-center" id="tasksDiv">
				<h3>Employee</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Id</th>
								<th>Name</th>
								<th>Surname</th>
								<th>Salary</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employe" items="${employes}">
								<tr>
									<td>${employe.id}</td>
									<td>${employe.name}</td>
									<td>${employe.surname}</td>
									<td>${employe.salary}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
	
	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
	
	</body>
	
	</html>