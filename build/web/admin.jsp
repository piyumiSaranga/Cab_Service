<%-- 
    Document   : admin
    Created on : Jul 4, 2016, 7:27:15 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="CSS/Admin.css" type="text/css" />
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
        

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
         <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
         <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
        <title>JSP Page</title>
        <style>
  .bootstrap-demo{margin:10px;}
   .card{width:325px; margin:10px; float:left;}
</style>

    </head>
    <body>
      
         <%
             Statement stmt;
             ResultSet rs;
             ResultSet rs1;
             ResultSet rs2;
             ResultSet rs3;
             ResultSet rs4;
             ResultSet rs5;
        
             Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
         stmt=con.createStatement();
           rs=stmt.executeQuery("SELECT COUNT(ID) as NumberOfUsers FROM customer ");
          int id=0;
          if(rs.next())
          {
               id=rs.getInt(1);
               //out.print(id);
          }
          rs1=stmt.executeQuery("SELECT COUNT(Id) as NumberOfDrivers FROM driver ");
          int driverId=0;
          if(rs1.next())
          {
               driverId=rs1.getInt(1);
               //out.print(id);
          }
           rs2=stmt.executeQuery("SELECT COUNT(Id) as NumberOfVehicles FROM vehicle ");
          int vehicleId=0;
          if(rs2.next())
          {
               vehicleId=rs2.getInt(1);
               //out.print(id);
          }
          rs3=stmt.executeQuery("SELECT COUNT(Id) as NumberOfVehicles FROM vehicle WHERE vehicleType='Car'");
          int vehicleCarId=0;
          if(rs3.next())
          {
               vehicleCarId=rs3.getInt(1);
               
               //out.print(vehicleCarId);
          }
          
          rs4=stmt.executeQuery("SELECT COUNT(Id) as NumberOfVehicles FROM vehicle WHERE vehicleType='Bus' ");
          int vehicleBusId=0;
          if(rs4.next())
          {
               vehicleBusId=rs4.getInt(1);
                //out.print(vehicleBusId);
          }
          rs5=stmt.executeQuery("SELECT COUNT(Id) as NumberOfVehicles FROM vehicle WHERE vehicleType='Van'");
          int vehicleVanId=0;
          if(rs5.next())
          {
               vehicleVanId=rs5.getInt(1);
              //out.print(vehicleVanId);
          }
                  
            %>
         <div id="header">
		<div id="left">
                 <label>
                        ADMIN DASHBOARD
                     </label>
    	</div>
         </div>
         <div id="nav">
	<div id="nav_wrapper">
    	<ul>
            <li>
            	<a href="#">Home</a>
            </li>
        	<li>
            	<a href="#">Registration</a>
                <ul>
                    <a href="vehicle.jsp">Register Vehicles</a>
                </ul>
            </li>
            <li>
            	<a href="about.jsp">About us</a>
            </li>
            <li>
            	<a href="#">Contact us</a>
            </li>
           
        </ul>
                </div>
         </div>
        <br><br><br><br><br>
      <div class="bootstrap-demo">

<div class="card-group" >
<!-- Card no 1, normal size -->
  <div class="card">
    <img class="card-img-top" src="images/userImage.jpg" >
    <div class="card-block">
      <h3 class="card-title">Total Users</h4>
      
      <p class="card-text" style="font-size: 15px; font-weight: bold" ><%=id%> Users</p>
      
    </div>
  </div>
 <!-- Card no 2, smaller than normal size --> 
  <div class="card">
    <img class="card-img-top" src="images/driverImage.jpg"  alt="pizza italy">
    <div class="card-block">
      <h3 class="card-title">Total Drivers</h4>
      <p class="card-text" style="font-size: 15px; font-weight: bold"><%=driverId%> Drivers</p>
     
    </div>
  </div>
 <!-- Card no 3, larger than normal size --> 
  <div class="card">
    <img class="card-img-top" src="images/vehicleImage.jpg"  >
    <div class="card-block">
      <h3 class="card-title">Total Vehicles</h3>
      <p class="card-text" style="font-size: 15px; font-weight: bold"><%=vehicleId%> Vehicles</p>
      
    </div>
  </div>
  
</div>

</div>
      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
      <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
         ['Task', 'Number of vehicles'],
          ['Car',     <%=vehicleCarId%>],
          ['Van',      <%=vehicleBusId%>],
          ['Bus',  <%=vehicleVanId%>]
         
        ]);

        var options = {
          
          is3D: true
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
     <div id="how-title">
               <h3 id="how-it-works">
    		
            	Featured Advertisement
               </h3>
               
    	</div>
        <div id="piechart" style="width: 900px; height: 500px;"></div> 
    </body>
</html>
