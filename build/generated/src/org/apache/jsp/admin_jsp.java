package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/Admin.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("         <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("         <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("  .bootstrap-demo{margin:10px;}\n");
      out.write("   .card{width:325px; margin:10px; float:left;}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      \n");
      out.write("         ");

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
                  
            
      out.write("\n");
      out.write("         <div id=\"header\">\n");
      out.write("\t\t<div id=\"left\">\n");
      out.write("                 <label>\n");
      out.write("                        ADMIN DASHBOARD\n");
      out.write("                     </label>\n");
      out.write("    \t</div>\n");
      out.write("         </div>\n");
      out.write("         <div id=\"nav\">\n");
      out.write("\t<div id=\"nav_wrapper\">\n");
      out.write("    \t<ul>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"#\">Home</a>\n");
      out.write("            </li>\n");
      out.write("        \t<li>\n");
      out.write("            \t<a href=\"#\">Registration</a>\n");
      out.write("                <ul>\n");
      out.write("                    <a href=\"vehicle.jsp\">Register Vehicles</a>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"about.jsp\">About us</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"#\">Contact us</a>\n");
      out.write("            </li>\n");
      out.write("           \n");
      out.write("        </ul>\n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("        <br><br><br><br><br>\n");
      out.write("      <div class=\"bootstrap-demo\">\n");
      out.write("\n");
      out.write("<div class=\"card-group\" >\n");
      out.write("<!-- Card no 1, normal size -->\n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"images/userImage.jpg\" >\n");
      out.write("    <div class=\"card-block\">\n");
      out.write("      <h3 class=\"card-title\">Total Users</h4>\n");
      out.write("      \n");
      out.write("      <p class=\"card-text\" style=\"font-size: 15px; font-weight: bold\" >");
      out.print(id);
      out.write(" Users</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" <!-- Card no 2, smaller than normal size --> \n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"images/driverImage.jpg\"  alt=\"pizza italy\">\n");
      out.write("    <div class=\"card-block\">\n");
      out.write("      <h3 class=\"card-title\">Total Drivers</h4>\n");
      out.write("      <p class=\"card-text\" style=\"font-size: 15px; font-weight: bold\">");
      out.print(driverId);
      out.write(" Drivers</p>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" <!-- Card no 3, larger than normal size --> \n");
      out.write("  <div class=\"card\">\n");
      out.write("    <img class=\"card-img-top\" src=\"images/vehicleImage.jpg\"  >\n");
      out.write("    <div class=\"card-block\">\n");
      out.write("      <h3 class=\"card-title\">Total Vehicles</h3>\n");
      out.write("      <p class=\"card-text\" style=\"font-size: 15px; font-weight: bold\">");
      out.print(vehicleId);
      out.write(" Vehicles</p>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("      <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("      <script type=\"text/javascript\">\n");
      out.write("      google.charts.load('current', {'packages':['corechart']});\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\n");
      out.write("      function drawChart() {\n");
      out.write("\n");
      out.write("        var data = google.visualization.arrayToDataTable([\n");
      out.write("         ['Task', 'Number of vehicles'],\n");
      out.write("          ['Car',     ");
      out.print(vehicleCarId);
      out.write("],\n");
      out.write("          ['Van',      ");
      out.print(vehicleBusId);
      out.write("],\n");
      out.write("          ['Bus',  ");
      out.print(vehicleVanId);
      out.write("]\n");
      out.write("         \n");
      out.write("        ]);\n");
      out.write("\n");
      out.write("        var options = {\n");
      out.write("          \n");
      out.write("          is3D: true\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n");
      out.write("\n");
      out.write("        chart.draw(data, options);\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("     <div id=\"how-title\">\n");
      out.write("               <h3 id=\"how-it-works\">\n");
      out.write("    \t\t\n");
      out.write("            \tFeatured Advertisement\n");
      out.write("               </h3>\n");
      out.write("               \n");
      out.write("    \t</div>\n");
      out.write("        <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
