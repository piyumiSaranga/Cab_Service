<%-- 
    Document   : upload
    Created on : May 26, 2016, 7:10:48 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="POST" action="insertimage.jsp" enctype="multipart/form-data">
          
            file<input type="file" name="imagefile" id="file">
            <input type="submit" value="submit" name="submit">
        </form>
    </body>
</html>
