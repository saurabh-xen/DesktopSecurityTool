
import javax.swing.*;
public class View extends JFrame implements Runnable {
    JLabel L1;
    int i=0;
    Thread t1;
    public View()
    {
         System.out.println("working");
        setVisible(true);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        L1 = new JLabel();
        getContentPane().add(L1);
        t1 = new Thread(this);
        t1.start();
        
    }        
        
    
    public void run()
    {
        for(;;)
        {
            try{
                System.out.println("working");
                ImageIcon ico = new ImageIcon("E:\\My Folder\\"+i+".jpg");
                L1.setIcon(ico);
                i++;
                t1.sleep(400);
                
                
            }
            catch(Exception ex)
            {
                
            }
        }
    } 
   
    public  static void main(String args[])
    {
        View vr = new View();
    }
    

//shell:startup
}