/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

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
public class Max extends HttpServlet {


   
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int n1=0,n2=0;
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        n1=Integer.parseInt(request.getParameter("n1"));
        n2=Integer.parseInt(request.getParameter("n2"));
        if(n1>n2){
            out.println("n1="+n1+"is max number");
        }
        else{
            out.println("n2="+n2+" is max number");
        }
        
        
        
        
        
        
       
    }

  
   
}
