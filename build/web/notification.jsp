<%-- 
    Document   : notification
    Created on : Jun 29, 2016, 9:25:46 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@ page import="java.sql.*"%>
<%@ page import="java.io.*"%>
<%@ page import="javax.servlet.*,java.text.*" %>
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
           
         Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
             Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                 stmt=conn.createStatement();
                 rs=stmt.executeQuery("SELECT vehicleNo,expireDate FROM vehicle WHERE expireDate<(NOW()+INTERVAL 30 DAY)");
                 //rs=stmt.executeQuery("SELECT DATEDIFF(CURDATE(),expireDate) AS DAYS FROM vehicle");
                 while(rs.next())
                 {
                     String vehicleNo=rs.getString("vehicleNo");
                     out.println(vehicleNo);
                     String expireDate=rs.getString("expireDate");
                     out.println("license is expire in"+expireDate);
                 }
                 //
            %>
            
    </body>
</html>
