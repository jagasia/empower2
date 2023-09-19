<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>Customer Module</h1>
  <p>Resize this responsive page to see the effect!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
    </div>
    <div class="col-sm-4">
      <h3>Login Page</h3>
		<form method="post" action="validateLogin">
			Username: <input type="text" name="username" class="form-control" />
			Password: <input type="password" name="password" class="form-control" />
			<input type="submit" value="Login!" class="btn btn-success" />&nbsp;
			<input type="reset" value="Reset" class="btn btn-warning" />
		</form>
    </div>
    <div class="col-sm-4">
    </div>
  </div>
</div>
</body>
</html>