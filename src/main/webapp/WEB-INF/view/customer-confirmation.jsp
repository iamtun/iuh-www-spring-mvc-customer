<%@ page pageEncoding="UTF-8" language="java" contentType="text/html charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Customer List</title>
</head>
<body>
	Customer list:
	<ul>
		<c:forEach var="customer" items="${CUSTOMER_LIST}">
			<details>
				<summary>${customer.id} - ${customer.firstName} ${customer.lastName}</summary>
				<ul>
					<li>Gender: ${customer.sex}</li>
					<li>Address: ${customer.address }</li>
					<li>Email: ${customer.email}</li>
				</ul>
			</details>
		</c:forEach>
	</ul>
	
	<a href="/spring-mvc-customer">Back</a>
</body>
</html>