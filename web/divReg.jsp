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
        <!--<link rel="stylesheet" href="CSS/displayDriverImage.css">-->
        <link rel="stylesheet" href="home.css" type="text/css" />
        <script src="newjavascript.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <style>
             
            .card{width:600px;float:right; background-color: #DDD;}
            .col-xs-2{width:440px;}
        </style>
    </head>
    
    <body>
          
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
             </ul>
        
                </div>
         </div>
        <hr>
        <div id="topic">
    Create your Account here
        </div>

<!--
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
   
    <tr>
      <td>Picture</td>
      <td><input type="file" id="image" name=image"/></td>
    </tr>
    
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
        -->
         <table>
            <tr><td>&nbsp;</td>
                <td>
        <div id="login-form" class="mainbox col-md-6 col-md-offset-1 col-sm-3 col-sm-offset-2">
<form  name="registration1" onsubmit="return submitForm()" method="POST" action="driverServlet" enctype="multipart/form-data">
  <div class="form-group row">
      <label for="example-text-input" class="col-xs-2 col-form-label">First Name</label>
  
  <div class="col-xs-8">
    
      <input class="form-control" type="text"  id="fName" name="firstName" required="">
  </div>
</div>
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Last Name</label>
  <div class="col-xs-8">
      <input class="form-control" type="text" id="lName" name="lName" required="" >
  </div>
</div>
 <div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Date of Birth</label>
  <div class="col-xs-8">
      <input class="form-control" type="date" id="dob" name="dob" required="">
  </div>
</div>  
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">NIC Number</label>
  <div class="col-xs-8">
      <input class="form-control" type="text" id="nic" name="nic" required="">
  </div>
</div>  
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Mobile No</label>
  <div class="col-xs-8">
      <input class="form-control" type="text"  id="tel" name="tel" required="">
  </div>
</div>  
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Address</label>
  <div class="col-xs-8">
      <input class="form-control" type="tel"  id="address" name="address" required="">
  </div>
</div> 
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">License Number</label>
  <div class="col-xs-8">
      <input class="form-control" type="tel"  id="license" name="license" required="">
  </div>
</div>
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Username</label>
  <div class="col-xs-8">
      <input class="form-control" type="text"  id="username" name="username" required="">
  </div>
</div> 
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Email</label>
  <div class="col-xs-8">
      <input class="form-control" type="email"  id="email"  name="email" required="">
  </div>
</div>
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Password</label>
  <div class="col-xs-8">
      <input class="form-control" type="password"  id="password" onPaste="return false" name="password"  onclick="ValidatePassword();" required="">
      <small id="passwordHelpInline" class="text-muted">
      Must be 1-8 characters long.
    </small>
  </div>
</div>
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label">Re-password</label>
  <div class="col-xs-8">
      <input class="form-control" type="password" id="rePassword" onPaste="return false" name="rePassword" placeholder="Re-Password" required="">
  </div>
</div>
<div class="form-group row">
  <label for="example-text-input" class="col-xs-2 col-form-label"></label>
  <div class="col-xs-2">
      <button type="submit" class="btn btn-primary" >SIGN ME UP</button>
      <a href="loginDriver.jsp"><button type="button" class="btn btn-link"  ><h3>Sign In Here</h3></button></a>
  </div>
</div>    
 </form>
        </div>   
                </td></tr></table>
    </body>
    
</html>
