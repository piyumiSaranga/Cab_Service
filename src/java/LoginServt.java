

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


public class LoginServt extends HttpServlet {
 Connection conn;
    ResultSet res;
    String userName, password,query;
    DatabaseConnection dbconn;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           userName=request.getParameter("user");
            password=request.getParameter("pwd");
            query="SELECT * FROM customer where username='"+userName+"' AND password='"+password+"'";
            dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            res=dbconn.getResult(query, conn); 
            HttpSession session=request.getSession();
            session.setAttribute("user",userName);
            session.setAttribute("userRole","Customer");
            if(res.next())
            {
              RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
                rd.forward(request, response);  
            } 
            else
            {
                 RequestDispatcher rd=request.getRequestDispatcher("/login.jsp");
                rd.forward(request, response); 
            }
        } catch (Exception e) {
        
     }
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
