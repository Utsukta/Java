
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
public class NewClass extends JFrame implements ActionListener {
    
    NewClass(){
        
        setTitle("j wxe");
        setSize(300,300);
        setVisible(true);
        JButton b1= new JButton("click");
        b1.addActionListener(this);
        b1.setBounds(30,30,100,100);
        setLayout(null);
        add(b1);
       
        
    }
    
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(rootPane, "You clicked the button");
        
        
        
        
        
        
        
    }
    
    public static void main(String args[]){
        NewClass al= new NewClass();
    }
    
}
