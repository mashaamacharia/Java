import javax.swing.*;
public class Label2 extends JFrame {
    public void me()
    {
       JFrame f;
       JButton b;
       JTextField tf;
       JLabel l;

       f=new JFrame("VICKIE");
       tf=new JTextField("Me");
       tf.setBounds(100,50 , 50,50);
       l=new JLabel("Enter num 1");
       l.setBounds(100,100 , 50, 30);
       b= new JButton("Find pi");
       b.setBounds(50,100,95,20);
      // *  b.addActionListener(this);
       f.add(tf);
       f.add(l);
       f.add(b);
       f.setSize(400,400);
       f.setVisible(true);

      /*  b.addActionListener(this);
       f.add(tf);
       f.add(l);
       f.add(b);
       f.setSize(400,400);
       f.setLayout("null");
       f.setVisible("true");
*/

    }
    public static void main(String[] args){
       Label2 myObj=new Label2();
       myObj.me();
    }
    
}
