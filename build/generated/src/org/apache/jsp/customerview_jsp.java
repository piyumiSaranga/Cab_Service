package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class customerview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<body bgcolor=\"Yellow\">\n");
      out.write("  <table border=\"1\" width=\"30%\" height=\"30%\">\n");
      out.write("  <tr><th><font color='Red'>EMP ID</font></th><th><font color='Red'>EMP NAME</font></th><th><font color='Red'>SALARY</font></th></tr>\n");

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select *  from booking");
  while(rs.next())
  {
      String EmployeeId=rs.getString("username");
     Date EmployeeName=rs.getDate("checkInDate");
     Date Employee=rs.getDate("checkOutDate");
  
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><b><font color='#663300'>");
      out.print(EmployeeId);
      out.write("</font></b></td>\n");
      out.write("<td><b><font color='#663300'>");
      out.print(EmployeeName);
      out.write("</font></b></td>\n");
      out.write("<td><b><font color='#663300'>");
      out.print(Employee);
      out.write("</font></b></td>\n");
      out.write("</tr>\n");

  }
 
      out.write("\n");
      out.write(" </table>\n");
      out.write("     </body>\n");
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
