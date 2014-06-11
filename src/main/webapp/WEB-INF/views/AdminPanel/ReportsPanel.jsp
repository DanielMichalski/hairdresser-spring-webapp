<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Administrator Panel</title>
<style>

#tabela {
	
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
	font-size: 20px;
}
</style>
</head>
<body>
<h1>--------------------------------------------------------------Konta oczekujące na akceptacje-----------------------------------------------------</h1>
<c:choose>

<c:when test="${not empty ReportsList }">

<table id="tabela" border="5">
	<c:forEach items="${ReportsList}" var="customer">
	<tr><td><b>Imię: </b>${customer.getName()}</td><td><b>Nazwisko: </b>${customer.getSurname()}</td><td><b>E-mail: </b>${customer.getEmail()}</td>
	<td><b>Numer Telefonu: </b>${customer.getTelephoneNumber()}</td><td><form action="<c:url value="/admin/reportsPanel/accept/${customer.getId()}"/> ">
	
	<input type="submit" value="Akceptuj"/></form></td><td><form action="<c:url value="/admin/reportsPanel/reject/${customer.getId()}"/> ">
	<input type="submit" value="Odrzuć"/></form></td></tr>
	
	</c:forEach>

</table>

</c:when>
<c:when test="${empty ReportsList }">
W tej chwili nie ma żadnych kont oczekujących na zatwierdzenie
</c:when>
</c:choose>

</body>
</html>