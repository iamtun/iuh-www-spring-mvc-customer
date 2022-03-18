<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Customer form</title>
</head>
<body>
	<form:form action="processFormTwo" modelAttribute="customer" method="post">
		Id: <form:input path="id"/>
		<br><br>
		
		First Name: <form:input path="firstName"/>
		<br><br>
		
		Last Name: <form:input path="lastName"/>
		<br><br>
		
		Gender: <form:radiobuttons path="sex" items="${customer.genderOptions }" id="gender"/>
		<br><br>
		
		Address: <form:input path="address"/>
		<br><br>
		
		Email: <form:input path="email"/>
		<br><br>
		
		<input type="submit" value="submit">
	</form:form>
</body>
</html>