<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="LoginServlet" method="post">
	Username:<input type="text" name="username" /><br/>
	Password:<Input type="password" name="password" /><br/>
	<input type="submit" value="Login" />
</form>
<p style="color:red">${param.message }</p>
</body>
</html>