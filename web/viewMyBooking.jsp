<%-- 
    Document   : viewMyBooking
    Created on : Sep 14, 2016, 8:32:05 PM
    Author     : Saranga
--%>

<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@page import="java.util.Date" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>View My booking</title>
        <link rel="stylesheet" href="home.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <style>
            .table
        </style>
       <!-- <script type="text/javascript">
window.onload=function(){
    setTimeout(enableIt,5000);
};
function enableIt(){
    document.getElementById('cancel').disabled=true;
    
}
    </script>
-->
<!--
<script type="text/javascript">

var q = new Date();
var m = q.getMonth()+1;
var d = q.getDay();
var y = q.getYear();

var date = new Date(y,m,d);

mydate=new Date('2016-10-11');
console.log(date);
console.log(mydate);

if(date>mydate)
{
    //document.getElementById('cancel').disabled=true;
    alert("greater");
}
else
{
   //document.getElementById('cancel').disabled=true;
   alert("smal");
}


</script>
-->
    </head>
    <body>
         <%
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
            %>
             <div id="header">
		<div id="left">
                    <label>
                    <img src="images/header.png">
                    </label>
                    <label>
                        www.mycitycab.lk <br>
                        071 3 87 90 52
                    </label>
    	</div>
                  <div id="right">
               <div id="content">
                   <label>
                   Follow Us On
                   <br>
                   <img src="images/facebook.png">
                   <img src="images/google.jpg">
                   <img src="images/twitter.jpg">
                   <img src="images/youtube.jpg">

               </label>
                   <br>
                   <% 
                    Date date=new Date();
                    String modifiedDate= new SimpleDateFormat("yyyy-MM-dd").format(date);
                    
                    out.println(modifiedDate);
                    
                   
                   
                  String userName=(String)session.getAttribute("user");
                  String userRole=(String)session.getAttribute("userRole");
                  String nic=(String)session.getAttribute("nic");
                   if(userName!=null)
                   {
                      
                       //out.print("<a href='login.jsp'>Login</a>");
                       out.println("<img src='images/user.jpg'>");
                     out.println("Welcome  "+userName+"  ");
                     out.println(userRole);
                     out.println("                ");
                       out.println(  " <a href='logout.jsp'><button class='btn btn-success' on>Logout</button></a>")     ;

                   }
                   else
                   {
                        out.print("You are not logged in");
                        out.println("                   ");
                        out.print("<button class='btn btn-success' id='clickThis'>Login</button>");
                   }
                   %>
               </div>
               </div>
       </div>
               
               <hr>
         <div id="nav">
	<div id="nav_wrapper">
    	<ul>
        	<li>
            	<a href="index.jsp">Home</a>
            </li>
            <li>
            	<a href="about.jsp">About us</a>
            </li>
            <li>
            	<a href="dispalyDriverImages.jsp">Driver Gallery</a>
            </li>
            <li>
            	<a href="viewvehicles.jsp">Vehicle Gallery</a>
            </li>
            <li>
            	<a href="#">Contact us</a>
            </li>
            <li>
                <%  if(userName!=null){
             if(userRole=="Admin") {
                 out.println("<a href='admin.jsp'>Admin</a>");
                 //out.println("<ul>");
                 //out.println("<li><a href='CusReg.jsp'>Register Customer</a></li>");
                 //out.println("<li><a href='vehicle.jsp'>Register Vehicle</a></li>");
                 //out.println("<li><a href='viewCustomerBooking.jsp'>Customer Bookings</a></li>");
                // out.println("</ul>");
             }
             
             else if(userRole=="Customer")
             {
                 out.println("<a href='#'>Customer</a>");
                 out.println("<ul>");
                 out.println("<li><a href='viewMyBooking.jsp'>View my bookings</a></li>");
                
                 out.println("</ul>");
             }
             else if(userRole=="Driver")
             {
                 out.println("<a href='#'>Driver</a>");
                 out.println("<ul>");
                 out.println("<li><a href='#'>To do Bookings</a></li>");
                 out.println("<li><a href='distance.jsp'>Find the way</a></li>");
                 out.println("</ul>");
             }
             
             }  
          %>
            </li>
        </ul>
        
                </div>
         </div><br><br>
          <div class="container">
       
              <table class="table" >
                  <tr class="danger"><td>Booking ID</td>
                  <td>Check In Date</td>
                  <td>Check Out Date</td>
                  <td>Check In Time</td>
                  <td>Check Out Time</td>
                  <td>Starting Place</td>
                  <td>Ending Place</td>
                  <td>Vehicle Number</td>
                  <td>Driver Number</td>
                  <td>&nbsp;</td></tr>
                  <%
                out.println(userName);
             
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                        stmt=con.createStatement();
                        rs=stmt.executeQuery("SELECT BookId,checkInDate,checkOutDate,checkInTime,checkOutTime,start,end,vehicleId,driverId,bookedTime FROM booking WHERE username='"+userName+"' ");
                           
                        while(rs.next())
                        {
                            int bookId=rs.getInt("BookId");
                           
                            Date inDate=rs.getDate("checkInDate");
                            Date outDate=rs.getDate("checkOutDate");
                            Time inTime=rs.getTime("checkInTime");
                            Time outTime=rs.getTime("checkOutTime");
                            String startPlace=rs.getString("start");
                            String endingPlace=rs.getString("end");
                            int vehicleNo=rs.getInt("vehicleId");
                            int driverNo=rs.getInt("driverId");
                            Date bookedtime=rs.getDate("bookedTime");
                           
                          %>
                  <tr class="success"><td><%=bookId%></td>
                          <td><%=inDate%></td>
                          <td><%=outDate%></td>
                          <td><%=inTime%></td>
                          <td><%=outTime%></td>
                          <td><%=startPlace%></td>
                          <td><%=endingPlace%></td>
                          <td><%=vehicleNo%>"</td>
                          <td><%=driverNo%>"</td>
                         
                        <!--
                          <script>
                             document.write("<td><button type='submit' class='btn btn-primary' id='cancel'  >Cancel Booking</button> </td>");
                          
                          </script>
                          -->
                   <%      
                    String modifiedDateDB= new SimpleDateFormat("yyyy-MM-dd").format(bookedtime);
                    
               out.println(modifiedDateDB);
                   if(modifiedDate.equals(modifiedDateDB))
                   {   out.println("<form  method='POST' action='cancelBooking' >");
                       out.println("<td><button type='submit' class='btn btn-primary' id='cancel'  >Cancel Booking</button> </td>");
                       out.println("</form>");
                   }
                   else
                   {
                      out.println("<td><button type='submit' class='btn btn-primary' id='cancel' disabled='' >Cancel Booking</button> </td>"); 
                   }
                        }
                
                %>
                
                          
              </div>
            
        </table>
    </body>
</html>
