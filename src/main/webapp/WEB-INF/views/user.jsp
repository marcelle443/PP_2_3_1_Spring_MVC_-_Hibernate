<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<h2>Список пользователей</h2>


<p><a href="/add">Добавить нового пользователя</a></p>


<table border="1">
    <tr>
        <th>ID</th>
        <th>Имя</th>
        <th>Фамилия</th>
        <th>Email</th>
        <th>Действия</th>
    </tr>
    <c:forEach items="${user}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.firstName}</td>
            <td>${user.lastName}</td>
            <td>${user.email}</td>
            <td>

                <form action="/delete" method="post">
                    <input type="hidden" name="id" value="${user.id}">
                    <button type="submit">Удалить</button>
                </form>


                <form action="/edit" method="get">
                    <input type="hidden" name="id" value="${user.id}">
                    <button type="submit">Изменить</button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>