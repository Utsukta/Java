
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author utsuktakhatri
 */
public class NewClass extends JFrame {
    NewClass(){
        setTitle(" ue");
        setVisible(true);
        setSize(500,200);
        setLayout(new FlowLayout(FlowLayout.LEFT));
     
        JButton b1= new JButton("Button 1");
        JButton b2= new JButton("Button 1");
        JButton b3= new JButton("Button 1");
        JButton b4= new JButton("Button 1");
        JButton b5= new JButton("Button 1");
        JButton b6= new JButton("Button 1");
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        
        
        
        
    }
    
    public static void main(String[] args){
        NewClass nc= new NewClass();
    }
    
}
