<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello JSP</title>
</head>
<body>
<h1>Hello JSP</h1>

<%
 int x = 25;

if(x > 25){
	out.print("X is greater than 25");
}else{
	out.print("X is not greater than 25");
}

out.println("<br/>");
 
 for(int j = 0; j <10; j++){
	 out.print("<br/>");
	 out.print(j);
 }

%>
</html>