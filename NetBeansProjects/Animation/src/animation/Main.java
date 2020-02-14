package animation;
import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Administrator
 */
public class Main
{
    int x=0;
    int y=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Main gui=new Main();
        gui.go();
    }
    public void go()
    {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        MyDrawPanel draw=new MyDrawPanel();
        frame.getContentPane().add(draw);
        frame.setSize(300,300);
        frame.setVisible(true);

        for(int i=0;i<250;i++)
        {
            x++;
            draw.repaint();
            try{
            Thread.sleep(10);
            }catch (Exception ex){}
        }
        for(int i=0;i<230;i++)
        {
            y++;
            draw.repaint();
            try{
            Thread.sleep(10);
            }catch (Exception ex){}
        }
        for(int i=0;i<250;i++)
        {
            x--;
            draw.repaint();
            try{
            Thread.sleep(10);
            }catch (Exception ex){}
        }
        for(int i=0;i<230;i++)
        {
            y--;
            draw.repaint();
            try{
            Thread.sleep(10);
            }catch (Exception ex){}
        }
        x=x+21;
        for(int i=0;i<230;i++)
        {
            x++;
            y++;
            draw.repaint();
            try{
            Thread.sleep(10);
            }catch (Exception ex){}
        }
    }
    class MyDrawPanel extends JPanel
    {
        public void paintComponent(Graphics g)
        {
            g.setColor(Color.WHITE);
            g.fillRect(0,0,this.getWidth(),this.getHeight());
            g.setColor(Color.GREEN);
            g.fillRect(x, y, 40, 40);
            g.drawLine(10, 10, 200, 200);
        }
    }
}
