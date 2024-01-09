/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.moviedb;

/**
 *
 * @author utsuktakhatri
 */

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Moviedb extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4;
    JLabel l1, l2, l3, l4;
    JButton b1;
    JFrame jf;

    public Moviedb(){
        
//        setLocationRelativeTo(null);
//        setDefaultCloseRelation(JFrame.EXIT_ON_CLOSE);
        jf= new JFrame("Movie System");
        l1= new JLabel("Title");
        l2= new JLabel("Genre");
        l3= new JLabel("Length");
        l4= new JLabel("Language");
        t1= new JTextField(10);
        t2= new JTextField(10);
        t3= new JTextField(10);
        t4= new JTextField(10);
        b1= new JButton("Submit");
        jf.add(l1);
        jf.add(t1);
        jf.add(l2);
        jf.add(t2);
        jf.add(l3);
         jf.add(t3);
        jf.add(l4);
         jf.add(t4);
        jf.add(b1);
        jf.setSize(500,700);
        jf.setLayout(new FlowLayout());
        b1.addActionListener(this);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }   
    
    
    public static void main(String[] args) {
        new Moviedb();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        throw new UnsupportedOperationException("Not supported yet.");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Movie","root","");
                System.out.println("Connection Created");
                String sql="insert into language(id,name,genre,length,languages) values (?,?,?,?,?)";
                PreparedStatement ps=conn.prepareStatement(sql);
                ps.setInt(1,1);
                ps.setString(2,t1.getText());
                
                ps.setString(3,t2.getText());
                
                ps.setInt(4,Integer.parseInt(t3.getText()));
                

                ps.setString(5,t4.getText());
                System.out.println("Successfully");
                                

               
                ps.executeUpdate();
                conn.close();
                System.out.println("Inserted Successfully");
            
            
            
           
            
            
            
// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
                    
//            Logger.getLogger(Moviedb.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
