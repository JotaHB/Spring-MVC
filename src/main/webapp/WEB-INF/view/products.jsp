<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="productList" method="GET">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br>
        
        <label for="name">Nombre:</label>
        <input type="text" id="name" name="name"><br>
        
        <label for="description">Descripción:</label>
        <input type="text" id="description" name="description"><br>
        
        <label for="price">Precio:</label>
        <input type="text" id="price" name="price"><br>
        
        <input type="submit" value="Add to Cart">
    </form>
</body>
</html>