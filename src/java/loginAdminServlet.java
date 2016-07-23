import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class loginAdminServlet extends HttpServlet {
    Connection conn;
    ResultSet res;
    String userName, password;
    DatabaseConnection dbconn;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            userName=request.getParameter("user");
            password=request.getParameter("pwd");
             dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            HttpSession session=request.getSession();
            session.setAttribute("user",userName);
            session.setAttribute("userRole","Admin");
            if("admin@gmail.com".equals(userName) && "admin".equals(password))
            {
                RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);  
            }
            else
            {
                RequestDispatcher rd=request.getRequestDispatcher("/loginAdmin.jsp");
                rd.forward(request, response); 
            }
        }catch (Exception e) {
        
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
