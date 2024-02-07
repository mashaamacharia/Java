import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
//import javax.swing.*;
public class MenuExample2 {
  JFrame fr=new JFrame("Fuck");
      JMenuItem i1,i2,i3,i4,i5;
      //JMenuBar mb=new JMenuBar();
    public void demo(){
      /*JFrame fr=new JFrame("Fuck");
      JMenuItem i1,i\  ....2,i3,i4,i5;*/
      JMenuBar mb=new JMenuBar();
      fr.setResizable(false);
      fr.setSize(500,500);
      fr.setBackground(Color.CYAN);
      fr.setLayout(null);
      fr.setVisible(true);
      JMenu m1,m2;
      //JMenuItem 12,13,14,15;
      m1=new JMenu("Menu");
      m1.setBounds(0, 50, 300, 30);
      m2=new JMenu("m2");
      i1=new JMenuItem("Vick");
      i2=new JMenuItem("Nesh");
      i3=new JMenuItem("Mashaa");
      i4=new JMenuItem("Flex");
      i5=new JMenuItem("Macharia");
      m1.add(i1);
      m1.add(i2);
      m1.add(i3);
      m1.add(m2);
      m2.add(i4);
      m2.add(i5);
      mb.add(m1);
      fr.setJMenuBar(mb);
     // fr.add(m1);

    }
    public static void main(String args[]){
        MenuExample2 myObj=new MenuExample2();
        myObj.demo();
        // MenuExample2();
    }
    
}
