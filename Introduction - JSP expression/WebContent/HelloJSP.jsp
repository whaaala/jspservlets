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
<%!
   public int x = 22; 
   public String name; 
%>
<%= x %>
<br/>
<%= new Integer(23) %>
<br/>
<%= new String("Baba") %>
<br/>
<%= new java.util.Date() %>
<br/>
<%= 25*4 %>
<br/>
<%= 25 > 4 %>
<br/>
<%= name = "Bbabu" %>
<br/>
</body>
</html>