/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.servletdemo;

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
public class MyServlet extends HttpServlet {
    String msg="";
    PrintWriter out; //we can write in the web using this
    public void init() throws ServletException
    {
        msg="hello world:my first servlet program";
    }
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            response.setContentType("text/html1");
            out=response.getWriter();
            out.println(msg);
        }
        public void destroy(){
            out.close();
        }
    }

