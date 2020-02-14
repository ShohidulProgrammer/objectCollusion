package animation;

/*
 *
 */


import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author md shoikat
 */
public class Coliution
{
    int x=0;
    int y=0;
    int x1=230;
    int y1=0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
    	Coliution gui=new Coliution();
        gui.go();
    }
    public void go()
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        MyDrawPanel draw=new MyDrawPanel();
        frame.getContentPane().add(draw);
        frame.setSize(300,300);
        frame.setTitle("Coliution by IT HOME");
        frame.setLocationRelativeTo(frame);
        frame.setVisible(true);

        while(true)
        {
            for(int i=0;i<96;i++)
            {
                x++;
                x1--;
                draw.repaint();
                try{
                Thread.sleep(5);
                }catch (Exception ex){}
            }
            for(int i=0;i<96;i++)
            {
                x--;
                x1++;
                draw.repaint();
                try{
                Thread.sleep(5);
                }catch (Exception ex){}
            }
        }
        
    }
    class MyDrawPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(Color.green);
         
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.RED);
            g.fillOval(x,y,60,80);
            g.setColor(Color.BLUE);
            g.fillOval(x1,y1,40,40);
        }
    }
}
