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
public class Cookie2 extends HttpServlet {

    
 
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out;
        response.setContentType("text/html");
        out=response.getWriter();
        Cookie c[]= request.getCookies();
        String name="";
        boolean f=false;
        if(c==null){
            out.println("Welcome new user");
        }
        else{
            for(Cookie i :c){
               name=i.getName();
                if(name.equals("Username")){
                    f=true;
                    name=i.getValue();
                }
            }
        }
        if(f){
            out.println("Welcome"+name);
        }
        else{
            out.println("Welcome new user ");
        }
        
      
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
