

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class driverServlet extends HttpServlet {
    Connection conn;
    ResultSet res;
    Statement stmt;
    DatabaseConnection dbconn;
    String firstname,lastName,dateofbirth,nic,mobileNo,adrress,drivinglicenseNo,username,email,password,rePassword,query;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            firstname=request.getParameter("firstName");
            lastName=request.getParameter("lName");
            dateofbirth=request.getParameter("dob");
            nic=request.getParameter("nic");
            mobileNo=request.getParameter("tel");
            adrress=request.getParameter("address");
            drivinglicenseNo=request.getParameter("license");
            username=request.getParameter("username");
            email=request.getParameter("email");
            password=request.getParameter("password");
           
            
            dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            stmt=conn.createStatement();
             query="INSERT INTO driver VALUES(default,'Driver',"+firstname+"','"+lastName+"','"+dateofbirth+"','"+nic+"','"+mobileNo+"','"+adrress+"','"+drivinglicenseNo+"','"+username+"','"+email+"','"+password+"')";
            
             int i=stmt.executeUpdate(query);
            if(i>0)
            {
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('successfully registered');");  
                out.println("</script>");
        
        }
            else
            {
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('Error in registering');");  
                out.println("</script>");
            }
        }
        catch(SQLException e)
         {
              
         }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
