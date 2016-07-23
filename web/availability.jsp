<%-- 
    Document   : availability
    Created on : Jul 14, 2016, 5:47:05 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String DateIn=(String)session.getAttribute("checkdateIn");
        String DateOut=(String)session.getAttribute("checkdateOut");
        int driverId=(int)session.getAttribute("driverId");
        int vehicleId=(int)session.getAttribute("vehicleId");
        
        Connection conn;
        Statement stmt;
        ResultSet rs;
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
        stmt=con.createStatement(); 
        rs=stmt.executeQuery("SELECT ");
         %>
    </body>
</html>
