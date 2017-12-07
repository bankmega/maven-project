<%@page import="com.bankmega.traning.model.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8"> 
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
</head>
<body>	
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
	});
</script>
	<div class="container">
		<c:if test="${not empty message}">
			<div  class="alert alert-info" >
				<c:out value="${message }"></c:out>
			</div>	
		</c:if>
		
		<form action="employee/save" method="POST">
			  <div class="form-group">
			  <input type="hidden" name="id" />
			    <label for="noPenjualan">No Penjualan</label>
			    <input type="text" name="noPenjualan" class="form-control" id="inputName" aria-describedby="nameHelp" placeholder="Nomer Penjualan">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="totalPenjualan">Total Harga</label>
			    <input type="text" name="totalPenjualan" class="form-control" id="totalPenjualan" aria-describedby="emailHelp" placeholder="Enter Your Email">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="location">Lokasi</label>
			    <input type="text" name="location" class="form-control" id="inputSalary" aria-describedby="emailHelp" placeholder="Enter Your location">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your salary with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="location">Employee</label>
			  	<select class="form-control" name="employee">
			  		<c:forEach items="${employees }" var="emp">
			  			<option value="${emp.id }"><c:out value="${emp.name }" /></option>
			  		</c:forEach>
			  	</select>
			  </div>
			  
			  
			  <input type="submit" class="btn btn-primary" value="Save" />
		  </form>
		  <hr/>
		  <table class="table table-dark">
		<thead>
			<tr>
				<td>Name</td>
				<td>Email</td>
				<td>Salary</td>
				<td>Action</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="emp" items="${employees}">
			<tr>
				<td><c:out value="${emp.name }"/></td>
				<td><c:out value="${emp.email }"/></td>
				<td><c:out value="${emp.salary }"/></td>
				<td>
					<a class="btn btn-danger delete" id="${emp.id}" href="#">Delete</a>
					<a class="btn btn-warning update" id="${emp.id}" href="#">Update</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>