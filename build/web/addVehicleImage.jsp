<%-- 
    Document   : addVehicleImage
    Created on : Jul 11, 2016, 10:11:08 AM
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
      <form method="POST" action="addVehicleImageServlet" enctype="multipart/form-data">
          <table>
              <tr><td><input type="text" name="vehicleNumber" placeholder="Vehicle Number"></td></tr>
              <tr><td><input type="file" name="image1" id="file" placeholder="Full Image of the Vehicle" ></td></tr>
              <tr><td><input type="file" name="image2"  placeholder="Part Image of the Vehicle"></td></tr>
              <tr><td><input type="file" name="image3"  placeholder="Part Image of the Vehicle"></td></tr>
              <tr><td><input type="file" name="image4"  placeholder="Part Image of the Vehicle"></td></tr>-->
              <tr><td><button type="submit" name="submit">Sign Me Up</button></td></tr>
          </table>
        </form>
    </body>
</html>
