/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gridbaglayoutt;

import java.awt.Frame;
import java.awt.*;

/**
 *
 * @author utsuktakhatri
 */
public class Gridbaglayoutt extends Frame {
    Gridbaglayoutt()
    {
        GridBagConstraints gbc= new GridBagConstraints();
        setVisible(true);
        setSize(500,200);
        
        setTitle("j wxe");
        setLayout(new GridBagLayout());
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.weightx=0.5;
        gbc.weighty=0;
        gbc.fill=GridBagConstraints.HORIZONTAL;
        
        Button b1= new Button("Button1");
        add(b1,gbc);
        
        gbc.gridx=1;
        gbc.gridy=0;
        
        Button b2= new Button("Button2");
        add(b2,gbc);
        
        gbc.gridx=2;
        gbc.gridy=0;
        Button b3= new Button("Button3");
        add(b3,gbc);
        
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=3;
        gbc.insets=new Insets(5,5,5,5);
        Button b4= new Button("Button4");
        add(b4,gbc);
        
        gbc.gridx=0;
        gbc.gridy=2;
        gbc.gridwidth=2;
        gbc.insets=new Insets(5,5,5,5);
        Button b5= new Button("Button5");
        add(b5,gbc);
    }
    public static void main(String[] args) {
        Gridbaglayoutt gbl= new Gridbaglayoutt();
        
    }
        
    }

