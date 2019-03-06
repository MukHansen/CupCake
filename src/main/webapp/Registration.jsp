<%-- 
    Document   : Registration
    Created on : 06-03-2019, 09:30:11
    Author     : Slantefar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String user = request.getParameter("name");
            String pass = request.getParameter("password");
            
            out.println(user);
            out.println(pass);
        
        %>
        
    </body>
</html>
