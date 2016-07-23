<%-- 
    Document   : checkBooking
    Created on : Jun 28, 2016, 7:34:31 AM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
        <link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/jquery.ui.timepicker.addon/1.4.5/jquery-ui-timepicker-addon.min.css" rel="stylesheet">
        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-timepicker-addon/1.4.5/jquery-ui-timepicker-addon.min.js"></script>
        
    </head>
    <body>
        <div align="center">
             <div id="login-form">
        <form method="POST" action="checkBookingServlet">
               <table align="center" width="50%" border="0">
        <tr>
                <td><input type="date" id="checkIn" name="checkIn" required="required" placeholder="Check In Date"></td>
            </tr>
            
             <tr>
                <td><input type="date" id="checkOut" name="checkOut" required="required" placeholder="Check Out Date"></td>
            </tr>
            <tr><td><button type="submit" id="submit" name="submit" value="">Check Booking</button></td></tr>
               </table>
        </form>
             </div>
        </div>
        
        <%
            /*
             Connection con;
       String checkInDate=request.getParameter("checkIn");
         String   checkOutDate=request.getParameter("checkOut");
         Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                Statement stmt=con.createStatement();
         
        ResultSet rs=stmt.executeQuery("SELECT username FROM booking WHERE checkInDate BETWEEN '"+checkInDate+"' AND '"+checkOutDate+"'");
  while(rs.next())
  {
      String Username=rs.getString("username");
      out.println(Username);
      //String EmployeeName=rs.getString("empname");
     // int Salary=rs.getInt("sal");
  }*/
                    %>
                    
          </body>
    
</html>
