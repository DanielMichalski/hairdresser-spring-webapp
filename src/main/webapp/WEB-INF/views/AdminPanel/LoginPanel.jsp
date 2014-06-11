<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="true" %>
<%@page contentType="text/html;charset=UTF-8"%>





<html>
<head>
<title>Login Page</title>
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
 
	<h1>Spring Security Custom Login Form (XML)</h1>
 
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
		  </table>
 
		</form>
	</div>
 
</body>
</html>