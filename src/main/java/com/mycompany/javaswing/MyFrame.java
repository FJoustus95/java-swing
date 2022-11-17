package com.mycompany.javaswing;


import javax.swing.JFrame;
import java.awt.*;

// it´s important to take into account jframe extends directly

public class MyFrame extends JFrame {
  
    MyFrame(){
    
    this.setSize(500,600); //sets the x dimension and y dimensions to the this
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out the application
    this.setTitle("This is a window using java swing library"); // puts a tittle in the window
    this.setVisible(true); // making this visible
    this.setResizable(false);// prevent this from being resizable
    
   
        
   JFrame.setDefaultLookAndFeelDecorated(true);
   this.getContentPane().setBackground(new Color(255,0,0)); // paiting the backgroud of red
        
           
        
        
    }
   
}
