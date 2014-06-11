<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE>
<html>
<head>
	<title>Hairdress Program</title>
</head>
<body>
<h1>Strona Główna</h1>

<form action="<c:url value="/customer" />"> <input type="submit" value="Panel Użytkownika"/></form>
<form action="<c:url value="/hairstylist"/>"> <input type="submit" value="Panel Fryzjera"/></form>
<form action="<c:url value="/admin" />"> <input type="submit" value="Panel Administratora"/></form>

</body>
</html>
