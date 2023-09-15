<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!		int x=20; %>
<%=2*13 %>
<br/>
<%=new Date() %>
<br/>
<hr/>
<%
	Date dt=new Date();
	out.print(dt);
	/* out.print("<br/>"); */
	int i=20;
	int j=30;
	int k=i+j;
	
	if(k>100)
	{
		%>
		<br/>
		<%
		out.println("High");
	
%>

<%
	}else
		out.print(20*30);
%>


</body>
</html>