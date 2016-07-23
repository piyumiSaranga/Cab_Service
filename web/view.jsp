<%-- 
    Document   : view
    Created on : Jun 15, 2016, 4:35:22 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.awt.image.*"%>
<%@ page import="java.io.*"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.servlet.*"%>
<%@ page import="javax.servlet.http.*"%>
<%@ page import="java.io.File"%>
<%@ page import="javax.imageio.ImageIO"%>
<%@ page import="java.awt.image.BufferedImage,java.util.*"%>
<%@ page import="java.awt.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        String userName=(String)session.getAttribute("user");
        String filepath="C:/User/Saranga/Documents/NetBeansProjects/CabService/web/uploads";
        javax.servlet.http.HttpServletResponse res=null;;
        int returnValue = 0;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        InputStream in = null;
        OutputStream os = null;
        Blob blob = null;
        String text;
        text=request.getParameter("text");
        %>
        <sql:setDataSource var="dbconn" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost/cab" user="root" password=""></sql:setDataSource>
        <sql:query dataSource="${dbconn}" var="result" sql="SELECT * FROM customer where username=?">
            <sql:param value="${user}"/>
            
        </sql:query>
            <table border="1">
        
            <c:forEach var="col" items="${result.rows}" >
                <tr>
                    <td>First Name</td> <td><c:out value="${col.fname}"></c:out> </td>
                </tr>
                <tr>
                     <td>Last Name</td><td><c:out value="${col.lname}"></c:out> </td>
                </tr>
                <tr>
                   <td>Street 1</td> <td><c:out value="${col.street1}"></c:out> </td>
                </tr>
                <tr>
                   <td>Street 2</td> <td><c:out value="${col.street2}"></c:out> </td>
                </tr>
                <tr>
                     <td>City</td><td><c:out value="${col.city}"></c:out> </td>
                </tr>
                <tr>
                    <td>Mobile Number</td><td><c:out value="${col.mobileNo}"></c:out> </td>
                </tr>
                <tr>
                     <td>Home Number</td><td><c:out value="${col.homeNo}"></c:out> </td>
                </tr>
                <tr>
                    <td>Username</td><td><c:out value="${col.username}"></c:out> </td>
                </tr>
                <tr>
                       <td>Email</td><td><c:out value="${col.email}"></c:out> </td>
                </tr>
                <tr>
                    <td>Password</td><td><c:out value="${col.password}"></c:out> </td>
                </tr>
                <tr>
                    <td>Photo</td><td><img src="uploads/<c:out value="${col.photo}"></c:out> "></td>
                </tr>
            </c:forEach> 
            </table>
    </body>
</html>
