<%@ page import="com.sathya.productapp.ProductDao" %>
<%@page Language="java"  contentType="text/html"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Product List</title>
<!--  BootStrap CDN link to get Support of BootStrap-->
<link rel="stylesheet"
href=""https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css">
</head>

<body>
<table class ="table table-bordered table-striped">
<thead class="thead=dark">
<tr>
<th>Product ID</th>
<th>Product Name</th>
<th>Product Cost</th>
<th>Brand</th>
<th>Made In</th>
<th>Manufacture Date</th>
<th>Expiry Date</th>
<th>Image</th>
</tr>
</thead>

<tbody>
<c:forEach var="product" items></c:forEach>


</tbody>




</table>

</body>
</html>