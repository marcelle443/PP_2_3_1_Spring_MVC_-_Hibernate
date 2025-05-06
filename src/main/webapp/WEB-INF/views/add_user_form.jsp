<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Добавить пользователя</title>
</head>
<body>
<h2>Добавить нового пользователя</h2>

<form action="/add" method="post">
    Имя: <input type="text" name="firstName"><br>
    Фамилия: <input type="text" name="lastName"><br>
    Email: <input type="text" name="email"><br>
    <button type="submit">Сохранить</button>
</form>

<br>
<a href="/">Назад к списку</a>
</body>
</html>