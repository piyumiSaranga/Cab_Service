package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class viewMyBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>View My booking</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"home.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("       <!-- <script type=\"text/javascript\">\n");
      out.write("window.onload=function(){\n");
      out.write("    setTimeout(enableIt,5000);\n");
      out.write("};\n");
      out.write("function enableIt(){\n");
      out.write("    document.getElementById('cancel').disabled=true;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("    </script>\n");
      out.write("-->\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("var q = new Date();\n");
      out.write("var m = q.getMonth()+1;\n");
      out.write("var d = q.getDay();\n");
      out.write("var y = q.getYear();\n");
      out.write("\n");
      out.write("var date = new Date(y,m,d);\n");
      out.write("\n");
      out.write("mydate=new Date('2016-10-11');\n");
      out.write("console.log(date);\n");
      out.write("console.log(mydate);\n");
      out.write("\n");
      out.write("if(date>mydate)\n");
      out.write("{\n");
      out.write("    //document.getElementById('cancel').disabled=true;\n");
      out.write("    alert(\"greater\");\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("   //document.getElementById('cancel').disabled=true;\n");
      out.write("   alert(\"smal\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         ");

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
            
      out.write("\n");
      out.write("             <div id=\"header\">\n");
      out.write("\t\t<div id=\"left\">\n");
      out.write("                    <label>\n");
      out.write("                    <img src=\"images/header.png\">\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        www.mycitycab.lk <br>\n");
      out.write("                        071 3 87 90 52\n");
      out.write("                    </label>\n");
      out.write("    \t</div>\n");
      out.write("                  <div id=\"right\">\n");
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
      out.write("            <li>\n");
      out.write("                ");
  if(userName!=null){
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
          
      out.write("\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("         </div><br><br>\n");
      out.write("          <div class=\"container\">\n");
      out.write("       \n");
      out.write("              <table class=\"table table-hover\" >\n");
      out.write("                  <tr><td>Booking ID</td>\n");
      out.write("                  <td>Check In Date</td>\n");
      out.write("                  <td>Check Out Date</td>\n");
      out.write("                  <td>Check In Time</td>\n");
      out.write("                  <td>Check Out Time</td>\n");
      out.write("                  <td>Starting Place</td>\n");
      out.write("                  <td>Ending Place</td>\n");
      out.write("                  <td>Vehicle Number</td>\n");
      out.write("                  <td>Driver Number</td>\n");
      out.write("                  <td>&nbsp;</td></tr>\n");
      out.write("                  ");

                out.println(userName);
             
                        Connection conn;
                        Statement stmt;
                        ResultSet rs;
                        Class.forName("com.mysql.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                        stmt=con.createStatement();
                        rs=stmt.executeQuery("SELECT BookId,checkInDate,checkOutDate,checkInTime,checkOutTime,start,end,vehicleId,driverId,bookedTime FROM booking WHERE username='"+userName+"' ");
                           
                        while(rs.next())
                        {
                            int bookId=rs.getInt("BookId");
                           
                            Date inDate=rs.getDate("checkInDate");
                            Date outDate=rs.getDate("checkOutDate");
                            Time inTime=rs.getTime("checkInTime");
                            Time outTime=rs.getTime("checkOutTime");
                            String startPlace=rs.getString("start");
                            String endingPlace=rs.getString("end");
                            int vehicleNo=rs.getInt("vehicleId");
                            int driverNo=rs.getInt("driverId");
                            Date bookedtime=rs.getDate("bookedTime");
                           
                          
      out.write("\n");
      out.write("                          <tr><td>");
      out.print(bookId);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(inDate);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(outDate);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(inTime);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(outTime);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(startPlace);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(endingPlace);
      out.write("</td>\n");
      out.write("                          <td>");
      out.print(vehicleNo);
      out.write("\"</td>\n");
      out.write("                          <td>");
      out.print(driverNo);
      out.write("\"</td>\n");
      out.write("                          <td><button type=\"submit\" class='btn btn-primary' id=\"cancel\"  >Cancel Booking</button> </td>\n");
      out.write("                         \n");
      out.write("                   ");
         
                        }
                
                
      out.write("\n");
      out.write("                \n");
      out.write("                          \n");
      out.write("              </div>\n");
      out.write("            \n");
      out.write("        </table>\n");
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
