/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author utsuktakhatri
 */
public class NewServlet extends HttpServlet {
    
    PrintWriter out;
    String college;
    String nameconfig;
    String namecontext;

    
//   
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        
        out=response.getWriter();  
        out.print(request.getMethod());
        out.print(request.getContextPath());
        out.print(request.getServletPath());
        out.print(request.getQueryString());
        
//        
    //creating ServletContext object  
    ServletContext context=getServletContext();  
    //Getting the value of the initialization parameter and printing it  
    college=context.getInitParameter("name"); 
    
    ServletConfig config=getServletConfig();
    String namee=config.getInitParameter("name");
    String a= namee+college;
    
//   
    namecontext=nameconfig+college;
    out.println(namee+college+"Length is"+a.length()); 
        
        out=response.getWriter();
   
        

        out.print(nameconfig );
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
