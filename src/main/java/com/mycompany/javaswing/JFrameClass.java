
package com.mycompany.javaswing;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.net.URL;
import javax.swing.JFrame;


public class JFrameClass {
    
    public void initializingJFrame(){
    
        
       // creating new components using java swing library
       
    JFrame jframe = new JFrame(); //Creating a new JFrame
    jframe.setSize(500,600); //sets the x dimension and y dimensions to the jframe
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits out the application
    
    //there are another ways to write set default close operation
    
    /*jframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    jframe.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);*/
    
    jframe.setTitle("This is a window using java swing library"); // puts a tittle in the window
    jframe.setVisible(true); // making jframe visible
    
    jframe.setResizable(false);// prevent jframe from being resizable
    
    // this was the first method I´ve tried
    
    /*ImageIcon image = new ImageIcon("Peggle Nights.icon");
    jframe.setIconImage(image.getImage());*/
    
    //trying another method with url sources
    
    /*URL iconURL = getClass().getResource
        ("/home/u13c11/NetBeansProjects/javaSwing/src/main/java/com/mycompany/sources/dig.png");
        ImageIcon icon = new ImageIcon(iconURL);
        jframe.setIconImage(icon.getImage());*/
        
        JFrame.setDefaultLookAndFeelDecorated(true);
    
        jframe.getContentPane().setBackground(new Color(255,0,0)); // paiting the backgroud of red
        
        
    
    
    
        
    }
    
    public static void main(String[] args) {
        
        JFrameClass frame = new JFrameClass();
        frame.initializingJFrame();
    }
}
