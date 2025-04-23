<%--
  Created by IntelliJ IDEA.
  User: Khanh Nguyen
  Date: 4/23/2025
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
    <h1>Register Form</h1>
    <form action="register" method="post" modelAttribute="user">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="age">Tuổi:</label>
        <input type="text" id="age" name="age" required><br><br>
        <input type="submit" value="Đăng ký">

    </form>
</body>
</html>
