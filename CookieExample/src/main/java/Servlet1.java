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
public class Servlet1 extends HttpServlet {


    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.println("<!Doctype>");
        out.println("<html>");
        out.println("<body>");
        String name=request.getParameter("login");
        out.println("<h1>Hello,"+name+"Welcome to my Website</h1>");
        out.println("<h1><a  href='Servlet2'>Go to Servlet2</a></h1>");
        Cookie c= new Cookie("userloginname", name); //creare cookie
        response.addCookie(c);//add cookie
        out.println("</body>");
        out.println("</html>");
        
        
        
    }

    
  

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
