<%@page import="com.akhil.products.ProductDao" import="java.util.Base64"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>List of products</title>

<!-- BootStrap CDN link to get the support of BootStrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>

	<table class="table table-bordered table-striped">
	<thead class="thead-dark">
			<tr>
			<th>PRODUCT ID</th>
			<th>PRODUCT NAME</th>
			<th>PRODUCT PRICE</th>
			<th>PRODUCT BRAND</th>
			<th>PRODUCT MADE IN</th>
			<th>PRODUCT MNFG DATE</th>
			<th>PRODUCT EXP DATE</th>
			<th>PRODUCT IMAGE</th>
			</tr>
	</thead>
	<tbody>
	
	<c:forEach var="product" items="<%=new ProductDao().findAll() %>">
	
		<tr>
		<td>${product.proId}</td>
		<td>${product.proName}</td>
		<td>${product.proPrice}</td>
		<td>${product.proBrand}</td>
		<td>${product.proMadeIn}</td>
		<td>${product.proMnfgDate}</td>
		<td>${product.proExpDate}</td>
	<td>
	<img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}"alt="Product Image" style="max-width:100px; max-height:100px"></td>
	
	</tr>
	
	</c:forEach>
	
	
	
	
	
	</tbody>
	
	</table>

</body>
</html>