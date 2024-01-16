/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.RequestDispatcher;
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
public class validate extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }
    
        @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out =response.getWriter();
        RequestDispatcher rd;
        System.out.println("Done1");
        String login=request.getParameter("login");
        String pwd=request.getParameter("pwd");
        System.out.println("Done2");
        if(login.equals("java") && pwd.equals("servlet")){
            rd=request.getRequestDispatcher("FwdDemo");
            rd.forward(request, response);
        }
        else{
            out.println("<p><h1> Incorrect LogIn Id/Password</h1></p>");
            rd= request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
        System.out.println("Done3");
        
       
    }

   
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//    }
   

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
