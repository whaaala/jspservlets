<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Name: <%= request.getParameter("name") %><br/>
Gender: <%= request.getParameter("gender") %><br/>
Languages known: <%
   String[] languages = request.getParameterValues("language");
if(languages !=null){
	for(int x = 0; x< languages.length; x++){
		out.print("<br/>");
		out.print(languages[x]);
	}
}else{
	out.print("No language selected");
}

%><br/>
Country: <%= request.getParameter("country") %><br/>
</body>
</html>