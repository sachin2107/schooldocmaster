<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
		<%-- <form:form method="POST" action="/documentmaster/school/creds/login"
						modelAttribute="command" class="form-horizontal">
		<spring:hasBindErrors name="command">
			<spring:message message="${errors.allErrors}"></spring:message>
		</spring:hasBindErrors>
		</form:form> --%>
		<div><h2><spring:message code="clientId"/></h2></div>
		<button class="btn btn-info btn-lg">Submit</button>
	</div>
</body>
</html>