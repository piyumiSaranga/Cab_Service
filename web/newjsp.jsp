<%-- 
    Document   : newjsp
    Created on : Jun 9, 2016, 6:21:04 PM
    Author     : Saranga
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery.cycle/3.0.3/jquery.cycle.all.js"></script>
  <script>
            
$(document).ready(function() { 
    // start slideshow 
    $('#slideshow').cycle({ 
        fx: 'curtainX';
        timeout:  2000;
        
    }); 
});

        </script>
    </head>
    <body>
        <h1>Hello World!</h1>
        <div id="slideshow">
    <img src="image1.jpg" width="1350" height="400"/>
    <img src="image2.jpg" width="1350" height="400"/>
    <img src="image3.jpg" width="1350" height="400"/>
</div>
    </body>
</html>
