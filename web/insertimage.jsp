<%-- 
    Document   : insertimage
    Created on : Jul 10, 2016, 12:57:52 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<%@ page import="org.apache.commons.fileupload.servlet.ServletFileUpload" %>
<%@ page import="org.apache.commons.fileupload.disk.DiskFileItemFactory"%>
<%@ page import="org.apache.commons.fileupload.*"%>
<%@ page import="java.util.*, java.io.*" %>
<%@ page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="java.io.File"%>


 
<%
try
{
   
             Statement stmt;
             ResultSet rs;
        
             Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
         stmt=con.createStatement();
//String ImageFile="";
String itemName = "";
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
/*
if(name.equals("imagefile"))
{
ImageFile=value;
}
 */
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
stmt.executeUpdate("insert into upload(ph) values ('"+itemName+"')");
 
}
catch(Exception el)
{
out.println("Inserting error"+el.getMessage());
}
}
}
catch (Exception e){
out.println(e.getMessage());
}
%>