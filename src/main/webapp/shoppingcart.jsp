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
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
            <h2>Shoppingcart</h2>
            <p>find inspiration her: https://www.w3schools.com/bootstrap/tryit.asp?filename=trybs_table_basic&stacked=h</p>            
            <table class="table">
                <thead>
                    <tr>
                        <th>Name</th>
                        <th>qty</th>
                        <th>Price</th>
                        <th>Total</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                <c:forEach items="${"shoppingcart"}" var="element"> 
                    <tr>    
                        <td>${line.Name}</td>
                        <td>${Line.qty}</td> 
                        <td>${Line.price}</td>
                        <td>${Line.qty * Line.price}</td>

                    </tr>
                </c:forEach>
                <%

                %>



        </div>
    </div>
    
        </table
        </body
        <form action="">
        TotalPrice:<br>
        <input type="text" name="TotalPrice" value ="getTotalPrice" disabled>
        <br>
        <form action="" method="GET">
            <input type="submit" value="Confirm"/>
        </form>
</html>

