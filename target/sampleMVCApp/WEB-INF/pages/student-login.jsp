<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<title>Student registration page </title>
</head>
<body>
	Student
	<form:form action="/student" method="POST" modelAttribute="student">
		Student Name: <form:input path="name"/><br>
		<form:errors path="name" cssStyle="color:red"></form:errors>
		Submit: <form:button type="submit">Submit</form:button>
	</form:form>
	
</body>
</html>