<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
	<div class="container">
		<form action="employee/save" method="POST">
			  <div class="form-group">
			    <label for="inputName">Name</label>
			    <input type="text" name="name" class="form-control" id="inputName" aria-describedby="nameHelp" placeholder="Enter Your Name">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your name with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="inputEmail">Email</label>
			    <input type="text" name="email" class="form-control" id="inputEmail" aria-describedby="emailHelp" placeholder="Enter Your Email">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="inputSalary">salary</label>
			    <input type="text" name="salary" class="form-control" id="inputSalary" aria-describedby="emailHelp" placeholder="Enter Your Salary">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your salary with anyone else.</small>
			  </div>
			  <div class="form-group">
			    <label for="inputSalary">salary</label>
			    <input type="text" name="birthDate" class="form-control" id="inputSalary" aria-describedby="emailHelp">
			    <small id="emailHelp" class="form-text text-muted">We'll never share your salary with anyone else.</small>
			  </div>
			  <input type="submit" class="btn btn-primary" value="Save" />
		  </form>
	</div>
</body>
</html>