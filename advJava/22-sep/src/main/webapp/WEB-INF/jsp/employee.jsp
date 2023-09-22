<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
  <h1>Office Project</h1>
  <p>Done by Empower Best Batch Participants!</p> 
</div>
<jsp:include page="menu.jsp" />
<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<h3>Employee Page</h3>
		<form method="post" action="/employee/dml">
			Id:<input type="number" name="id" class="form-control" />
			Name:<input type="text" name="name" class="form-control" />
			Department:
			<select class="form-control" name="departmentId">
				<c:forEach var="d" items="${departments }">
					<option value="${d.id }">${d.name }</option>
				</c:forEach>			
			</select>
			<br/>
			<input type="submit" class="btn btn-primary" value="Add" name="add" />&nbsp;
			<input type="submit" class="btn btn-warning" value="Update" name="update" />&nbsp;
			<input type="submit" class="btn btn-danger" value="Delete" name="delete" />&nbsp;
		</form>
	</div>
	<div class="col-md-4"></div>
</div>

</body>
</html>