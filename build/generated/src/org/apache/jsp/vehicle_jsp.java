package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class vehicle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <title>Vehicle Registration</title>\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div align=\"center\">\n");
      out.write("        <div id=\"login-form\">\n");
      out.write("            <form id=\"vehicleRegister\" onsubmit=\"return VehicleSubmitForm()\" method=\"POST\" action=\"vehicleServlet\" enctype=\"multipart/form-data\">\n");
      out.write("   <table align=\"center\" width=\"50%\" border=\"0\">\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"vehicleNo\" name=\"vehicleNo\" placeholder=\"Vehicle Number (**-****)\" </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><select id=\"vehicletype\" name=\"vehicletype\">\n");
      out.write("                   <option value=\"\">Select Vehicle Type</option>\n");
      out.write("                   <option value=\"Car\">Car</option>\n");
      out.write("                   <option value=\"Van\">Van</option>\n");
      out.write("                   <option value=\"Bus\">Bus</option>\n");
      out.write("               </select>\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"seats\" name=\"seats\" placeholder=\"No of Seats\"</td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td>A/C<input type=\"radio\" id=\"type\" name=\"type\" value=\"A/C\" onchange=\"showTextField();\">Non A/C<input type=\"radio\" id=\"type\" name=\"type\" value=\"Non A/C\" onchange=\"showTextField();\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"ACtype\" name=\"ACtype\" placeholder=\"A/C Type\"  </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><h3>Insurance Details </h3></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"date\" id=\"issueDate\" name=\"issueDate\" placeholder=\"Issue Date\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"date\" id=\"expireDate\" name=\"expireDate\" placeholder=\"Expire Date\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"owner\" name=\"owner\" placeholder=\"Owner's Name\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td>Company owned<input type=\"radio\" id=\"ownership\" name=\"ownership\" value=\"CO\">\n");
      out.write("               OutSourced<input type=\"radio\" id=\"ownership\" name=\"ownership\" value=\"OS\">\n");
      out.write("           </td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Owner Name\" onchange=\"showTextField();\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"address\" name=\"address\" placeholder=\"Address\" onchange=\"showTextField();\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"text\" id=\"tel\" name=\"tel\" placeholder=\"contact Number\" onchange=\"showTextField();\"></td>\n");
      out.write("           \n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("           <td><input type=\"file\" id=\"photo\" value=\"photo\"></td>\n");
      out.write("       </tr>\n");
      out.write("       <tr>\n");
      out.write("        <td><button type=\"submit\" name=\"submit\">Register</button>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("   </table>\n");
      out.write("            </form>\n");
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
