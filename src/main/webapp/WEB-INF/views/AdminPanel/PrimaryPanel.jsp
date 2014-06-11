<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>
<html>
<head>
	<title>Hairdress Program</title>
<style>

h1 {
	position: absolute;
	left: 40%;
}

</style>
</head>
<body>
<h1>Panel Administratora</h1>

<a href="<c:url value="/j_spring_security_logout" />">Wyloguj się</a>
<br><br><br>
<form action ="<c:url value="admin/reportsPanel"/> ">
<input type="submit" value = "Panel Zgłoszeń"/> 
</form>
<form action="<c:url value="/admin/registerHairstylist" />" > <input type = "submit" value="Rejestracja Pracownika"/></form>

</body>
</html>