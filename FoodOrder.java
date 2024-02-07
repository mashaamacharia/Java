import javax.swing.*;
import java.awt.event.*;
public class FoodOrder {
    public void me()
    {
      JFrame f;
      JButton b;
      JCheckBox c1,c2,c3,c4;
      JLabel l1,l2,l3,l4;

      f=new JFrame("Vickie F.B");
      f.setSize(500,500 );

      l1=new JLabel("");
      l1.setBounds(20,20,80,20);

      l2=new JLabel("");
      l2.setBounds(40,40,80,20);

      l3=new JLabel("null");
      l3.setBounds(60,60,80,30);

      l4=new JLabel("");
      l4.setBounds(8,80,80,30);

      c1=new JCheckBox();
      c1.setBounds(20,30,30,20);
      c2=new JCheckBox();
      c2.setBounds(40,30,30,20);
      c3=new JCheckBox();
      c3.setBounds(60,30,30,20);
      c4=new JCheckBox();
      c4.setBounds(80,30,30,20);

      b=new JButton("Place order");
      b.setBounds(100,100,80,20);

      f.add(l1);
      f.add(l2);
      f.add(l3);
      f.add(l4);
      f.add(c1);
      f.add(c2);
      f.add(c3);
      f.add(c4);
      f.add(b);

      f.setVisible(true);
    }
    public static void main(String[] args){
        FoodOrder f=new FoodOrder();
        f.me();
    }
    
}
