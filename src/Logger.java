import javax.swing.*;
        import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
public class Logger extends JFrame implements Runnable {
    JButton b1,b2;
    JPanel p1;
    Thread t1;
    int i;
    public Logger()
    {
       setVisible(true) ;
       setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new JPanel();
        b1 = new JButton("Start");
        b2 = new JButton("Stop");
        p1.add(b1);
        p1.add(b2);
        getContentPane().add(p1);
       b1.addActionListener(e->actionB1(e));
       b2.addActionListener(e->actionB2(e));
    
      
}
    
    public void actionB1(ActionEvent e)
    {
        t1 = new Thread(this);
        t1.start();
    }
    public void actionB2(ActionEvent e)
    {
        t1.stop();
    }
    public void run()
    {
        for(;;)
        {
            try
         //toolkit used for info of current os
            { Robot r = new Robot();
            BufferedImage img =
            r.createScreenCapture(new Rectangle(getToolkit().getScreenSize()));
                
                ImageIO.write(img,"jpg",new File("E:\\My Folder\\"+i+".jpg"));
                i++;
                t1.sleep(400);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
        }
    }
    
    public static void main(String args[])
    {
        Logger lg = new Logger();
    }
}