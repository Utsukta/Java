<%-- 
    Document   : newjsp
    Created on : Feb 5, 2024, 1:39:31 PM
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
       
     
       <% 
String username=request.getParameter("name");
Cookie c= new Cookie("name",username);
response.addCookie(c);
out.println(username);

       %>
       <a href="newjsp1.jsp">newpage</a>
    </body>
</html>
