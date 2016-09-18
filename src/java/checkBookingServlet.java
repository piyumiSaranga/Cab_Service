

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author Saranga
 */
public class checkBookingServlet extends HttpServlet {
 Connection conn;
 ResultSet res;
 Statement stmt;
 String checkInDate,checkOutDate;
 String query;
 DatabaseConnection dbconn;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            checkInDate=request.getParameter("checkIn");
            checkOutDate=request.getParameter("checkOut");
            HttpSession session=request.getSession();
            
            session.setAttribute("dateIn",checkInDate);
            session.setAttribute("dateOut",checkOutDate);
            query="SELECT username FROM booking WHERE checkInDate BETWEEN '"+checkInDate+"' AND '"+checkOutDate+"'";
            dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            stmt=conn.createStatement();
           res=dbconn.getResult(query, conn);
            //HttpSession session=request.getSession();
            
            //session.setAttribute("dateIn",checkInDate);
            //session.setAttribute("dateOut",checkOutDate); 
            if(res.next())
            {
               
              RequestDispatcher rd=request.getRequestDispatcher("/customerbookingview.jsp");
                rd.forward(request, response);  
            } 
             else
            {
                 RequestDispatcher rd=request.getRequestDispatcher("/checkBooking.jsp");
                rd.forward(request, response); 
            }
            
        }
        
        catch(Exception e)
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
