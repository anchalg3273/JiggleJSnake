/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package snakegame;
import javax.swing.*;

/**
 *
 * @author arpit
 */
public class SnakeGame extends JFrame {
    SnakeGame() {//class ka object banate hi class ka constructor call hota hai
        super("Snake Game");     
        add(new Board());
        pack();
        
       
        setLocationRelativeTo(null);//screen ke acc. centre mei la dega
        setResizable(false); 
        
        
        
    }
        

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);//anonyms object
        
    }
    
}
