package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <head>\n");
      out.write("    <script type=\"text/javascript\" src=\"https://www.gstatic.com/charts/loader.js\"></script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("      google.charts.load('current', {'packages':['corechart']});\n");
      out.write("      google.charts.setOnLoadCallback(drawChart);\n");
      out.write("      function drawChart() {\n");
      out.write("\n");
      out.write("        var data = google.visualization.arrayToDataTable([\n");
      out.write("          ['Task', 'Hours per Day'],\n");
      out.write("          ['Work',     11],\n");
      out.write("          ['Eat',      2],\n");
      out.write("          ['Commute',  2],\n");
      out.write("          ['Watch TV', 2],\n");
      out.write("          ['Sleep',    7]\n");
      out.write("        ]);\n");
      out.write("\n");
      out.write("        var options = {\n");
      out.write("          title: 'My Daily Activities'\n");
      out.write("        };\n");
      out.write("\n");
      out.write("        var chart = new google.visualization.PieChart(document.getElementById('piechart'));\n");
      out.write("\n");
      out.write("        chart.draw(data, options);\n");
      out.write("      }\n");
      out.write("    </script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div id=\"piechart\" style=\"width: 900px; height: 500px;\"></div>\n");
      out.write("  </body>\n");
      out.write("</html>");
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
