<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="org.java.hibernate.entity.Files"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listing Images</title>
</head>
<body>
<h1>Listing Images</h1>
<%
String path  = (String)request.getAttribute("path");
List<Files> files = (List<Files>)request.getAttribute("files");
for(Files file: files){
	out.print("<br/><img src="+path+file.getFileName()+">");
}
%>
</body>
</html>