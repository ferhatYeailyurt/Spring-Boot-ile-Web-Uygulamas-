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
    
    <title>Webitech Web App| Home</title>
    
    <link href="static/css/bootstrap.min.css" rel="stylesheet">
     <link href="static/css/style.css" rel="stylesheet">
    
    
		<script src="static/js/html5shiv.min.js"></script>
		<script src="static/js/respond.min.js"></script>
	
</head>
<body>

	<div role="navigation">
		<div class="navbar navbar-inverse">
			<a href="/" class="navbar-brand">Bootsample</a>
			<div class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="new-employee">New Employee</a></li>
					<li><a href="all-employee">All Employee</a></li>
					
					<li><a href="new-employee">New Department</a></li>
					<li><a href="all-employee">All Department</a></li>
					
					<li><a href="new-employee">New Meetings</a></li>
					<li><a href="all-employee">All Meetings</a></li>
				</ul>
			</div>
		</div>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
				<div class="jumbotron text-center">
					<h1>Welcome to Webitech Web App</h1>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_TASKS'}">
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
								<th>Deparment</th>
								<th></th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="employee" items="${employes}">
								<tr>
									<td>${employee.id}</td>
									<td>${employee.name}</td>
									<td>${employee.surname}</td>
									<td>${employee.salary}</td>
									<td>${employee.deparment.name}</td>
									<td><a href="delete-employee?id=${employee.id}"><span class="glyphicon glyphicon-trash"></span></a></td>
									</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h3>Manage Employee</h3>
				<hr>
				<form class="form-horizontal" method="POST" action="save-employee">
					<input type="hidden" name="id" value="${task.id}"/>
					<div class="form-group">
						<label class="control-label col-md-3">Name</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="name" value="${task.name}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Surname</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="surname" value="${task.surname}"/>
						</div>				
					</div>
					<div class="form-group">
						<label class="control-label col-md-3">Salary</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="salary" value="${task.salary}"/>
						</div>				
					</div>	
					<div class="form-group">
						<label class="control-label col-md-3">Deparment id</label>
						<div class="col-md-7">
							<input type="text" class="form-control" name="deparment" value="${task.deparment}"/>
						</div>				
					</div>	
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save"/>
					</div>
				</form>
			</div>
		</c:when>		
	</c:choose>

	<script src="static/js/jquery-1.11.1.min.js"></script>    
    <script src="static/js/bootstrap.min.js"></script>
</body>
</html>