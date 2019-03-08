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
        <form action="MyServlet" method="GET">
                <input type="text" name="username"/>
                <input type="text" name="password"/>
                <input type="submit" value="gå til server"/>
            </form>
            <table class="table table-striped">

                <thead><tr><th>name</th><th>qty</th><th>price</th></tr></thead> <tbody>
                            //skal muligvisvære lines i shopping cart
                                <% List<shoppingcart> ShoppingCart = (List<ShoppingCart>) request.getAttribute("mytable");
                                for (Line line : Line) {
                            %>

                    <tr>
                        // skal muligvis være shoppingcart
                        <td><%= line.getName()%></td><td><%= line.qty()%></td><td><%= line.getPrice()%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        
    </body>
</html>
