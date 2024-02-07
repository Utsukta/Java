/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.focuseventtt;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author utsuktakhatri
 */
public class FocusEventtt extends JFrame implements FocusListener {
    JTextField t1;
    JTextField t2;
    
    
    
    FocusEventtt(){
          setTitle(" Focus Event");
        setVisible(true);
        setSize(500,200);
        t1= new JTextField(30);
        t2= new JTextField(30);
        setLayout(new FlowLayout());
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        add(t1);
        add(t2);
        
        
        
    
    }
    
    @Override

    public void focusGained(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.yellow);
        }
        if(e.getSource()==t2){
            t2.setBackground(Color.yellow);
        }
        
    }
    public void focusLost(FocusEvent e){
        if(e.getSource()==t1){
            t1.setBackground(Color.white);
        }
        if(e.getSource()==t2){
            t2.setBackground(Color.white);
        }
        
    }

    public static void main(String[] args) {
       FocusEventtt fe= new FocusEventtt();
    }
}
