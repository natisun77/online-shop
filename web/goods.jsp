<%@ page import="model.User" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Good" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 25.07.2019
  Time: 15:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All goods</title>
</head>
<body>

<%
    PrintWriter printWriter = response.getWriter();
    printWriter.write("<center>");
    printWriter.write("<h2> Список товаров </h2>");
    printWriter.write("<table border=\"1\">\n" +
            "    <tr>\n" +
            "        <th>Name</th>\n" +
            "        <th>Description</th>\n" +
            "         <th>Price</th>\n" +
            "    </tr>");
    List<Good> allGoods = (List<Good>) request.getAttribute("allGoods");
    for (Good good : allGoods) {
        printWriter.write("<tr>");
        printWriter.write("<td>" + good.getName() + "</td>");
        printWriter.write("<td>" + good.getDescription() + "</td>");
        printWriter.write("<td>" + good.getPrice() + "</td>");
        printWriter.write("</tr>");
    }
    printWriter.write("</table>");
    printWriter.write("</br>");
    printWriter.write("<a href=\"add-good.jsp\">Добавить товар</a>");
    printWriter.write("</center>");

%>

</body>
</html>
