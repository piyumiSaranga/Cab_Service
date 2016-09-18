<%-- 
    Document   : customerbookingview
    Created on : Jun 28, 2016, 11:09:41 AM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="java.sql.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html >
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        

        <title>JSP Page</title>
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </head>
    <body>
        <div class="container">
       
            <table class="table table-hover" >
            <tr><th>Customer FirstName </th> <th>Customer LastName </th><th>Address Street1 </th><th>Address Street2 </th><th>Address City </th><th>Mobile Number</th><th>Driver Firstname </th> <th>Driver Lastname </th><th>Driver Mobile Number </th><th>Vehicle Number </th></tr>
      <%
         
        String dateIn=(String)session.getAttribute("dateIn");
        
        String dateOut=(String)session.getAttribute("dateOut");
       

        javax.servlet.http.HttpServletResponse res=null;;
   
        Connection conn;
        Statement stmt;
        ResultSet rs;
        Connection con;
      
         Class.forName("com.mysql.jdbc.Driver");
         con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
         stmt=con.createStatement();
         //rs=stmt.executeQuery("SELECT customer.fname,customer.lname,customer.street1,customer.street2,customer.city,customer.mobileNo,driver.firstName,driver.lastName,driver.tel FROM booking  INNER JOIN customer ON customer.username=booking.username INNER JOIN driver ON driver.Id=booking.driverId WHERE checkInDate BETWEEN '"+dateIn+"' AND '"+dateOut+"'");
         rs=stmt.executeQuery("SELECT customer.fname,customer.lname,customer.street1,customer.street2,customer.city,customer.mobileNo,driver.firstName,driver.lastName,driver.tel,vehicle.vehicleNo FROM booking INNER JOIN customer ON customer.username=booking.username INNER JOIN driver ON driver.Id=booking.driverId INNER JOIN vehicle ON vehicle.Id=booking.vehicleId WHERE checkInDate BETWEEN '"+dateIn+"' AND '"+dateOut+"'");
  while(rs.next())
      
  {
      //String username=rs.getString("username");
      
      String FirstName=rs.getString("fname");
     
    
       String LastName=rs.getString("lname");
    
      String street1=rs.getString("street1");
      
      String street2=rs.getString("street2");
      
      String city=rs.getString("city");
    
      int mobileNo=rs.getInt("mobileNo");
     
      String driverfName=rs.getString("firstName");
   
      String driverlName=rs.getString("lastName");
  
     int tel=rs.getInt("tel");
     
      String vehicleNo=rs.getString("vehicleNo");

     %>
            
            <tr>
                <td><%=FirstName%></td>
                <td><%=LastName%></td>
                <td><%=street1%></td> 
                <td><%=street2%></td> 
                <td><%=city%></td> 
                <td><%=mobileNo%></td> 
                <td><%=driverfName%></td> 
                <td><%=driverlName%></td> 
                <td><%=tel%></td> 
                <td><%=vehicleNo%></td>
 
 
 <%
  }
                    
   %>
   </div>
            
        </table>
    </body>
</html>
