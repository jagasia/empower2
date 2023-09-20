<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <h1>E-Commerce Site</h1>
  <p>Done by Empower Best Batch Participants!</p> 
</div>
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<h3>Product Page</h3>
		<form method="post" action="dml">
			Id:<input type="number" name="id" class="form-control" />
			Name:<input type="text" name="name" class="form-control" />
			Price:<input type="number" name="price" class="form-control" />
			<br/>
			<input type="submit" name="add" value="Add" class="btn btn-info" />&nbsp;
			<input type="submit" name="update" value="Update" class="btn btn-warning" />&nbsp;
			<input type="submit" name="delete" value="Delete" class="btn btn-danger" />&nbsp;
		</form>
	</div>
	<div class="col-md-4"></div>
</div>

<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-8">
		<table class="table table-bordered table-striped table-hover">
		  			<thead>
  				<tr>
  					<th>Id</th><th>Name</th><th>Price</th><th></th>
  				</tr>
  			</thead>
  			  			<tbody>
  				<c:forEach var="p" items="${products }">
  					<tr>
  						<td>${p.id }</td>
  						<td>${p.name }</td>
  						<td>${p.price }</td>
  						<td><a href="select?id=${p.id }" class="btn btn-info">Select</a></td>
  					</tr>
  				</c:forEach>		
  			</tbody>
		</table>
	</div>
	<div class="col-md-2"></div>
</div>

</body>
</html>