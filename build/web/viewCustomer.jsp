<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import ="java.sql.*" %>
<html>
<head>
<title>View Image Page</title>
</head>
<body>
<table width="100%" border="0">
<!-- main content -->
<%

try
{
 ResultSet rs;
 Statement stmt;
 
        
             Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cab","root", "");
         stmt=con.createStatement();
rs=stmt.executeQuery("select ph from upload");
 
while(rs.next())
{
%>
<table width="70%" height="160" border="1" align="center">
<tr>
<!-- Mention Directory where your images has been saved-->
 
<td><img src="uploads/<%=rs.getString("ph") %>" width="115" height="128" /></td>
</tr>
</table>
<%
}
}
catch(Exception e)
{
out.print(""+e.getMessage());
}
%>
 
</table>
</body>
</html>
<pre>