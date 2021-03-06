<%-- 
    Document   : dispalyDriverImages
    Created on : Jul 12, 2016, 9:53:32 AM
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
   .card{width:275px; margin:50px; float:left; background-color: #DDD;}
   
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
         </div>
            <br>
        <%
out.println("<div id='how-title2'><h3 id='how-it-works1'>Car Drivers</h3></div>");

{
 ResultSet rs,rs1,rs2,rsAge;
 Statement stmt;
 String driverImageCar=null;
 String driverImageVan=null;
 String driverImageBus=null;
 String driverFirstName=null;
 String driverLastName=null;
 String driverTelephone=null;
 Date driverAge;
 int driverId=0;
 
 stmt=con.createStatement();
rs=stmt.executeQuery("SELECT driverimages.driverImage,driver.Id,driver.firstName,driver.lastName,driver.tel,driver.dob FROM driverimages INNER JOIN driver ON driver.nic=driverimages.driverNic WHERE specializedFor='Car'");
//rs=stmt.executeQuery("SELECT TIMESTAMPDIFF (YEAR, dob, CURDATE()) FROM driver AS AGE");
while(rs.next())
{
driverImageCar=rs.getString("driverImage");
driverId=rs.getInt("Id");
driverFirstName=rs.getString("firstName");
driverLastName=rs.getString("lastName");
driverTelephone=rs.getString("tel");
driverAge=rs.getDate("dob");
%>

   <div class="bootstrap-demo">

<div class="card">
  <img class="card-img-top"  src="uploads/<%=driverImageCar%>"  >
  <div class="card-block">
    <h4 class="card-title"><%=driverFirstName%> <%=driverLastName%></h4>
    <h5 class="card-text">Driver Id:<%=driverId%></h5>
   
    <p><a class="slideshow">More Info</a></p>
    <div id="panel">
        <div id="bodycontent">
           Telephone Number: <%=driverTelephone%> 
           <br>
           Date of Birth:<%=driverAge%> 
        </div>
    </div>
 

</div>
   </div>
       

<%

}


out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<div id='how-title2'><h3 id='how-it-works1'>Van Drivers</h3></div>");
//out.println("<table><tr><th>djhdgs</th></tr></table>");
rs1=stmt.executeQuery("SELECT driverimages.driverImage,driver.Id,driver.firstName,driver.lastName,driver.tel,driver.dob FROM driverimages INNER JOIN driver ON driver.nic=driverimages.driverNic WHERE specializedFor='Van'");
while(rs1.next())
{
driverImageVan=rs1.getString("driverImage");
driverId=rs1.getInt("Id");
driverFirstName=rs1.getString("firstName");
driverLastName=rs1.getString("lastName");
driverTelephone=rs1.getString("tel");
driverAge=rs1.getDate("dob");
%>

<div class="bootstrap-demo">

<div class="card">
  <img class="card-img-top"  src="uploads/<%=driverImageVan%>"  >
  <div class="card-block">
    <h4 class="card-title"><%=driverFirstName%> <%=driverLastName%></h4>
    <h5 class="card-text">Driver Id:<%=driverId%></h5>
   
    <p><a class="slideshow">More Info</a></p>
    <div id="panel">
        <div id="bodycontent">
           Telephone Number: <%=driverTelephone%> 
           <br>
           Date of Birth:<%=driverAge%> 
        </div>
    </div>
 

</div>
   </div>
       


<%
}



out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<div id='how-title2'><h3 id='how-it-works1'>Bus Drivers</h3></div>");
rs2=stmt.executeQuery("SELECT driverimages.driverImage,driver.Id,driver.firstName,driver.lastName,driver.tel,driver.dob FROM driverimages INNER JOIN driver ON driver.nic=driverimages.driverNic WHERE specializedFor='Bus'");
while(rs2.next())
{
driverImageBus=rs2.getString("driverImage");
driverId=rs2.getInt("Id");
driverFirstName=rs2.getString("firstName");
driverLastName=rs2.getString("lastName");
driverTelephone=rs2.getString("tel");
driverAge=rs2.getDate("dob");
%>
<div class="bootstrap-demo">

<div class="card">
  <img class="card-img-top"  src="uploads/<%=driverImageBus%>"  >
  <div class="card-block">
    <h4 class="card-title"><%=driverFirstName%> <%=driverLastName%></h4>
    <h5 class="card-text">Driver Id:<%=driverId%></h5>
   
    <p><a class="slideshow">More Info</a></p>
    <div id="panel">
        <div id="bodycontent">
           Telephone Number: <%=driverTelephone%> 
           <br>
           Date of Birth:<%=driverAge%> 
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
