package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewvehicles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/displayDriverImage.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .bootstrap-demo{margin:10px;}\n");
      out.write("   .card{width:400px; margin:20px; float:left; background-color: #DDD;}\n");
      out.write("   .slideshow{\n");
      out.write("       background-color: #fdc903;\n");
      out.write("       font-weight: bold;\n");
      out.write("       width:70px;\n");
      out.write("       height: 30px;\n");
      out.write("       display: block;\n");
      out.write("   }\n");
      out.write("#panel {\n");
      out.write("    padding: 50px;\n");
      out.write("    display: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("   </style>\n");
      out.write("   <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".slideshow\").click(function(){\n");
      out.write("         $(this).parent().nextAll('#panel').first().toggle('slow');\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(function(){\n");
      out.write(" $('.up').cycle({ \n");
      out.write("    fx:    'fade', \n");
      out.write("    speed:   3000\n");
      out.write(" });\n");
      out.write(" \n");
      out.write(" });\n");
      out.write(" \n");
      out.write(" \n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

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
                
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
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
                 
                 
      out.write("\n");
      out.write("                 <div class=\"card\">\n");
      out.write("                     <div class=\"up\">\n");
      out.write("                     <img class=\"card-img-top\" width=\"400px\" src=\"uploads/");
      out.print(veicleFullImage);
      out.write(" \"  >\n");
      out.write("                     <img class=\"card-img-top\" width=\"400px\" src=\"uploads/");
      out.print(vehiclePartImage1);
      out.write(" \"  >\n");
      out.write("                     <img class=\"card-img-top\" width=\"400px\" src=\"uploads/");
      out.print(vehiclePartImage2);
      out.write(" \"  >\n");
      out.write("                     <img class=\"card-img-top\" width=\"400px\" src=\"uploads/");
      out.print(vehiclePartImage3);
      out.write(" \"  >\n");
      out.write("                    </div>\n");
      out.write("    <div class=\"card-block\"> <!-- Any Text Content Block within class=\"card-block\" -->\n");
      out.write("    <h4 class=\"card-title\">Vehicle Number:");
      out.print(vehicleNumber);
      out.write("</h4>\n");
      out.write("    <p class=\"card-text\"><b>Vehicle Id:");
      out.print(vehicleId);
      out.write("</b></p>\n");
      out.write("    <p><a class=\"slideshow\">More Info</a></p>\n");
      out.write("    <div id=\"panel\">\n");
      out.write("        <div id=\"bodycontent\">\n");
      out.write("            <b> No of Seats:");
      out.print(vehicleSeats);
      out.write("<b><br>\n");
      out.write("            <b>A/C Type:");
      out.print(vehicletype);
      out.write("</b>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("    \n");
      out.write("                 ");

                }
                
                
            } 
        
      out.write("\n");
      out.write("        \n");
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
