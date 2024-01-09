/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author utsuktakhatri
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
import java.sql.*;
public class CreateTable {
    
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            System.out.println("Connection Created");
            String qry = "Create table user(id int(15) primary key auto_increment,fname varchar(25) not null , lname varchar(20))";
//            String qry="Create table user(id int(15) primary key auto increment,fname varchar(25) not null, lname varchar(20))";
            Statement st=con.createStatement();
            st.execute(qry);
            System.out.println("Table created successfully");           
        }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e.toString());
            
        }
        
    }
    
}
