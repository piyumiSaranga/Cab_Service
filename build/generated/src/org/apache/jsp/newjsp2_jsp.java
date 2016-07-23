package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class newjsp2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function() {\n");
      out.write("    $(\".flip\").click(function() {\n");
      out.write("        $(this).parent().nextAll('#panel').first().toggle('slow');\n");
      out.write("    });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write(" \n");
      out.write("<style>\n");
      out.write("#panel, #flip {\n");
      out.write("    padding: 5px;\n");
      out.write("    text-align: center;\n");
      out.write("    background-color: #e5eecc;\n");
      out.write("    border: solid 1px #c3c3c3;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#panel {\n");
      out.write("    padding: 50px;\n");
      out.write("    display: none;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<p><a class=\"toggle-trigger\">Click to toggle</a><p>\n");
      out.write("<div class=\"toggle-wrap\">\n");
      out.write("    <div class=\"style-single\">\n");
      out.write("        Random Text\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<p><a class=\"toggle-trigger\">Click to toggle 2</a><p>\n");
      out.write("<div class=\"toggle-wrap\">\n");
      out.write("    <div class=\"style-single\">\n");
      out.write("        This doesn't work :(\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<p><a class=\"flip\">Click to slide down panel</a></p>\n");
      out.write("<div id=\"panel\">\n");
      out.write("    <div class=\"yu\">\n");
      out.write("    Hello world!</div>\n");
      out.write("</div>\n");
      out.write("<p><a class=\"flip\">Click to slide down panel</a></p>\n");
      out.write("<div id=\"panel\">\n");
      out.write("    <div class=\"yu\">\n");
      out.write("    Hello world1!</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
