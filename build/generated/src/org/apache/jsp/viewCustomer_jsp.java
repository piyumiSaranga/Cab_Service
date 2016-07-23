package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class viewCustomer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>View Image Page</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<table width=\"100%\" border=\"0\">\n");
      out.write("<!-- main content -->\n");


try
{
 ResultSet rs;
 Statement stmt;
 
        
             Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
         stmt=con.createStatement();
rs=stmt.executeQuery("select ph from upload");
 
while(rs.next())
{

      out.write("\n");
      out.write("<table width=\"70%\" height=\"160\" border=\"1\" align=\"center\">\n");
      out.write("<tr>\n");
      out.write("<!-- Mention Directory where your images has been saved-->\n");
      out.write(" \n");
      out.write("<td><img src=\"images/");
      out.print(rs.getString("ph") );
      out.write("\" width=\"115\" height=\"128\" /></td>\n");
      out.write("</tr>\n");
      out.write("</table>\n");

}
}
catch(Exception e)
{
out.print(""+e.getMessage());
}

      out.write("\n");
      out.write(" \n");
      out.write("</table>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<pre>");
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
