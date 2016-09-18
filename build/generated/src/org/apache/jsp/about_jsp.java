package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>About Us</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"home.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("         <style type=\"text/css\">\n");
      out.write("/*bottem*/\n");
      out.write("#botbar{\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:150px;\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:1400px;\n");
      out.write("\tleft:0px;\n");
      out.write("\tz-index:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bot{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:1420px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("#set1{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:1420px;\n");
      out.write("\tleft:225px;\n");
      out.write("\twidth:300px;\n");
      out.write("\tz-index:2;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("#set2{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:1420px;\n");
      out.write("\tleft:550px;\n");
      out.write("\twidth:300px;\n");
      out.write("\tz-index:2\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("#set3{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:1420px;\n");
      out.write("\tleft:875px;\n");
      out.write("\twidth:300px;\n");
      out.write("\tz-index:2\n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".sethead{\n");
      out.write("\tfont-family:Verdana, Geneva, sans-serif;\n");
      out.write("\tfont-size:12pt;\n");
      out.write("\tcolor:#FFF;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write(".pbody{\n");
      out.write("\tfont-family:Verdana, Geneva, sans-serif;\n");
      out.write("\tfont-size:10pt;\n");
      out.write("\tcolor:#999;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write(".list2{\n");
      out.write("\tfont-family:Verdana, Geneva, sans-serif;\n");
      out.write("\tfont-size:10pt;\n");
      out.write("\tcolor:#999;\n");
      out.write("\t}\n");
      out.write("/*line*/\n");
      out.write("#sep{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop:634px;\n");
      out.write("\tleft:180px;\n");
      out.write("\theight:4px;\n");
      out.write("\t}\n");
      out.write("\t\t\n");
      out.write("#sep1{\n");
      out.write("\tposition: absolute;\n");
      out.write("\ttop:910px;\n");
      out.write("\tleft:180px;\n");
      out.write("\theight:4px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("  .carousel-inner > .item > img,\n");
      out.write("  .carousel-inner > .item > a > img {\n");
      out.write("      width: 15%;\n");
      out.write("      margin: auto;\n");
      out.write("  }\n");
      out.write("  </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
        
      out.write("\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t<div id=\"left\">\n");
      out.write("                    <label>\n");
      out.write("                    <img src=\"images/header.png\">\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        www.mycitycab.lk <br>\n");
      out.write("                        071 3 87 90 52\n");
      out.write("                    </label>\n");
      out.write("    \t</div>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("           <div id=\"right\">\n");
      out.write("               <div id=\"content\">\n");
      out.write("                   <label>\n");
      out.write("                   Follow Us On\n");
      out.write("                   <br>\n");
      out.write("                   <img src=\"images/facebook.png\">\n");
      out.write("                   <img src=\"images/google.jpg\">\n");
      out.write("                   <img src=\"images/twitter.jpg\">\n");
      out.write("                   <img src=\"images/youtube.jpg\">\n");
      out.write("\n");
      out.write("               </label>\n");
      out.write("                   <br>\n");
      out.write("                   ");
 
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
                   
      out.write("\n");
      out.write("               </div>\n");
      out.write("               </div>\n");
      out.write("       </div>\n");
      out.write("               <hr>\n");
      out.write("         <div id=\"nav\">\n");
      out.write("\t<div id=\"nav_wrapper\">\n");
      out.write("    \t<ul>\n");
      out.write("        \t<li>\n");
      out.write("            \t<a href=\"index.jsp\">Home</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"about.jsp\">About us</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"dispalyDriverImages.jsp\">Driver Gallery</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"viewvehicles.jsp\">Vehicle Gallery</a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("            \t<a href=\"#\">Contact us</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li>\n");
      out.write("                ");
  if(userName!=null){
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
          
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("         </div><br><br>\n");
      out.write("         <table >\n");
      out.write("             <tr>\n");
      out.write("                 <td><h2>A Few Words About Us</h2></td><td>&nbsp;</td><td><h2>Why Choose Us</h2></td><td>&nbsp;</td>\n");
      out.write("             </tr>\n");
      out.write("             <tr><td><img src=\"images/man.jpg\" ></td><td width='500'><b>MYCITY</b> Cab is the first cab service started in Horana and it was established in 2005.It's the premium cab service provider in Sri Lanka that has being fulfilling all kinds of consumer transport and travelling requirements including cab, taxi and rent-a-car services. MYCITY Cab and taxi service also provides excellent and reliable service in 24 hours, 7 days a week, and 365 days a year. We have the largest network of branches and also have enough capability to provide our services island wide, using over 200 well-conditioned vehicles and talented drivers. .\n");
      out.write("                 </td><td rowspan=\"2\" width=\"300\"><img src=\"images/num1.jpg\" ><b>Fast & Safe</b><br><img src=\"images/num2.jpg\" ><b>Best Prices</b><br><img src=\"images/num3.jpg\" ><b>Delivery Package</b></td></tr>\n");
      out.write("             <tr><td colspan=\"2\" width='500'> The principal policy of MYCITY Cab service is muscularly based on the concept of providing exceptional and reliable service to its clients. It is a part of a group of companies that covers the spheres of trading, import and export, investment and property development, manpower, defense solutions, migration and education, and transport and fleet management in Sri Lanka and overseas. Derana Cab was the first cab and taxi service established in the Kandy city and currently it is the number one service provider in cab and taxi services in Sri Lanka</td></tr>\n");
      out.write("         </table>\n");
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
