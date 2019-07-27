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
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h1 align="center"><spring:message code="loginwelcome"/></h1>
				</div>
				<div class="panel-body">
				<div class="row">
					${result.user.email}
					${refData}
				</div>
					<form:form method="POST" action="/documentmaster/school/creds/login" modelAttribute="command" class="form-horizontal">
							<div>
								${a}
							</div>
							<form:label path="email" class="control-label">email<span class="red">*</span></form:label>
							<div class="form-group">
								<div class="col-sm-7">
									<form:input path="email" class="form-control" required="true" title="User id must contain 4 to 15 characters"/>
									<br>
								</div>
								<br>
							</div>
							<form:label path="password" class="control-label">Password<span class="red">*</span></form:label>
							<div class="form-group">
								<div class="col-sm-7">
									<form:input type="password" path="password" required="true" title="Password must contain 8 to 15 characters" class="form-control"/>
									<br>
								</div>
								<br>
							</div>
							<div class="form-group">
								<div class="col-sm-7">
									<form:select path="hint" class="form-control">
									<form:option value="" label="--- Select ---"/>
   									<form:options items="${refData['ip_cntry']}" />
									</form:select>
									<br>
								</div>
								<br>
							</div>
							<br><br><br><br>
							<div class="form-group">
								<div class="col-sm-offset-4 col-sm-7">
									<button type="submit" class="btn btn-primary" >Login</button>
								</div>
							</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>