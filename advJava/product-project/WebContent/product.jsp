<%@page import="com.empower.ecom.model.Product"%>
<%@page import="java.util.List"%>
<%@page import="com.empower.ecom.model.ProductDaoImpl"%>
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
<%
	/* to create table */
	ProductDaoImpl pdao=new ProductDaoImpl();
	pdao.createTable();	
	
	List<Product> products=pdao.read();
	session.setAttribute("products", products);
%>
<div class="container-fluid p-5 bg-primary text-white text-center">
  <h1>E-Commerce Site</h1>
  <p>Done by Empower Best Batch Participants!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
    </div>
    <div class="col-sm-4">
    	<h3 class="text-center">Product Page</h3>
    	<form method="post" action="product">
    		Id:<input type="number" name="id" class="form-control" value="${product.id }" />
    		Name:<input type="text" name="name" class="form-control" value="${product.name }" />
    		Price:<input type="number" name="price" class="form-control" value="${product.price }" />
    		<br/>
    		<input type="submit" value="Add" name="btn" class="btn btn-primary" />&nbsp;
    		<input type="submit" value="Update" name="btn" class="btn btn-warning" />&nbsp;
    		<input type="submit" value="Delete" name="btn" class="btn btn-danger" />
    	</form>
    </div>
    <div class="col-sm-4">
    </div>
  </div>
  <br/>
  <hr/>
  <br/>
  <div class="row">
  	<div class="col-sm-2"></div>
  	<div class="col-sm-8">
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
  	<div class="col-sm-2"></div>
  </div>
</div>
</body>
</html>