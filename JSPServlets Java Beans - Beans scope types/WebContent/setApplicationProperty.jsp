<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Set Property</title>
</head>
<body>
<jsp:useBean id="user" class="org.java.beans.User" scope="application"></jsp:useBean>
<jsp:setProperty property="firstName" name="user" value="Baba"/><br/>
<jsp:setProperty property="lastName" name="user" value="Tim"/>
values have been set
</body>
</html>