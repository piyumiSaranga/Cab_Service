package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class divReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Driver Registration</title>\n");
      out.write("       <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("       \n");
      out.write("    </head\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("          \n");
      out.write("        <div align=\"center\">\n");
      out.write("        <div id=\"login-form\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<form id=\"registration1\" onsubmit=\"return driversubmitForm()\" method=\"POST\" action=\"driverServlet\">\n");
      out.write("    \n");
      out.write("    \n");
      out.write("   <table align=\"center\" width=\"50%\" border=\"0\">\n");
      out.write("   <tr>\n");
      out.write("       <td><input type=\"text\" id=\"fName\" name=\"firstName\" placeholder=\"First name\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("\n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"lName\" name=\"lName\" placeholder=\"Last Name\" /></td>\n");
      out.write("    </tr>\n");
      out.write("   \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"dob\" name=\"dob\" placeholder=\"Date of birth\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"nic\" name=\"nic\" placeholder=\"NIC\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"tel\" name=\"tel\" placeholder=\"Mobile Number\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Address\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"license\" name=\"license\" placeholder=\"Driving License\" /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"text\" id=\"username\" name=\"username\" placeholder=\"User Name\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"email\" id=\"email\"  name=\"email\" placeholder=\"Email\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        <td><input type=\"password\" id=\"password\" onPaste=\"return false\" name=\"password\" placeholder=\"Password\"  /></td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <td><input type=\"password\" id=\"rePassword\" onPaste=\"return false\" name=\"rePassword\" placeholder=\"Re-Password\" /></td>\n");
      out.write("    </tr> \n");
      out.write("    <!--\n");
      out.write("    <tr>\n");
      out.write("      <td>Picture</td>\n");
      out.write("      <td><input type=\"file\" id=\"image\" name=image\"/></td>\n");
      out.write("    </tr>\n");
      out.write("    -->\n");
      out.write("    <tr>\n");
      out.write("        <td><button type=\"submit\" name=\"submit\">Sign Me Up</button>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td><a href=\"login.jsp\">Sign In Here</a>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("  </table>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
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
