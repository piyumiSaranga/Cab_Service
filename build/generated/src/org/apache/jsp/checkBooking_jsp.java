package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class checkBooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"http://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/jquery.ui.timepicker.addon/1.4.5/jquery-ui-timepicker-addon.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"http://code.jquery.com/ui/1.10.4/jquery-ui.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-ui-timepicker-addon/1.4.5/jquery-ui-timepicker-addon.min.js\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("             <div id=\"login-form\">\n");
      out.write("        <form method=\"POST\" action=\"checkBookingServlet\">\n");
      out.write("               <table align=\"center\" width=\"50%\" border=\"0\">\n");
      out.write("        <tr>\n");
      out.write("                <td><input type=\"date\" id=\"checkIn\" name=\"checkIn\" required=\"required\" placeholder=\"Check In Date\"></td>\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                <td><input type=\"date\" id=\"checkOut\" name=\"checkOut\" required=\"required\" placeholder=\"Check Out Date\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td><button type=\"submit\" id=\"submit\" name=\"submit\" value=\"\">Check Booking</button></td></tr>\n");
      out.write("               </table>\n");
      out.write("        </form>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        ");

            /*
             Connection con;
       String checkInDate=request.getParameter("checkIn");
         String   checkOutDate=request.getParameter("checkOut");
         Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                Statement stmt=con.createStatement();
         
        ResultSet rs=stmt.executeQuery("SELECT username FROM booking WHERE checkInDate BETWEEN '"+checkInDate+"' AND '"+checkOutDate+"'");
  while(rs.next())
  {
      String Username=rs.getString("username");
      out.println(Username);
      //String EmployeeName=rs.getString("empname");
     // int Salary=rs.getInt("sal");
  }*/
                    
      out.write("\n");
      out.write("                    \n");
      out.write("          </body>\n");
      out.write("    \n");
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
