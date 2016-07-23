<%-- 
    Document   : addDriverImage
    Created on : Jul 12, 2016, 9:19:15 AM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="style.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="addDriverImageServlet" enctype="multipart/form-data">
          <table>
              <tr><td><input type="text" name="driverNic" placeholder="Driver NIC No"></td></tr>
              <tr><td><select id="vehicletype" name="vehicletype">
                   <option value="">Select Vehicle Type</option>
                   <option value="Car">Car</option>
                   <option value="Van">Van</option>
                   <option value="Bus">Bus</option>
               </select></td></tr>
              <tr><td><input type="file" name="driverImage"  placeholder=" Image of the Driver" multiple="multiple"></td></tr>
              
              <tr><td><button type="submit" name="submit">Update Driver Info</button></td></tr>
          </table>
        </form>
    </body>
</html>
