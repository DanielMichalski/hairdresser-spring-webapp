<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>Hairdress Program</title>
</head>
<body>
<h1>Panel Fryzjera</h1>
	<form action="<c:url value="/j_spring_security_logout" />" > <input type = "submit" value="Wyloguj się"/></form>
</body>
</html>