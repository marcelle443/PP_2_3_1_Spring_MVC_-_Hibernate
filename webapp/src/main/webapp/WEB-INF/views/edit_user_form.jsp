<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Редактировать пользователя</title>
</head>
<body>
<h2>Редактировать пользователя</h2>

<form action="/update" method="post">
    <input type="hidden" name="id" value="${user.id}">
    Имя: <input type="text" name="firstName" value="${user.firstName}"><br>
    Фамилия: <input type="text" name="lastName" value="${user.lastName}"><br>
    Email: <input type="text" name="email" value="${user.email}"><br>
    <button type="submit">Сохранить изменения</button>
</form>

<br>
<a href="/">Назад к списку</a>
</body>
</html>