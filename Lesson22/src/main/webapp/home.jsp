<%@ page import="domain.Flowers" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div class="card text-center">
    <h5 class="card-header">Flower collection</h5>
    <div class="card-body">
        <form action="/add" method="post">
            Flower: <input type="text" name = "name"> <br><br>
            Color: <input type="text" name = "color"> <br><br>
            <input type="submit" class="btn btn-outline-warning" value="Add">
        </form>
    </div>
</div>


<div class="card text-center text-bg-light">
    <table>
        <thead>
        <tr class="table table-bordered">
            <th class="table-info text-center" ><h5>Название</h5></th>
            <th class="table-info text-center"><h5>Цвет</h5></th>
        </tr>
        </thead>
        <div class="card-body">
            <c:forEach items="${flowers}" var="flower">
                <tbody>
                <tr>
                    <form action='/delete' method='post'>
                        <td class='table-info'><h6>  ${flower.name} </h6></td>
                        <td class='table-info'><h6> ${flower.color} </h6></td>
                        <input type='hidden' name = 'deleteId' value = "${flower.id}" >
                        <td class='table-info'><input type = 'submit' class='btn btn-outline-danger' value = 'Delete'></td>
                    </form>
                </tr>
                </tbody>
            </c:forEach>
        </div>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
