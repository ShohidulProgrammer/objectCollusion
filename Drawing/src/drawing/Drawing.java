/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author GUB_IT
 */
public class Drawing 
{
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        MyDrawPanel draw=new MyDrawPanel();
        frame.getContentPane().add(draw);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
class MyDrawPanel extends JPanel
{
    public void paintComponent(Graphics g)
    {
        g.setColor(Color.RED);
        g.drawLine(0, 0, 200, 200);
        //g.fillRect(0,0,this.getWidth(),this.getHeight());
       // g.setColor(Color.GREEN);
        //g.fillOval(0,0,40,40);
    }
}
