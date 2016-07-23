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



public class vehicleReservServlet extends HttpServlet {
    Connection conn;
    ResultSet res;
    Statement stmt;
    String username,checkInDate,checkOutDate,checkInTime,checkOutTime,start,ending,vehicleId,driverId,query,query1;
    DatabaseConnection dbconn;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /*
            
           HttpSession session=request.getSession();
           session.setAttribute("checkdateIn",checkInDate);
           session.setAttribute("checkdateOut",checkOutDate); 
           session.setAttribute("vehicleId",vehicleId); 
           session.setAttribute("driverId",driverId); 
            */
            
           
           username=request.getParameter("username");
           checkInDate=request.getParameter("checkIn");
           checkOutDate=request.getParameter("checkOut");
           checkInTime=request.getParameter("checkInTime");
           checkOutTime=request.getParameter("checkOutTime");
           start=request.getParameter("startingPlace");
           ending=request.getParameter("endingPlace");
           vehicleId=request.getParameter("vehicle");
           driverId=request.getParameter("driver");
           
           dbconn=new DatabaseConnection();
           conn=dbconn.setConnection();
           stmt=conn.createStatement();
           if (request.getParameter("availability") != null) {
    query1="SELECT checkInDate,checkOutDate FROM booking WHERE vehicleId='"+vehicleId+"' AND driverId='"+driverId+"'";
    res=dbconn.getResult(query1, conn); 
    if(res.next())
            {
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('driver or vehicle is already book');");  
               out.println("location='vehicleReserv.jsp';");
                out.println("</script>");
                
              //RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
              //rd.forward(request, response);  
            } 
    else
    {
        RequestDispatcher rd=request.getRequestDispatcher("/vehicleReserv.jsp");
        rd.forward(request, response);  
    }
} else if (request.getParameter("booking") != null) {
    query="INSERT INTO booking VALUES(default,'"+username+"','"+checkInDate+"','"+checkOutDate+"','"+checkInTime+"','"+checkOutTime+"','"+start+"','"+ending+"','"+vehicleId+"','"+driverId+"','Book')";
    int i=stmt.executeUpdate(query);
            if(i>0)
            {
                response.setContentType("text/html");  
                out.println("<script type=\"text/javascript\">");  
                out.println("alert('Booking is successfull');");  
                out.println("</script>");
        
        }
            else{
                RequestDispatcher rd=request.getRequestDispatcher("/vehicleReserv.jsp");
                rd.forward(request, response);  
                
            }
}
          

          
        }catch(Exception e)
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
