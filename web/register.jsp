<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.07.2019
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>

<center>
    <h4>${message}</h4>
    <form action="register" method="post">
        Email<input name="email" type="email" value="${email}"/><br>
        Password<input name="password" type="password"/><br>
        Repeat password <input name = "repeatedPassword" type="password"/><br>
        <button type="submit">Register</button>
    </form>
</center>


</body>
</html>
