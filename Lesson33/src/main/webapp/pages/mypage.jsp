
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spr" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="sf" uri ="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/mypage?lang=en">ENG</a>
<a href="/mypage?lang=ru">RU</a><br>

<spr:message code = "lable.title"/>

<sf:form action = "/mypage" method = "post" modelAttribute="contract">
    <sf:input path="number"/><sf:errors path="number"/><br>
    <sf:input path="name"/><sf:errors path="name"/><br>
    <sf:button>Add</sf:button>
</sf:form>

<ul>
    <c:forEach var="contract" items="${contracts}">
        <li><a>${contract.number} - ${contract.name} </a></li>
    </c:forEach>
</ul>

</body>
</html>
