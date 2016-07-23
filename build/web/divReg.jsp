<%-- 
    Document   : divReg
    Created on : May 21, 2016, 11:28:39 AM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Driver Registration</title>
       <link href="style.css" rel="stylesheet" type="text/css" />
       
    </head
    
    <body>
          
        <div align="center">
        <div id="login-form">


<form id="registration1" onsubmit="return driversubmitForm()" method="POST" action="driverServlet">
    
    
   <table align="center" width="50%" border="0">
   <tr>
       <td><input type="text" id="fName" name="firstName" placeholder="First name"  /></td>
    </tr>

    <tr>
        <td><input type="text" id="lName" name="lName" placeholder="Last Name" /></td>
    </tr>
   
    <tr>
        <td><input type="text" id="dob" name="dob" placeholder="Date of birth" /></td>
    </tr>
    <tr>
        <td><input type="text" id="nic" name="nic" placeholder="NIC" /></td>
    </tr>
    <tr>
        <td><input type="text" id="tel" name="tel" placeholder="Mobile Number" /></td>
    </tr>
    
    <tr>
        <td><input type="text" id="address" name="address" placeholder="Address"  /></td>
    </tr>
    
    <tr>
        <td><input type="text" id="license" name="license" placeholder="Driving License" /></td>
    </tr>
    
    <tr>
        <td><input type="text" id="username" name="username" placeholder="User Name"  /></td>
    </tr>
    
    <tr>
        <td><input type="email" id="email"  name="email" placeholder="Email"  /></td>
    </tr>
    
    <tr>
        <td><input type="password" id="password" onPaste="return false" name="password" placeholder="Password"  /></td>
    </tr>
    <tr>
      <td><input type="password" id="rePassword" onPaste="return false" name="rePassword" placeholder="Re-Password" /></td>
    </tr> 
    <!--
    <tr>
      <td>Picture</td>
      <td><input type="file" id="image" name=image"/></td>
    </tr>
    -->
    <tr>
        <td><button type="submit" name="submit">Sign Me Up</button>
        </td>
    </tr>
    <tr>
        <td><a href="loginDriver.jsp">Sign In Here</a>
        </td>
    </tr>
  </table>
</form>
</div>
        </div>
        
    </body>
    
</html>
