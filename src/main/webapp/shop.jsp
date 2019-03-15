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
                    background-color: #4CAF50;
                    border-radius: 20px;
                    color: black;
                    padding: 16px 32px;
                    text-align: center;
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
                        <% ArrayList<Line> sc = new ArrayList<>(); %>
                        <% List<CompleteCupCake> cupCakes = (List<CompleteCupCake>) request.getAttribute("mytable");
                            for (int i = 0; i < cupCakes.size(); i++) {
                        %>

                <tr>
                    <td><%= cupCakes.get(i).getName()%></td><td><%= cupCakes.get(i).getPrice()%></td><td><input type="number" min="0" value="0" ></td>
                </tr>
                <%
                    }
                %>
            <h3><button class="button button1" action="<%  %>">Submit and go to shoppingcart</button></h3>
        </tbody>
    </table>
            <form action="<%  %>" method="POST">
        <input type="hidden" name="username" value="<%= sc%>" />
        <input id="button1" type="submit" value="Submit" >
    </form>
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
