
<%-- 
    Document   : index
    Created on : Jun 9, 2016, 4:54:52 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="home.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
         <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>

        <script>
            
$(function(){
 $('#up').cycle({ 
    fx:    'fade', 
    speed:  3000 
 });
 
 });
  $(document).ready(function (){
            $("#clickThis").click(function (){
                $('html, body').animate({
                    scrollTop: $("#div1").offset().top
                }, 1000);
            });
        });
         $(document).ready(function (){
            $("#clickThis").click(function (){
                $('html, body').animate({
                    scrollTop: $("#div2").offset().top
                }, 1000);
            });
        });

        </script>
        <style type="text/css">
/*bottem*/
#botbar{
	width:100%;
	height:150px;
	position:absolute;
	top:1400px;
	left:0px;
	z-index:0;
}

.bot{
	position:absolute;
	top:1420px;
	}

#set1{
	position:absolute;
	top:1420px;
	left:225px;
	width:300px;
	z-index:2;
	}
	
#set2{
	position:absolute;
	top:1420px;
	left:550px;
	width:300px;
	z-index:2
	}
	
#set3{
	position:absolute;
	top:1420px;
	left:875px;
	width:300px;
	z-index:2
	}

.sethead{
	font-family:Verdana, Geneva, sans-serif;
	font-size:12pt;
	color:#FFF;
	}

.pbody{
	font-family:Verdana, Geneva, sans-serif;
	font-size:10pt;
	color:#999;
	}
	
.list2{
	font-family:Verdana, Geneva, sans-serif;
	font-size:10pt;
	color:#999;
	}
/*line*/
#sep{
	position: absolute;
	top:634px;
	left:180px;
	height:4px;
	}
		
#sep1{
	position: absolute;
	top:910px;
	left:180px;
	height:4px;
	}

  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 15%;
      margin: auto;
  }
  		
 
</style>

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
        <center>
            
<div id="up">
   
    <img src="images/image1.jpg" width="1350" height="400"/>
    <img src="images/image2.jpg" width="1350" height="400"/>
    <img src="images/image3.jpg" width="1350" height="400"/>
</div>	
        </center>

    <br>

    <div id="how-title">
               <h3 id="how-it-works">
    		
               Why  use our service
               </h3>
               
    	</div>
    <center>
    <table><tr><td>
<div class="banner">
    <div class="banner_title">
        <img src="images/icon1.png">
        <div>Fast &</div>
        <div class="color1">Safe</div>
        <h5>QCabs offers the fastest, most convenient taxi service in Sri Lanka. With rigorous safety standards, and a computerized dispatch system, we promise complete customer satisfaction with each and every ride.
            QCabs response time is twice as fast as companies around.</h5>
        <a href="about.jsp"><img src="images/tableicon.png"></a>
    </div>
</div></td><td>&nbsp;</td><td>&nbsp;</td>
<td>
    <div class="banner">
    <div class="banner_title">
        <img src="images/icon2.png">
        <div>Best</div>
        <div class="color1">Prices</div>
        <h5>As a professional service providing company We are very genuine with our customers
</h5>
         <a href="about.jsp"><img src="images/tableicon.png"></a>
    </div>
    </div></td><td>&nbsp;</td><td>&nbsp;</td>
    <td>
    <div class="banner">
    <div class="banner_title">
        <img src="images/icon3.png">
        <div>Package</div>
        <div class="color1">Delivery</div>
         <a href="about.jsp"><img src="images/tableicon.png"></a>
    </div>
    </div></td></tr>
    </table>
        
</center>     <!--   
           <div id="how-title">
               <h3 id="how-it-works">
    		
            	Log Here
               </h3>
               
    	</div>
           -->    <br>
               <!--
   <div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>

   
    <div class="carousel-inner" role="listbox">

      <div class="item active">
          <table><tr>
                  <td> <th>Charge per hour Rs.1500<img src="images/car1.jpg" width="300" height="200">/</th></td>
                  <td><img src="images/car2.jpg"  width="300" height="200"></td>
                  <td><img src="images/car3.jpg"  width="300" height="200"></td>
                  <td><img src="images/car7.jpg"  width="300" height="200"></td>
              </tr>
          </table>
      </div>
        <div class="item">
            <table>
                <tr>
                    <td><img src="images/car4.jpg"  width="300" height="200"></td>
                    <td><img src="images/car5.jpg"  width="300" height="200"></td>
                    <td><img src="images/car6.jpg"  width="300" height="200"></td>
                    <td><img src="images/car8.jpg"  width="300" height="200"></td>
                </tr>
            </table>
        </div>
        <div class="item">
            <table>
                <tr>
                    <td><img src="images/car11.jpg"  width="300" height="200"></td>
                    <td><img src="images/car12.jpg"  width="300" height="200"></td>
                    <td><img src="images/car13.jpg"  width="300" height="200"></td>
                    <td><img src="images/car14.jpg"  width="300" height="200"></td>
                </tr>
            </table>
        </div>
     </div>

    
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
               
<div>
<div>
               
    <br><br><br>              
               
</div>
</div>
-->
<center><table >
       
    <tr>
<div id="div1">   
   <div class="container">

  <!-- Trigger the modal with a button -->
  
  <td><img src="images/cus.jpg" class="img-circle"><br>
      <a href="login.jsp">  <button type="button" class="btn btn-info btn-lg"> Customer Login</button></a>
  </td>
  <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
  
<div id="div2">
  
   <div class="container">

  <td> 
      <img src="images/driver.jpg" class="img-circle"><br>
     <a href="loginDriver.jsp">  <button type="button" class="btn btn-info btn-lg"> Driver Login</button></a>
  </td>
  <td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td><td>&nbsp;</td>
  <!-- Modal -->
  <div class="modal fade" id="myModal2" role="dialog" >
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content" style="background-color:#0FC; width: 375px; height: 500px;" >
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Driver Login</h4>
        </div>
        <div class="modal-body">
          <div id="loginbox" style=" width: 300px; height: 10px; margin-left: 20px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2" > 
             <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Login</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal"  role="form" action="loginDriver" method="POST" >
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="user" value="" placeholder="username">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="pwd" placeholder="password">
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                        <button type="submit" name="login" class="btn btn-success">Login</button>
                                     </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="CusReg.jsp" >
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     
                    </div>
             </div>
        </div>
        <div class="modal-footer" style="margin-top:350px">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</div>

<div class="container">

  <!-- Trigger the modal with a button -->
  <td>
      <img src="images/admin1.jpg"  class="img-circle"><br>
      <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal3">Admin Login</button>
  </td>
  <!-- Modal -->
  <div class="modal fade" id="myModal3" role="dialog" >
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content" style="background-color:#0FC; width: 375px; height: 500px;" >
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Admin Login</h4>
        </div>
        <div class="modal-body">
          <div id="loginbox" style=" width: 300px; height: 10px; margin-left: 20px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2" > 
             <div class="panel panel-info" >
                    <div class="panel-heading">
                        <div class="panel-title">Login</div>
                        <div style="float:right; font-size: 80%; position: relative; top:-10px"><a href="#">Forgot password?</a></div>
                    </div>     

                    <div style="padding-top:30px" class="panel-body" >

                        <div style="display:none" id="login-alert" class="alert alert-danger col-sm-12"></div>
                            
                        <form id="loginform" class="form-horizontal"  role="form" action="loginAdminServlet" method="POST" >
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                        <input id="login-username" type="text" class="form-control" name="user" value="" placeholder="username">                                        
                                    </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                                        <input id="login-password" type="password" class="form-control" name="pwd" placeholder="password">
                                    </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->

                                    <div class="col-sm-12 controls">
                                        <button type="submit" name="login" class="btn btn-success">Login</button>
                                     </div>
                                </div>


                                <div class="form-group">
                                    <div class="col-md-12 control">
                                        <div style="border-top: 1px solid#888; padding-top:15px; font-size:85%" >
                                            Don't have an account! 
                                        <a href="CusReg.jsp" >
                                            Sign Up Here
                                        </a>
                                        </div>
                                    </div>
                                </div>    
                            </form>     
                    </div>
             </div>
        </div>
        <div class="modal-footer" style="margin-top:350px">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        </div>
      </div>
      
    </div>
  </div>
  
</div>

</div>
</td>
                </tr>
 
</div>          
              </table>
</center>
    </body>
</html>
