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
    <title>Add good</title>
</head>
<body>

<center>
    <h4>${message}</h4>
    <form action="/good" method="post">
        Name<input name="name" type="text"/><br>
        Description<input name="description" type="text"/><br>
        Price <input name="price" type="number"/><br>
        <button type="submit">Add good</button>
    </form>
</center>


</body>
</html>
