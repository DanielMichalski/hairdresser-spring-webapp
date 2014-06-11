<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Panel</title>
<style>

#login-box {
	width: 300px;
	padding: 20px;
	margin: 100px auto;
	background: #fff;
	-webkit-border-radius: 2px;
	-moz-border-radius: 2px;
	border: 1px solid #000;
}
</style>
</head>
<body>
Logowanie Panel Użytkownika
<div id="login-box">
 
		<h3>Podaj login i hasło</h3>
  
		<form name='loginForm'
		  action="<c:url value='j_spring_security_check' />" method='POST'>
 
		  <table>
			<tr>
				<td>Login:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Hasło:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td ><input name="submit" type="submit"
					value="submit" /></td>
			</tr>
			<tr>
				<td><a href="<c:url value="/customerCreateAccount" />">Zarejestruj się</a></td>
			</tr>
		  </table>
 
		</form>
	</div>

</body>
</html>