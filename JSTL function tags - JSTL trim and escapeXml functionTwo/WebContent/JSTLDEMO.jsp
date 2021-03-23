<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fn" uri = "http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>JSTL Demo</title>
</head>

<body>
<c:set var="We" value="StudyEasy.org"></c:set>

${fn:startsWith("studyeasy.org", "az")}
<br/>${fn:endsWith(We, "org")}
<br/>${fn:contains(We, "ORG")}
<br/>${fn:containsIgnoreCase("studyeasy.org", "ORG")}
</body>
</html>