

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.*;
import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class addDriverImageServlet extends HttpServlet {
    Connection conn;
    ResultSet res;
    Statement stmt;
    DatabaseConnection dbconn;
    String driverNic,vehicleType,ImageFile,itemName;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            dbconn=new DatabaseConnection();
            conn=dbconn.setConnection();
            ImageFile="";
            itemName = "";
            driverNic="";
            vehicleType="";
            boolean isMultipart = ServletFileUpload.isMultipartContent(request);
if (!isMultipart)
{
}
else
{
FileItemFactory factory = new DiskFileItemFactory();
ServletFileUpload upload = new ServletFileUpload(factory);
List items = null;
try
{
items = upload.parseRequest(request);
}
catch (FileUploadException e)
{
e.getMessage();
}
 
Iterator itr = items.iterator();
while (itr.hasNext())
{
FileItem item = (FileItem) itr.next();
if (item.isFormField())
{
String name = item.getFieldName();

String value = item.getString();


if(name.equals("driverImage"))
{
ImageFile=value;
}
 

 if(item.getFieldName().equals("driverNic"))
{
    driverNic=item.getString();
}
 else if(item.getFieldName().equals("vehicletype"))
{
    vehicleType=item.getString();
}
  

 
}
else
{
try
{

itemName= item.getName();
File savedFile = new File("C:\\Users\\Saranga\\Documents\\NetBeansProjects\\CabService\\web\\uploads\\"+itemName);
item.write(savedFile);

}
catch (Exception e)
{
out.println("Error"+e.getMessage());
}
}
}
try
{ 
 stmt=conn.createStatement();
 stmt.executeUpdate("INSERT INTO  driverimages VALUES(default,'"+driverNic+"','"+vehicleType+"','"+itemName+"')");
 
}
catch(Exception el)
{
out.println("Inserting error"+el.getMessage());
}
}
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
