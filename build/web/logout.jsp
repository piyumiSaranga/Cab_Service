<%-- 
    Document   : logout
    Created on : Jun 14, 2016, 10:41:00 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% 
            Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
        
            String userName=(String)session.getAttribute("user");
    if(userName!=null)
        { response.sendRedirect("index.jsp");
           
            session.removeAttribute("user");
             
        }
     else 
         {
        
     }
 
        %>
    </body>
</html>
