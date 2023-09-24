<%@ page import="domain.Flowers" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
            <%
                Object flowersObj = request.getAttribute("flowers");
                if (flowersObj != null){
                    List<Flowers> flowers = (List<Flowers>) request.getAttribute("flowers");
                    for (Flowers flower : flowers){
                        out.print("<tbody>");
                        out.print("<tr>");
                        out.print("<form action='/delete' method='post'>");
                        out.print("<td class='table-info'>" + "<h6>" + flower.getName() + "</h6>" + "</td>");
                        out.print("<td class='table-info'>" + "<h6>" +  flower.getColor() + "</h6>" + "</td>");
                        out.print("<input type='hidden' name = 'deleteId' value = '" + flower.getId() + "' >");
                        out.print("<td class='table-info'><input type = 'submit' class='btn btn-outline-danger' value = 'Delete'></td>");
                        out.print("</form>");
                        out.print("</tr>");
                        out.print("</tbody>");
                    }
                }
            %>
        </div>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>
