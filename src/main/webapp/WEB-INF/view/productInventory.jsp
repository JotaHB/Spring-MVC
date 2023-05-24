<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Product Inventory</title>
</head>
<body>
    <h1>Product Inventory</h1>
    <ul>
        <c:forEach var="product" items="${productInventory}">
            <li><a href="addToCart?id=${product.id}">
                ${product.name}<br>
                Precio: ${product.price}<br>
                <br>
            </a></li>
        </c:forEach>
    </ul>
</body>
</html>
