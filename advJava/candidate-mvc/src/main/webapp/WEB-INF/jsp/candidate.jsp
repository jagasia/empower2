<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"  %>
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
  <h1>Feign Client Demo</h1>
  <p>This Candidate Mvc Project accesses the spring jpa rest api!</p> 
</div>
  
<div class="container mt-5">
  <div class="row">
    <div class="col-sm-4">
      
      
    </div>
    <div class="col-sm-4">
      <h3>Candidate Page</h3>
      <form:form method="post" action="/dml" modelAttribute="candidate">
      	Id:<form:input type="number" path="id" class="form-control" />
      	First Name:<form:input type="text" path="firstName" class="form-control" />
      	Last Name:<form:input type="text" path="lastName" class="form-control" /><br/>
      	<input type="submit" value="Add" name="add" class="btn btn-info" />&nbsp;
      	<input type="submit" value="Update" name="update" class="btn btn-warning" />&nbsp;
      	<input type="submit" value="Delete" name="delete" class="btn btn-danger" />
      </form:form>
    </div>
    <div class="col-sm-4">
      
    </div>
  </div>
  <div class="row">
  	<div class="col-sm-2"></div>
  	<div class="col-sm-8">
  		<table class="table table-bordered table-striped table-hover">
  			<thead>
  				<tr>
  					<th>Id</th>
  					<th>First Name</th>
  					<th>Last Name</th>
  					<th></th>
  				</tr>
  			</thead>
  			<tbody>
  			<c:forEach var="c" items="${candidates }">
  				<tr>
  					<td>${c.id }</td>
  					<td>${c.firstName }</td>
  					<td>${c.lastName }</td>
  					<td><a href="/select/${c.id }" class="btn btn-primary">Select</a></td>
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