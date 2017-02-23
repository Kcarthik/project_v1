<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="url" value="/addProduct"></c:url>
	<form:form action="${url}" method="post" modelAttribute="product">
	
		<form:hidden path="id" />
		<form:label path="name">Product Name</form:label>
		<form:input path="name" />
		<form:label path="price">Product Price</form:label>
		<form:input path="price" />
		<form:label path="quantity">Product Quantity</form:label>
		<form:input path="quantity" />
		<form:label path="description">Product Description</form:label>
		<form:input path="description"/>
		<input type="submit" value="Add Product">


	</form:form>

</body>
</html>