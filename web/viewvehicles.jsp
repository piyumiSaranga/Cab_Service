<%-- 
    Document   : viewvehicles
    Created on : Jun 22, 2016, 7:05:45 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>



<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/displayDriverImage.css">
        <link rel="stylesheet" href="home.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
        <style>
             .bootstrap-demo{margin:10px;}
   .card{width:400px; margin:20px; float:left; background-color: #DDD;}
   .slideshow{
       background-color: #fdc903;
       font-weight: bold;
       width:70px;
       height: 30px;
       display: block;
   }
#panel {
    padding: 50px;
    display: none;
    
}
   </style>
   <script>
$(document).ready(function(){
    $(".slideshow").click(function(){
         $(this).parent().nextAll('#panel').first().toggle('slow');
    });
});

$(function(){
 $('.up').cycle({ 
    fx:    'fade', 
    speed:   3000
 });
 
 });
 
 
</script>
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
        <%
            {
                ResultSet rs;
                Statement stmt;
                String vehicleId=null;
                String vehicleNumber=null;
                String veicleFullImage=null;
                String vehiclePartImage1=null;
                String vehiclePartImage2=null;
                String vehiclePartImage3=null;
                String vehicletype=null;
                int vehicleSeats=0;
                
                
                stmt=con.createStatement();
                
                rs=stmt.executeQuery("SELECT vehicle.vehicleNo,vehicle.Id,vehicle.seats,vehicle.type,vehicleimages.fullImage,vehicleimages.image1,vehicleimages.image2,vehicleimages.image3 FROM vehicleimages INNER JOIN vehicle ON vehicle.vehicleNo=vehicleimages.vehicleNumber");
                
                while(rs.next())
                {
                 //
                 veicleFullImage=rs.getString("fullImage");
                 vehiclePartImage1=rs.getString("image1");
                 vehiclePartImage2=rs.getString("image2");
                 vehiclePartImage3=rs.getString("image3");
                 vehicleNumber=rs.getString("vehicleNo");
                 vehicleSeats=rs.getInt("seats");
                 vehicleId=rs.getString("Id");
                 vehicletype=rs.getString("type");
                 
                 %>
                 <div class="card">
                     <div class="up">
                     <img class="card-img-top" width="400px" src="uploads/<%=veicleFullImage%> "  >
                     <img class="card-img-top" width="400px" src="uploads/<%=vehiclePartImage1%> "  >
                     <img class="card-img-top" width="400px" src="uploads/<%=vehiclePartImage2%> "  >
                     <img class="card-img-top" width="400px" src="uploads/<%=vehiclePartImage3%> "  >
                    </div>
    <div class="card-block"> <!-- Any Text Content Block within class="card-block" -->
    <h4 class="card-title">Vehicle Number:<%=vehicleNumber%></h4>
    <p class="card-text"><b>Vehicle Id:<%=vehicleId%></b></p>
    <p><a class="slideshow">More Info</a></p>
    <div id="panel">
        <div id="bodycontent">
            <b> No of Seats:<%=vehicleSeats%><b><br>
            <b>A/C Type:<%=vehicletype%></b>
        </div>
    </div>
  </div>
</div>
    
                 <%
                }
                
                
            } 
        %>
        
    </body>
</html>
