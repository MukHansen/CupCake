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
            String name = (String) request.getAttribute("name");
            if (name != null) {
                out.print(name);
            }
            String pass = (String) request.getAttribute("password");
            if (pass != null) {
                out.print(pass);
            }
        %>  

    </body>
</html>