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
public class NewServlet extends HttpServlet {
    
    PrintWriter out;
    
    @Override
    public void init(){}
    

  
 



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        out=response.getWriter();

        String name =request.getParameter("email");
        int no1=Integer.parseInt(request.getParameter("number1"));
        int no2=Integer.parseInt(request.getParameter("number2"));
        if(no1>no2){
            out.print(no1+"is greater");
            
            
        }
        else if(no2>no1) {
            out.print(no2+"is greater");
            
        }
        else{
            out.print("is equal");
        }
        out.print(name);
       
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
