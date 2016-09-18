package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class demo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            $('#pass').keyup(function(e) {\n");
      out.write("     var strongRegex = new RegExp(\"^(?=.{8,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*\\\\W).*$\", \"g\");\n");
      out.write("     var mediumRegex = new RegExp(\"^(?=.{7,})(((?=.*[A-Z])(?=.*[a-z]))|((?=.*[A-Z])(?=.*[0-9]))|((?=.*[a-z])(?=.*[0-9]))).*$\", \"g\");\n");
      out.write("     var enoughRegex = new RegExp(\"(?=.{6,}).*\", \"g\");\n");
      out.write("     if (false == enoughRegex.test($(this).val())) {\n");
      out.write("             $('#passstrength').html('More Characters');\n");
      out.write("     } else if (strongRegex.test($(this).val())) {\n");
      out.write("             $('#passstrength').className = 'ok';\n");
      out.write("             $('#passstrength').html('Strong!');\n");
      out.write("     } else if (mediumRegex.test($(this).val())) {\n");
      out.write("             $('#passstrength').className = 'alert';\n");
      out.write("             $('#passstrength').html('Medium!');\n");
      out.write("     } else {\n");
      out.write("             $('#passstrength').className = 'error';\n");
      out.write("             $('#passstrength').html('Weak!');\n");
      out.write("     }\n");
      out.write("     return true;\n");
      out.write("});\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        <style>\n");
      out.write("            #pass_form {\n");
      out.write("    margin:10px;\n");
      out.write("}\n");
      out.write("label {\n");
      out.write("    font-family:verdana;\n");
      out.write("    font-size:10px;\n");
      out.write("}\n");
      out.write("input {\n");
      out.write("    padding:2px;\n");
      out.write("    color:gray;\n");
      out.write("}\n");
      out.write("#passstrength {\n");
      out.write("    color:red;\n");
      out.write("    font-family:verdana;\n");
      out.write("    font-size:10px;\n");
      out.write("    font-weight:bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <form name=\"password_strength\" method=\"POST\" id=\"pass_form\">\n");
      out.write("    <label>Enter a password</label>\n");
      out.write("    <input type=\"password\" name=\"pass\" id=\"pass\" />\n");
      out.write("    <span id=\"passstrength\"></span>\n");
      out.write("</form>\n");
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
