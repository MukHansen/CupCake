<%-- 
    Document   : newjspshop
    Created on : 06-03-2019, 12:12:12
    Author     : Mkhansen
--%>

<%@page import="data.CompleteCupCake"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <table>

            <thead><tr><th>name</th><th>age</th><th>address</th></tr></thead>
                        <% List<CompleteCupCake> Cakes = (List<CompleteCupCake>) request.getAttribute("mytable");
                            for (CompleteCupCake c : Cakes) {
                        %>
            <tbody><tr>
                    <td><%= c.getName()%></td><td><%= c.getPrice()%></td>
                </tr></tbody>
                <%
                    }
                %>
        </table>
    </body>
</html>
