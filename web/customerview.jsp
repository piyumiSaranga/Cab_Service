<%-- 
    Document   : customerview
    Created on : Jul 2, 2016, 9:39:46 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.sql.*" %>
<html>
<body bgcolor="Yellow">
  <table border="1" width="30%" height="30%">
  <tr><th><font color='Red'>EMP ID</font></th><th><font color='Red'>EMP NAME</font></th><th><font color='Red'>SALARY</font></th></tr>
<%
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost/cab","root","");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select *  from booking");
  while(rs.next())
  {
      String EmployeeId=rs.getString("username");
     Date EmployeeName=rs.getDate("checkInDate");
     Date Employee=rs.getDate("checkOutDate");
  %>
<tr>
<td><b><font color='#663300'><%=EmployeeId%></font></b></td>
<td><b><font color='#663300'><%=EmployeeName%></font></b></td>
<td><b><font color='#663300'><%=Employee%></font></b></td>
</tr>
<%
  }
 %>
 </table>
     </body>
</html>
