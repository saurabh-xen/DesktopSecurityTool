import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class MainForm extends JFrame{
    JMenuBar mBar;
    JMenu mFile,mHelp;
    JMenuItem mDesktop,mLogger,mNew,mExit,mHelp1,mAbout;
    JFrame j1;
    JPanel p1;
    public MainForm()
    {    j1 = new JFrame();
        setVisible(true);
        setSize(400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1 = new JPanel();
        
        mBar = new JMenuBar();
        mFile = new JMenu("File");
        mHelp = new JMenu("Help");
        mDesktop = new JMenuItem("Desktop");
        mLogger = new JMenuItem("Logger");
        mNew = new JMenuItem("New");
        mExit = new JMenuItem("Exit");
        mHelp1 = new JMenuItem("Help Info");
        mAbout = new JMenuItem("About");
        
        mFile.add(mDesktop);
        mFile.add(mLogger);
        mFile.add(mNew);
        mFile.add(mExit);
        mHelp.add(mHelp);
        mHelp.add(mAbout);
        setJMenuBar(mBar);
        
        p1.add(mBar);
       
        j1.getContentPane().add(p1);
    }
    public static void main(String args[])
    {
        MainForm f =new MainForm();
    }
    
}
