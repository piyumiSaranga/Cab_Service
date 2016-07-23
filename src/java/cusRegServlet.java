

import java.io.IOException;

import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Blob;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.*;
import java.util.*;
import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.io.File;


@WebServlet("/cusRegServlet")
@MultipartConfig(maxFileSize = 16177215)  
public class cusRegServlet extends HttpServlet {

    Connection conn;
    ResultSet res;
    Statement stmt;
    String fname,photo;
    String firstName,lastName,street1,street2,city,country,mobileNo,homeNo,userName,email,password,repassword,query,ImageFile,itemName;
    DatabaseConnection dbconn;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            //fname=request.getParameter("fname");
            //photo=request.getParameter("imagefile");
               
        
        
        dbconn=new DatabaseConnection();
        conn=dbconn.setConnection();
     
      ImageFile="";
 itemName = "";
 firstName="";
 lastName="";
 street1="";
 street2="";
 city="";
 country="";
 mobileNo="";
 homeNo="";
 userName="";
 email="";
 password="";
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
if(name.equals("photo"))
{
ImageFile=value;
}
else if(item.getFieldName().equals("firstName"))
{
    firstName=item.getString();
}
else if(item.getFieldName().equals("lName"))
{
    lastName=item.getString();
}
else if(item.getFieldName().equals("street1"))
{
    street1=item.getString();
}
else if(item.getFieldName().equals("street2"))
{
    street2=item.getString();
}
else if(item.getFieldName().equals("city"))
{
    city=item.getString();
}
else if(item.getFieldName().equals("contry"))
{
    country=item.getString();
}
else if(item.getFieldName().equals("mobileNo"))
{
    mobileNo=item.getString();
}
else if(item.getFieldName().equals("homeNo"))
{
    homeNo=item.getString();
}
else if(item.getFieldName().equals("username"))
{
    userName=item.getString();
}
else if(item.getFieldName().equals("email"))
{
    email=item.getString();
}
else if(item.getFieldName().equals("password"))
{
    password=item.getString();
}
 
}
else
{
try
{
itemName = item.getName();
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

    /*
    
    firstName=request.getParameter("firstName");
        lastName=request.getParameter("lName");
        street1=request.getParameter("street1");
        street2=request.getParameter("street2");
        city=request.getParameter("city");
        country=request.getParameter("contry");
        mobileNo=request.getParameter("mobileNo");
        homeNo=request.getParameter("homeNo");
        userName=request.getParameter("username");
        email=request.getParameter("email");
        password=request.getParameter("password");
        repassword=request.getParameter("rePassword");
    */
    stmt=conn.createStatement();
   //stmt.executeUpdate("insert into upload values ('"+fname+"','"+itemName+"')");
stmt.executeUpdate("INSERT INTO  customer VALUES(default,'Customer','"+firstName+"','"+lastName+"','"+street1+"','"+street2+"','"+city+"','"+country+"','"+mobileNo+"','"+homeNo+"','"+userName+"','"+email+"','"+password+"','"+itemName+"')");
 
}
catch(Exception el)
{
out.println("Inserting error"+el.getMessage());
}
}
}
    }
              
                  //query="INSERT INTO  customer VALUES('"+firstName+"','"+lastName+"','"+street1+"','"+street2+"','"+city+"','"+country+"')";
                

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
