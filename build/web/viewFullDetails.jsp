<%-- 
    Document   : viewFullDetails
    Created on : Jul 13, 2016, 2:29:56 PM
    Author     : Saranga
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="CSS/displayDriverImage.css">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
             .bootstrap-demo{margin:10px;}
   .card{width:275px; margin:50px; float:left; background-color: #DDD;}
   </style>
    </head>
    <body>
        <%
            ResultSet rs;
            Statement stmt;
           // Class.forName("com.mysql.jdbc.Driver");
            String vehicleId=(String)session.getAttribute("id");
            String vehicleImage1=null;
            out.println(vehicleId);
               // Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
                //stmt=con.createStatement();
                //rs=stmt.executeQuery("SELECT image1,image2,image3 FROM vehicleimages  ");
            /*
                if(rs.next())
                {
                    vehicleImage1=rs.getString("image1");
                    
                }
       
        */
            
        %>
        <sql:setDataSource var="dbconn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/cab" user="root" password=""></sql:setDataSource>
        <sql:query dataSource="${dbconn}" var="result" sql="SELECT image1 FROM vehicleimages where vehiclImageId=?">
            <sql:param value="${id}"/>
            
        </sql:query>
    <td><img src="uploads/<%=vehicleImage1%>" width="115" height="128" /></td>
    </body>
</html>
