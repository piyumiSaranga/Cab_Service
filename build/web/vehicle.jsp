<%-- 
    Document   : vehicle
    Created on : May 25, 2016, 5:56:05 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Vehicle Registration</title>
        <link href="style.css" rel="stylesheet" type="text/css" />
        
    </head>
    <body>
        <div align="center">
        <div id="login-form">
            <form id="vehicleRegister" onsubmit="return VehicleSubmitForm()" method="POST" action="vehicleServlet" enctype="multipart/form-data">
   <table align="center" width="50%" border="0">
       <tr>
           <td><input type="text" id="vehicleNo" name="vehicleNo" placeholder="Vehicle Number (**-****)" </td>
       </tr>
       <tr>
           <td><select id="vehicletype" name="vehicletype">
                   <option value="">Select Vehicle Type</option>
                   <option value="Car">Car</option>
                   <option value="Van">Van</option>
                   <option value="Bus">Bus</option>
               </select>
           </td>
       </tr>
       <tr>
           <td><input type="text" id="seats" name="seats" placeholder="No of Seats"</td>
       </tr>
       <tr>
           <td>A/C<input type="radio" id="type" name="type" value="A/C" onchange="showTextField();">Non A/C<input type="radio" id="type" name="type" value="Non A/C" onchange="showTextField();"></td>
       </tr>
       <tr>
           <td><input type="text" id="ACtype" name="ACtype" placeholder="A/C Type"  </td>
       </tr>
       <tr>
           <td><h3>Insurance Details </h3></td>
       </tr>
       <tr>
           <td><input type="date" id="issueDate" name="issueDate" placeholder="Issue Date"></td>
       </tr>
       <tr>
           <td><input type="date" id="expireDate" name="expireDate" placeholder="Expire Date"></td>
       </tr>
       <tr>
           <td><input type="text" id="owner" name="owner" placeholder="Owner's Name"></td>
       </tr>
       <tr>
           <td>Company owned<input type="radio" id="ownership" name="ownership" value="CO">
               OutSourced<input type="radio" id="ownership" name="ownership" value="OS">
           </td>
       </tr>
       <tr>
           <td><input type="text" id="name" name="name" placeholder="Owner Name" onchange="showTextField();"></td>
       </tr>
       <tr>
           <td><input type="text" id="address" name="address" placeholder="Address" onchange="showTextField();"></td>
       </tr>
       <tr>
           <td><input type="text" id="tel" name="tel" placeholder="contact Number" onchange="showTextField();"></td>
           
       </tr>
      
       <tr>
        <td><button type="submit" name="submit">Register</button>
        </td>
    </tr>
   </table>
            </form>
    </body>
</html>
