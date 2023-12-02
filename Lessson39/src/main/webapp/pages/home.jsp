<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>First</title>
</head>
<body>
hi
<form action="/save" method = "post" modelAttribute="film">
    <input type="text" name = "name" placeholder="filmName"><br>
    <input type="text" name = "genre" placeholder="genre"><br>
    <input type="date" name = "dateOfIssue" placeholder="date"><br>
    <input type="number" name = "rating" placeholder="rating"><br>
    <input type="submit" value="save">
</form>

${film.name}
<hr>
<ul>
    <c:forEach items="${films}" var="film">
        <li>${film.name}</li>
    </c:forEach>
</ul>


</body>
</html>
