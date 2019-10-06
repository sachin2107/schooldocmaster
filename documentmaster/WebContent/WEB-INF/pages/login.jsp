<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<%-- <script src="<c:url value="/pages/js/OnDropDownChange.js"/>"></script> --%>
<!-- <script src="https://ajax.googleapis.com/ajax/libs/prototype/1.7.2.0/prototype.js"></script> -->
<script src="<%=request.getContextPath()%>/pages/js/OnDropDownChange.js"></script>
<script src="<%=request.getContextPath()%>/pages/js/common_function.js"></script>
<style type="text/css">
.red-text {
    color: red;
  }
</style>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h1 align="center">
						<spring:message code="loginwelcome" />
					</h1>
					${applicationScope['refDataBean']}
					${applicationScope['firstName']}
					<jsp:include page="common/tab_header.jsp"></jsp:include>
				</div>
				<div class="panel-body">
					<div class="row">${result.user.email} ${refData}</div>
					<c:if test="${not empty message}">
						<div class="row">
							<div class="col-xs-12 col-md-offset-2 col-md-8">
								<div class="alert alert-danger">${message}</div>
							</div>
						</div>
					</c:if>
					<form:form method="POST" action="/documentmaster/school/creds/login" id="userForm"
						modelAttribute="command" class="form-horizontal">
						<div>${a}</div>
						<form:label path="email" class="control-label">email<span class="red">*</span>
						</form:label>
						<div class="form-group">
							<div class="col-sm-7">
								<form:input path="email" class="form-control" required="true" id="email" name="email"
									title="User id must contain 4 to 15 characters" />
								<form:errors path="email" />
								<br>
							</div>
							<br>
						</div>
						<form:label path="password" class="control-label">Password<span class="red">*</span>
						</form:label>
						<div class="form-group">
							<div class="col-sm-7">
								<form:input type="password" path="password" required="true" id="password" name="password"
									title="Password must contain 8 to 15 characters"
									class="form-control" />
								<form:errors path="password" />
								<br>
							</div>
							<br>
						</div>
						<div class="form-group">
							<div class="col-sm-7">
								<form:select path="hint" class="form-control" id="countryDrpDwn" onchange="commonAlert.hello();">
									<form:option value="" label="--- Select ---" />
									<form:options items="${refData['ip_cntry']}" />
								</form:select>
								<form:errors path="hint" cssClass="red-text" element="countryDrpDwn" />
								<br>
							</div>
							<br>
						</div>
						<br>
						<br>
						<br>
						<br>
						
						<table class="table table-striped">
						<thead>
							<tr>
								<th></th>
								<th>ID</th>
								<th>First Name</th>
								<th>Last Name</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${result.students}" var="student" >
								<tr>
									<td><form:radiobutton path="selectedIndex" value="${student.id}" 
									name="studentIndex" onclick="commonFunction.selectedRowIndex(this,{email,password})"/></td>
									<td>${student.id}</td>
									<td>${student.fname}</td>
									<td>${student.lname}</td>
								</tr>
							</c:forEach>
						</tbody>
						</table>	
						
						<div class="form-group">
							<div class="col-sm-offset-4 col-sm-7">
								<button type="submit" class="btn btn-primary">Login</button>
							</div>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>