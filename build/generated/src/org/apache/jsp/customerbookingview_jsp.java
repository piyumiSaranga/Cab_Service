package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public final class customerbookingview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <table border=\"1\" >\n");
      out.write("            <tr><th>Customer FirstName </th> <th>Customer LastName </th><th>Address Street1 </th><th>Address Street2 </th><th>Address City </th><th>Mobile Number</th><th>Driver Firstname </th> <th>Driver Lastname </th><th>Driver Mobile Number </th><th>Vehicle Number </th></tr>\n");
      out.write("      ");

         
        String dateIn=(String)session.getAttribute("dateIn");
        
        String dateOut=(String)session.getAttribute("dateOut");
       

        javax.servlet.http.HttpServletResponse res=null;;
   
        Connection conn;
        Statement stmt;
        ResultSet rs;
        
       
         Connection con;
      
         Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
                 stmt=con.createStatement();
         rs=stmt.executeQuery("SELECT username FROM booking");
         //rs=stmt.executeQuery("SELECT customer.fname,customer.lname,customer.street1,customer.street2,customer.city,customer.mobileNo,driver.firstName,driver.lastName,driver.tel,vehicle.vehicleNo FROM booking INNER JOIN customer ON customer.username=booking.username INNER JOIN driver ON driver.Id=booking.driverId INNER JOIN vehicle ON vehicle.Id=booking.vehicleId WHERE checkInDate BETWEEN '"+dateIn+"' AND '"+dateOut+"'");
  while(rs.next())
      
  {
      String username=rs.getString("username");
      /*
      String FirstName=rs.getString("fname");
      out.print(FirstName);
    
       String LastName=rs.getString("lname");
    
      String street1=rs.getString("street1");
      
      String street2=rs.getString("street2");
      
      String city=rs.getString("city");
    
      int mobileNo=rs.getInt("mobileNo");
     
      String driverfName=rs.getString("firstName");
   
      String driverlName=rs.getString("lastName");
  
     int tel=rs.getInt("tel");
     
      String vehicleNo=rs.getString("vehicleNo");
*/
     
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(username);
      out.write("</td>\n");
      out.write("                \n");
      out.write("                    \n");
      out.write(" ");

  }
                    
   
      out.write("\n");
      out.write("      \n");
      out.write("       \n");
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
