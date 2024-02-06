<%-- 
    Document   : newjsp1
    Created on : Feb 5, 2024, 2:27:05 PM
    Author     : utsuktakhatri
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<%      Cookie[] c2 = request.getCookies();
        for(int i = 0; i < c2.length; i++) { 
            out.print("<p>"+c2[i].getName()+"   "+ c2[i].getValue()+"</p>");
        }     
%> 
        
    </body>
</html>
