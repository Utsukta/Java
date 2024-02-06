/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



/**
 *
 * @author utsuktakhatri
 */
public class Cookie1 extends HttpServlet {

    
   

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out;
        response.setContentType("text/html");
        out=response.getWriter();
        String username=request.getParameter("name");
        //create cookie
        Cookie c= new Cookie("Username",username);
        response.addCookie(c);
        
        
        out.println(username);
//        out.println("<html>");
//        out.println("<body>");
        out.println("<a href='Cookie2'>NextPage+</a>");

       
        
        
        
                
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
