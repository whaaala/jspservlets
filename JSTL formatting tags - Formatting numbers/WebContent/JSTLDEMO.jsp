
<%@page import="javax.tools.JavaCompiler"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formatting Demo</title>
</head>
<body>
<c:set var="someNumber" value="654321.123456"/>
<c:out value="${someNumber}"></c:out>

<br/>
Max Integer Digits: <fmt:formatNumber type="number"  maxIntegerDigits="3" value="${someNumber}"/>

<br/> 
Max Fraction Digits: <fmt:formatNumber type="number"  maxFractionDigits="3" value="${someNumber}"/>

<br/>
Currency: <fmt:formatNumber type="currency"  value="${someNumber}"/>

<br/>

<fmt:setLocale value="en_US"/>
Currency: <fmt:formatNumber type="currency"  value="${someNumber}"/>

</body>
</html>