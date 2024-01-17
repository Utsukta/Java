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
public class Servlet2 extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        response.setContentType("text/html");
        out.println("<!Doctype>");
        out.println("<html>");
        out.println("<body>");
//        String username=request.getParameter("login");
//        out.println("<h1>Hello,"+username+"Welcome back to my Website</h1>");
        Cookie c[]=request.getCookies();
        boolean f=false;
        String name="";
        if(c==null){
            out.println("<h1>You are new user</h1>");
            
        }
        else
        {
            for(Cookie i:c)
            {
                name=i.getName();
                System.out.println(name);
                
                
              
                
                if(name.equals("userloginname")){
                f=true;
                name=i.getValue();
                
            }
                
            }
            if(f){
                
                out.print("<h1>Hello,"+name+"Weclome to my website</h1>");
                
            }
            else{
                out.print("<h1>You are new use rgo back to my website and login</h1>");
                
            }

                
            
        }
        
       
        out.println("</body>");
        out.println("</html>");

        
        
        
    }

  
  

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
