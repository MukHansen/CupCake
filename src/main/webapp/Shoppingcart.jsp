<%-- 
    Document   : Shoppingcart
    Created on : 07-03-2019, 21:21:22
    Author     : Christian Ambjørn Kehr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        int trial = integer.parseInt(request.getParmeter("num2"));
        int balance = integer.parseInt(request.getParmeter("num1"));
        
        int k = trial + balance;
        
        out.print(k); 
        %>
    </body>
</html>
