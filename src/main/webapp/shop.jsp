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
<%@page import="data.Line"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" />
        <title>Shop</title>
    </head>
    <body>
        <h2>Welcome <% out.print("John " + request.getAttribute("username")); %></h2><h3>Balance = <% out.print(request.getAttribute("userBalance")); %></h3>
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
                h2 {
                    text-align: center;
                }
                h3{
                    text-align: right;
                }
                table, th, td {
                    border: 1px solid black;
                }
                th {
                    color: black;
                }
                table {
                    width: 25%;
                }

                th {
                    height: 50px;
                }
                .radiotext {
                    margin: 10px 10px 0px 0px;
                }
                .button {
                    background-color: #4CAF50; /* Green */
                    border-radius: 20px;
                    color: black;
                    padding: 16px 32px;
                    text-align: center;
                    text-decoration: none;
                    display: inline-block;
                    font-size: 16px;
                    margin: 4px 2px;
                    transition-duration: 0.4s;
                    cursor: pointer;
                }
            </style>
            <li><a href="shoppingcart.jsp" action="<% %>">Shoppingcart</a></li>
        </ul>
        <table class="table table-striped">

            <thead><tr><th>Cupcake name</th><th>Price</th><th>Qantity</th></tr></thead> <tbody>
                        <% List<CompleteCupCake> cupCakes = (List<CompleteCupCake>) request.getAttribute("mytable");
                            for (CompleteCupCake cupcake : cupCakes) {
                        %>

                <tr>
                    <td><%= cupcake.getName()%></td><td><%= cupcake.getPrice()%></td><td><input></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
                <h3><button class="button button1" action="<%-- request.setAttribute("order", shoppingcartContent); --%>">Submit</button></h3>
            <%-- 
            if (%> input   <% != 0){
                
            }
                --%>
                
                
                
        <%--  <% List<CompleteCupCake> cupCakes = (List<CompleteCupCake>) request.getAttribute("mytable"); 
          %>
          <select class="dropddown">
              <option value="mytable">Choose CupCake</option>
              <% for (CompleteCupCake cupCake : cupCakes) {%>

            <option value="cupcakes"><%= cupCake.getName() + " " + cupCake.getPrice()%></option>
            <% }%>
        </select>
        <form action="" method="GET">
            <input type="numbers" name="Quantity"/>
            <input type="submit" value="Accept"/>
        </form> --%>
    </body>
</html>
