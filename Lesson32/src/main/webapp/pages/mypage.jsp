
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
    <style>
    .rounded {
    counter-reset: li;
    list-style: none;
    font: 14px "Trebuchet MS", "Lucida Sans";
    padding: 0;
    text-shadow: 0 1px 0 rgba(255,255,255,.5);}
    .rounded a {
        position: relative;
        display: block;
        padding: .4em .4em .4em 2em;
        margin: .5em 0;
        background: #DAD2CA;
        color: #444;
        text-decoration: none;
        border-radius: .3em;
        transition: .3s ease-out;
    }
    .rounded a:hover {background: #E9E4E0;}
    .rounded a:hover:before {transform: rotate(360deg);}
    .rounded a:before {
        content: counter(li);
        counter-increment: li;
        position: absolute;
        left: -1.3em;
        top: 50%;
        margin-top: -1.3em;
        background: #8FD4C1;
        height: 2em;
        width: 2em;
        line-height: 2em;
        border: .3em solid white;
        text-align: center;
        font-weight: bold;
        border-radius: 2em;
        transition: all .3s ease-out;
    }
    </style>
</head>
<body>
<a href="/mypage?lang=en">ENG</a>
<a href="/mypage?lang=ru">RU</a><br>

<spr:message code = "lable.title"/>

<form action = "/mypage" method = "post">
    <input type = "number" name = "number" placeholder="number of contract">${numberError}<br>
    <input type = "text" name = "name" placeholder="name of contract">${nameError}<br>
    <input type = "submit" value="Add">
</form>

<ul class = "rounded">
    <c:forEach var="contract" items="${contracts}">
        <li><a>${contract.number} - ${contract.name} </a></li>
    </c:forEach>
</ul>
</body>
</html>
