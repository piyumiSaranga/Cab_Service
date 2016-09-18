<%-- 
    Document   : vehicleReserv
    Created on : May 27, 2016, 5:15:38 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vehicle Reservation</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
        <link href="http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/jquery.ui.timepicker.addon/1.4.5/jquery-ui-timepicker-addon.min.css" rel="stylesheet">
        <script src="http://code.jquery.com/jquery-1.10.2.js"></script>
        <script src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-timepicker-addon/1.4.5/jquery-ui-timepicker-addon.min.js"></script>
      <script>
        
         /*$(function() {
            $( "#checkInTime" ).timepicker();
         });
         $(function() {
            $( "#checkOutTime" ).timepicker();
         });*/
      </script>
    </head>
    <body>
        <div align="center">
             <div id="login-form">
        <form method="POST" action="vehicleReservServlet">
               <table align="center" width="50%" border="0">
<!--
            <tr>
                <td><input type="text" id="firstName" name="firstName" required="required" placeholder="First Name"></td>
            </tr>
            <tr>
                <td><input type="text" id="lastName" name="lastName" required="required" placeholder="Last Name"></td>
            </tr>
            <tr>
                <td><input type="text" id="address" name="address" required="required" placeholder="Address"></td>
            </tr>
            <tr>
                <td><input type="tel" id="tel" name="tel" required="required" placeholder="Mobile Phone"></td>
            </tr>

-->
             <tr>
                <td><input type="text" id="username" name="username"  placeholder="Username"></td>
            </tr>
            
            <tr>
                <td><input type="date" id="checkIn" name="checkIn"  placeholder="Check In Date"></td>
            </tr>
            
             <tr>
                 <td><input type="date" id="checkOut" name="checkOut"  placeholder="Check Out Date"></td>
            </tr>
           
             <tr>
                 <td><input type="time" id="checkInTime" name="checkInTime"  placeholder="Check In Time"></td>
            </tr>
            <tr>
                <td><input type="time" id="checkOutTime" name="checkOutTime"  placeholder="Check Out Time"></td>
            </tr>
             
              <tr>
                <td><input type="text" id="startingPlace" name="startingPlace"  placeholder="From"></td>
            </tr>
            <tr>
                <td><input type="text" id="endingPlace" name="endingPlace"  placeholder="Destination"></td>
            </tr>
            
            
             <tr>
                 <td><input type="text" id="vehicle" name="vehicle" value=""  placeholder="Enter Vehicle Id"></td>    
            </tr>
            
            <tr>
                 <td><input type="text" id="driver" name="driver" value=""  placeholder="Enter Driver Id"></td>    
            </tr>
             <tr><td><button type="submit" id="submit" name="availability" value="availability"></button></td></tr>
            <tr>
                <td>
                    <a href="availability.jsp" >Click here</a>
                </td>
            </tr>
            <tr><td><button type="submit" id="submit" name="booking" value="booking">Reserve Vehicle</button></td></tr>
               </table>
        </form>
             </div>
        </div>
    </body>
</html>
