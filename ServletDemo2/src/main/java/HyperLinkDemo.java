/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletConfig;
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
public class HyperLinkDemo extends HttpServlet {
    String msg="";
    PrintWriter out;
    @Override
    public void init(ServletConfig config) throws ServletException{
        msg="Hello world! My first servlet program";
    }
     
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        out=response.getWriter();
        out.println("<h1>"+msg+"<h1>");
        out.println("<h1>"+"Hello there"+"<h1>");
        
        
    }
    public void destroy(){
        out.close();
    }

   
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//       
//    }
//
//   
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>

}
