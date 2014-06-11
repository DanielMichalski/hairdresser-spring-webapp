<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
#Register-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hairdresser Program</title>
</head>
<body>
<h1>---------------------------------------------------------------------------Register Panel----------------------------------------------------------------</h1>



<div id="Register-box">
<form:form commandName="hairstylist">

	<table>
		<tr>
			<td>Imie: </td><td><form:input path="name"/></td>
			<td><form:errors path="name"/></td>
		</tr>
		<tr>
			<td>Nazwisko: </td><td><form:input path="surname"/></td>
			<td><form:errors path="surname"/></td> 
		</tr>
		<tr>
			<td>Login: </td><td><form:input path="login"/></td>
			<td><form:errors path="login"/></td>
		</tr>
		<tr>
			<td>Hasło: </td><td><form:password path="password"/></td>
			<td><form:errors path="password"/></td>
		</tr>
		<tr><td><input type="submit" value="Submit" /></td></tr>
	</table>
	
</form:form>
</div>
</body>
</html>