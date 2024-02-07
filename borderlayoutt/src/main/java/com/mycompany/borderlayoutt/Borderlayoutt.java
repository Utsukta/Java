/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.borderlayoutt;

import java.awt.Frame;
import java.awt.*;
import javax.swing.JButton;

/**
 *
 * @author utsuktakhatri
 */
public class Borderlayoutt extends Frame{
    Borderlayoutt(){
        setVisible(true);
        setTitle("Layout");
        setSize(500,500);
        setLayout(new BorderLayout());
        
        Button b1= new Button("Button 1");
        Button b2= new Button("Button 2");
        Button b3= new Button("Button 3");
        Button b4= new Button("Button 4");
        Button b5= new Button("Button 5");
     
        add(b1,BorderLayout.EAST);
        add(b2,BorderLayout.WEST);
        add(b3,BorderLayout.NORTH);
        add(b4,BorderLayout.SOUTH);
        add(b5,BorderLayout.CENTER);
        
        
        
        
        
    }

    public static void main(String[] args) {
        Borderlayoutt bl= new Borderlayoutt();
        
        
        
    }
}
