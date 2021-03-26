<%@ page import="java.util.Date,org.java.hibernate.UserDefine"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp File</title>
</head>
<body>
	<%=new Date()%>
	<%! UserDefine user = new UserDefine(); %>
	<br />
	
	 <%--
		out.print(new UserDefine().demo());
	--%>
	
	<% out.print(user.demo()); %>
	
</body>
</html>