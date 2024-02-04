/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.*;
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
    RequestDispatcher rd;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        out=response.getWriter();
        String Name=request.getParameter("username");
        String Password=request.getParameter("password");
        String Session=request.getParameter("session");
        if(Name.equals("A")&&Password.equals("123")){
            rd=request.getRequestDispatcher("fwd");
            rd.forward(request, response);
            
            
        }
        else{
            out.println("Incorrect");
             rd=request.getRequestDispatcher("index.html");
             rd.include(request, response);
            
        }
       
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
