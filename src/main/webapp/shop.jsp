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
                    margin: 0;
                    padding: 0;
                    width: 150px;
                    background-color: #33ff33;
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
            <li><a href="shoppingcart.jsp">Shoppingcart</a></li>
        </ul>
        <label style="margin-right: 150;">CupCakes</label>
        <select class="form-control" style="width: 250;">
            <option value="-1">Choose CupCake
            <%
                request.getAttribute("mytable");
                
            %>
            </option>
        </select>
        <label>Quantity</label>



        <table>

                        <%--
            <thead><tr><th>name</th><th>price</th></tr></thead>
                            request.getAttribute("mytable");
                            ArrayList<CompleteCupCake> Cakes = (ArrayList<CompleteCupCake>) request.getAttribute("mytable");
                            for (int i = 0; i < Cakes.size(); i++) {

                        %>
            <tbody><tr>
                    <td><%= Cakes.get(i).getName()%></td><td><%= Cakes.get(i).getPrice()%></td>
                </tr></tbody>
                <%
                    }
                        --%>
        </table>
    </body>
</html>
