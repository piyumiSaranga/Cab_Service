<%-- 
    Document   : about
    Created on : Jun 14, 2016, 6:01:54 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>About Us</title>
        <link rel="stylesheet" href="home.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
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
                 
             }
             
             else if(userRole=="Customer")
             {
                 out.println("<a href='#'>Customer</a>");
                 out.println("<ul>");
                 out.println("<li><a href='CusReg.jsp'>View my bookings</a></li>");
                
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
         <table >
             <tr>
                 <td><h2>A Few Words About Us</h2></td><td>&nbsp;</td><td><h2>Why Choose Us</h2></td><td>&nbsp;</td>
             </tr>
             <tr><td><img src="images/man.jpg" ></td><td width='500'><b>MYCITY</b> Cab is the first cab service started in Horana and it was established in 2005.It's the premium cab service provider in Sri Lanka that has being fulfilling all kinds of consumer transport and travelling requirements including cab, taxi and rent-a-car services. MYCITY Cab and taxi service also provides excellent and reliable service in 24 hours, 7 days a week, and 365 days a year. We have the largest network of branches and also have enough capability to provide our services island wide, using over 200 well-conditioned vehicles and talented drivers. .
                 </td><td rowspan="2" width="300"><img src="images/num1.jpg" ><b>Fast & Safe</b><br><img src="images/num2.jpg" ><b>Best Prices</b><br><img src="images/num3.jpg" ><b>Delivery Package</b></td></tr>
             <tr><td colspan="2" width='500'> The principal policy of MYCITY Cab service is muscularly based on the concept of providing exceptional and reliable service to its clients. It is a part of a group of companies that covers the spheres of trading, import and export, investment and property development, manpower, defense solutions, migration and education, and transport and fleet management in Sri Lanka and overseas. Derana Cab was the first cab and taxi service established in the Kandy city and currently it is the number one service provider in cab and taxi services in Sri Lanka</td></tr>
         </table>
    </body>
</html>
