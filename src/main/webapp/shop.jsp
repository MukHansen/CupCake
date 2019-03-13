<%-- 
    Document   : newjspshop
    Created on : 06-03-2019, 12:12:12
    Author     : Mkhansen
--%>

<%@page import="logic.LogicFacade"%>
<%@page import="presentation.FrontController"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.CompleteCupCake"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- private FrontController front;--%>
<%--private LogicFacade logic;--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shop</title>
    </head>
    <body>
        <ul>
            <style>
                ul {
                    border-radius: 20px;
                    margin: 5;
                    padding: 0;
                    width: 150px;
                    background-color: #4CAF50;
                }
                li a {
                    text-align: center;
                    display: block;
                    color: #000;
                    padding: 8px 16px;
                    text-decoration: white;
                }
                li a:hover:not(.active) {
                    border-radius: 20px;
                    background-color: black;
                    color: white;
                }
            </style>
            <h2>Welcome <% out.print(request.getAttribute("username")); %></h2>
            <li><a href="shoppingcart.jsp">Shoppingcart</a></li>
        </ul>
        <label style="margin: 150;">CupCakes</label>
        <% List<CompleteCupCake> cupCakes = (List<CompleteCupCake>)request.getAttribute("mytable");
                %>
        <select class="dropddown" style="width: 250;">
            <option value="mytable">Choose CupCake</option>
            <% for (CompleteCupCake cupCake : cupCakes){ %>
                
            <option value="cupcakes"><%= cupCake.getName() + " " + cupCake.getPrice() %></option>
            <% } %>
        </select>
            <form action="" method="GET">
                <input type="numbers" name="Quantity"/>
                <input type="submit" value="Accept"/>
            </form>
    </body>
</html>
