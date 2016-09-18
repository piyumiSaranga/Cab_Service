package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CusReg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title>Customer Registration</title>\n");
      out.write("        <!--<link rel=\"stylesheet\" href=\"CSS/displayDriverImage.css\">-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"home.css\" type=\"text/css\" />\n");
      out.write("        <script src=\"newjavascript.js\"></script>\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js\"></script>\n");
      out.write("        <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("        <style>\n");
      out.write("             \n");
      out.write("            .card{width:600px;float:right; background-color: #DDD;}\n");
      out.write("            .col-xs-2{width:440px;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"header\">\n");
      out.write("\t\t<div id=\"left\">\n");
      out.write("                    <label>\n");
      out.write("                    <img src=\"images/header.png\">\n");
      out.write("                    </label>\n");
      out.write("                    <label>\n");
      out.write("                        www.mycitycab.lk <br>\n");
      out.write("                        071 3 87 90 52\n");
      out.write("                    </label>\n");
      out.write("    \t</div>\n");
      out.write("           \n");
      out.write("               \n");
      out.write("           <div id=\"right\">\n");
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
      out.write("               </div>\n");
      out.write("           </div>\n");
      out.write("        </div>\n");
      out.write("        <hr>\n");
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
      out.write("             </ul>\n");
      out.write("        \n");
      out.write("                </div>\n");
      out.write("         </div>\n");
      out.write("        <hr>\n");
      out.write("        <div id=\"topic\">\n");
      out.write("    Create your Account here\n");
      out.write("        </div>\n");
      out.write("        <table>\n");
      out.write("            <tr><td>&nbsp;</td>\n");
      out.write("                <td>\n");
      out.write("        <div id=\"login-form\" class=\"mainbox col-md-6 col-md-offset-1 col-sm-3 col-sm-offset-2\">\n");
      out.write("<form  name=\"registration\" onsubmit=\"return submitForm()\" method=\"POST\" action=\"cusRegServlet\" enctype=\"multipart/form-data\">\n");
      out.write("  <div class=\"form-group row\">\n");
      out.write("      <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">First Name</label>\n");
      out.write("  \n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("    \n");
      out.write("      <input class=\"form-control\" type=\"text\"  id=\"fName\" name=\"firstName\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Last Name</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"text\"  id=\"lName\" name=\"lName\" required=\"\" >\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" <div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Street 1</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"text\" id=\"street1\" name=\"street1\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Street 2</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"text\" id=\"street2\" name=\"street2\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">City</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"text\"  id=\"city\" name=\"city\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>  \n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Mobile No</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"tel\"  id=\"mobileNo\" name=\"mobileNo\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div> \n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Home No</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"tel\"  id=\"homeNo\" name=\"homeNo\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Username</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"text\"  id=\"username\" name=\"username\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div> \n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Email</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"email\"  id=\"email\"  name=\"email\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Password</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"password\"  id=\"password\" onPaste=\"return false\" name=\"password\"  onclick=\"ValidatePassword();\" required=\"\">\n");
      out.write("      <small id=\"passwordHelpInline\" class=\"text-muted\">\n");
      out.write("      Must be 1-8 characters long.\n");
      out.write("    </small>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\">Re-password</label>\n");
      out.write("  <div class=\"col-xs-8\">\n");
      out.write("      <input class=\"form-control\" type=\"password\" id=\"rePassword\" onPaste=\"return false\" name=\"rePassword\" required=\"\">\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"form-group row\">\n");
      out.write("  <label for=\"example-text-input\" class=\"col-xs-2 col-form-label\"></label>\n");
      out.write("  <div class=\"col-xs-2\">\n");
      out.write("      <button type=\"submit\" class=\"btn btn-primary\" >SIGN ME UP</button>\n");
      out.write("      <a href=\"login.jsp\"><button type=\"button\" class=\"btn btn-link\"  ><h3>Sign In Here</h3></button></a>\n");
      out.write("  </div>\n");
      out.write("</div>    \n");
      out.write(" </form>\n");
      out.write("        </div>   \n");
      out.write("                </td></tr></table>\n");
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
