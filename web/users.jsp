<%@ page import="model.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.07.2019
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All users</title>
</head>
<body>

<%
    PrintWriter printWriter = response.getWriter();
    printWriter.write("<center>");
    printWriter.write("<h2> Список пользователей </h2>");
    printWriter.write("<table border=\"1\">\n" +
            "    <tr>\n" +
            "        <th>Email</th>\n" +
            "        <th>Password</th>\n" +
            "    </tr>");
    List<User> allUsers = (List<User>) request.getAttribute("allUsers");
    for (User user : allUsers) {
        printWriter.write("<tr>");
        printWriter.write("<td>" + user.getEmail() + "</td>");
        printWriter.write("<td>" + user.getPassword() + "</td>");
        printWriter.write("</tr>");
    }
    printWriter.write("</table>");
    printWriter.write("</br>");

    printWriter.write("<a href=\"register.jsp\">Регистрация</a>");
    printWriter.write("</center>");
%>


</body>
</html>
