package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dispalyDriverImages_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"CSS/displayDriverImage.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        \n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("             .bootstrap-demo{margin:10px;}\n");
      out.write("   .card{width:275px; margin:50px; float:left; background-color: #DDD;}\n");
      out.write("   \n");
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
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".slideshow\").click(function(){\n");
      out.write("         $(this).parent().nextAll('#panel').first().toggle('slow');\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("    <body>\n");
      out.write("         <div id=\"how-title\">\n");
      out.write("               <h3 id=\"how-it-works\">\n");
      out.write("    \t\t\n");
      out.write("               Car Drivers\n");
      out.write("               </h3>\n");
      out.write("               \n");
      out.write("    \t</div>\n");
      out.write("        ");



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
 Class.forName("com.mysql.jdbc.Driver");
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
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

      out.write("\n");
      out.write("\n");
      out.write("   <div class=\"bootstrap-demo\">\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("  <img class=\"card-img-top\"  src=\"uploads/");
      out.print(driverImageCar);
      out.write("\"  >\n");
      out.write("  <div class=\"card-block\">\n");
      out.write("    <h4 class=\"card-title\">");
      out.print(driverFirstName);
      out.write(' ');
      out.print(driverLastName);
      out.write("</h4>\n");
      out.write("    <h5 class=\"card-text\">Driver Id:");
      out.print(driverId);
      out.write("</h5>\n");
      out.write("   \n");
      out.write("    <p><a class=\"slideshow\">More Info</a></p>\n");
      out.write("    <div id=\"panel\">\n");
      out.write("        <div id=\"bodycontent\">\n");
      out.write("           Telephone Number: ");
      out.print(driverTelephone);
      out.write(" \n");
      out.write("           <br>\n");
      out.write("           Date of Birth:");
      out.print(driverAge);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("   </div>\n");
      out.write("       \n");
      out.write("\n");


}


out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<div id='how-title'><h3 id='how-it-works'>Van Drivers</h3></div>");
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

      out.write("\n");
      out.write("\n");
      out.write("<div class=\"bootstrap-demo\">\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("  <img class=\"card-img-top\"  src=\"uploads/");
      out.print(driverImageVan);
      out.write("\"  >\n");
      out.write("  <div class=\"card-block\">\n");
      out.write("    <h4 class=\"card-title\">");
      out.print(driverFirstName);
      out.write(' ');
      out.print(driverLastName);
      out.write("</h4>\n");
      out.write("    <h5 class=\"card-text\">Driver Id:");
      out.print(driverId);
      out.write("</h5>\n");
      out.write("   \n");
      out.write("    <p><a class=\"slideshow\">More Info</a></p>\n");
      out.write("    <div id=\"panel\">\n");
      out.write("        <div id=\"bodycontent\">\n");
      out.write("           Telephone Number: ");
      out.print(driverTelephone);
      out.write(" \n");
      out.write("           <br>\n");
      out.write("           Date of Birth:");
      out.print(driverAge);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("   </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");

}



out.println("<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>");
out.println("<div id='how-title'><h3 id='how-it-works'>Bus Drivers</h3></div>");
rs2=stmt.executeQuery("SELECT driverimages.driverImage,driver.Id,driver.firstName,driver.lastName,driver.tel,driver.dob FROM driverimages INNER JOIN driver ON driver.nic=driverimages.driverNic WHERE specializedFor='Bus'");
while(rs2.next())
{
driverImageBus=rs2.getString("driverImage");
driverId=rs2.getInt("Id");
driverFirstName=rs2.getString("firstName");
driverLastName=rs2.getString("lastName");
driverTelephone=rs2.getString("tel");
driverAge=rs2.getDate("dob");

      out.write("\n");
      out.write("<div class=\"bootstrap-demo\">\n");
      out.write("\n");
      out.write("<div class=\"card\">\n");
      out.write("  <img class=\"card-img-top\"  src=\"uploads/");
      out.print(driverImageBus);
      out.write("\"  >\n");
      out.write("  <div class=\"card-block\">\n");
      out.write("    <h4 class=\"card-title\">");
      out.print(driverFirstName);
      out.write(' ');
      out.print(driverLastName);
      out.write("</h4>\n");
      out.write("    <h5 class=\"card-text\">Driver Id:");
      out.print(driverId);
      out.write("</h5>\n");
      out.write("   \n");
      out.write("    <p><a class=\"slideshow\">More Info</a></p>\n");
      out.write("    <div id=\"panel\">\n");
      out.write("        <div id=\"bodycontent\">\n");
      out.write("           Telephone Number: ");
      out.print(driverTelephone);
      out.write(" \n");
      out.write("           <br>\n");
      out.write("           Date of Birth:");
      out.print(driverAge);
      out.write(" \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("   </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("\n");

}

}


      out.write("\n");
      out.write("\n");
      out.write("     \n");
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
