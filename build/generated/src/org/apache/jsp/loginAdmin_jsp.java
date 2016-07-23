package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginAdmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"home.css\" type=\"text/css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("/*bottem*/\n");
      out.write("body{\n");
      out.write("           //background-image: url(\"sign.jpg\");\n");
      out.write("\n");
      out.write("}\n");
      out.write("#botbar{\n");
      out.write("\twidth:100%;\n");
      out.write("\theight:150px;\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:560px;\n");
      out.write("\tleft:0px;\n");
      out.write("\tz-index:0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bot{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:580px;\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("#set1{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:580px;\n");
      out.write("\tleft:225px;\n");
      out.write("\twidth:300px;\n");
      out.write("\tz-index:2;\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("#set2{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:580px;\n");
      out.write("\tleft:550px;\n");
      out.write("\twidth:300px;\n");
      out.write("\tz-index:2\n");
      out.write("\t}\n");
      out.write("\t\n");
      out.write("#set3{\n");
      out.write("\tposition:absolute;\n");
      out.write("\ttop:580px;\n");
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
      out.write("    </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t<div id=\"left\">\n");
      out.write("    \t\t<label>\n");
      out.write("            \tQCabs Taxi Service\n");
      out.write("            </label>\n");
      out.write("    \t</div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">    \n");
      out.write("        <div id=\"loginbox\" style=\"margin-top:50px;\" class=\"mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2\"> \n");
      out.write("             <div class=\"panel panel-info\" >\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <div class=\"panel-title\">Sign In</div>\n");
      out.write("                        <div style=\"float:right; font-size: 80%; position: relative; top:-10px\"><a href=\"#\">Forgot password?</a></div>\n");
      out.write("                    </div>     \n");
      out.write("\n");
      out.write("                    <div style=\"padding-top:30px\" class=\"panel-body\" >\n");
      out.write("\n");
      out.write("                        <div style=\"display:none\" id=\"login-alert\" class=\"alert alert-danger col-sm-12\"></div>\n");
      out.write("                            \n");
      out.write("                        <form id=\"loginform\" class=\"form-horizontal\"  role=\"form\" action=\"loginAdminServlet\" method=\"POST\">\n");
      out.write("                                    \n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-user\"></i></span>\n");
      out.write("                                        <input id=\"login-username\" type=\"text\" class=\"form-control\" name=\"user\" value=\"\" placeholder=\"Username\">                                        \n");
      out.write("                                    </div>\n");
      out.write("                                \n");
      out.write("                            <div style=\"margin-bottom: 25px\" class=\"input-group\">\n");
      out.write("                                        <span class=\"input-group-addon\"><i class=\"glyphicon glyphicon-lock\"></i></span>\n");
      out.write("                                        <input id=\"login-password\" type=\"password\" class=\"form-control\" name=\"pwd\" placeholder=\"password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("\n");
      out.write("                                \n");
      out.write("                            <div class=\"input-group\">\n");
      out.write("                                      <div class=\"checkbox\">\n");
      out.write("                                        <label>\n");
      out.write("                                          <input id=\"login-remember\" type=\"checkbox\" name=\"remember\" value=\"1\"> Remember me\n");
      out.write("                                        </label>\n");
      out.write("                                      </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div style=\"margin-top:10px\" class=\"form-group\">\n");
      out.write("                                    <!-- Button -->\n");
      out.write("\n");
      out.write("                                    <div class=\"col-sm-12 controls\">\n");
      out.write("                                        <button type=\"submit\" name=\"login\" class=\"btn btn-success\">Login</button>\n");
      out.write("                                     </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-md-12 control\">\n");
      out.write("                                        <div style=\"border-top: 1px solid#888; padding-top:15px; font-size:85%\" >\n");
      out.write("                                            Don't have an account! \n");
      out.write("                                        <a href=\"#\" >\n");
      out.write("                                            Sign Up Here\n");
      out.write("                                        </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>    \n");
      out.write("                            </form>     \n");
      out.write("                    </div>\n");
      out.write("             </div>\n");
      out.write("        </div>\n");
      out.write("      \n");
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
