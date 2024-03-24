<%@page import="com.sathya.product.ProductDao" import="java.util.Base64"%>
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
<div>
<h1 class=" text text-success text-center">List of Available Products..</h1>
</div>

<div>
<a class="btn btn-success" href="add-product.html">Save product
</a>
</div>

<div>
<input type="text" placeholder="search">
</div>

<div>
      <c:if test="${saveResult==1}">
      <h1 class="text-danger text-center">Data inserted Successfully...</h1>
</c:if>
</div>


<div>
 <c:if test="${deleteResult==1}">
      <h1 class="text-danger text-center">Data deleted successfully...</h1>
</c:if>
</div>
     



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
			<th> Audio</th>
			<th>video</th>
			<th>ACTIONS </th>
			</tr>
	</thead>
	<tbody>
	
	<c:forEach var="product" items= "<%=new ProductDao().findAll() %>">
	
	<tr>
		<td>${product.proId}</td>
		<td>${product.proName}</td>
		<td>${product.proPrice}</td>
		<td>${product.proBrand}</td>
		<td>${product.proMadeIn}</td>
		<td>${product.proMnfgDate}</td>
		<td>${product.proExpDate}</td>
	<td>
		<img src="data:image/jpeg;base64,${Base64.getEncoder().encodeToString(product.proImage)}"alt="Product Image" style="max-width:100px; max-height:100px">
	</td>
	
	 <td>
				    <audio controls>
				   		 <source src="data:audio/mp3;base64,${Base64.getEncoder().encodeToString(product.proAudio)}" type="audio/mp3">
				    </audio>
	 </td>

	
	 <td>
				    <video controls width="200" height="200">
				    	<source src="data:video/mp4;base64,${Base64.getEncoder().encodeToString(product.proVideo)}" type="video/mp4">
				    </video>
	 </td>
		<td> 
			<a class="btn btn-primary" href="./DeleteProductservlet?proId=${product.proId}"> DELETE </a>
			<a class="btn btn-primary" href="./EditProductservlet?proId=${product.proId}"> EDIT </a>
		</td>
	</tr>
	
	</c:forEach>
	
	</tbody>
	
	</table>

</body>
</html>