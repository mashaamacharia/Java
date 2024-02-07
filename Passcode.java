import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
public class Passcode {

    public void me()
    {
       JFrame f;
       JLabel l,u;
       JPasswordField p;
       JButton b;
       JTextField tf;
       
       //u=new JLabel("USERNAME");
       f=new JFrame("Passcode");
       f.setBackground(Color.blue);
       final JLabel label=new JLabel();
       f.setSize(300,300);
       u=new JLabel("Username");
        u.setBounds(20, 50, 80, 30);
       tf=new JTextField();
       tf.setBounds(100,50 , 100, 30);
      // u.setBounds(20, 50, 80, 30);
       l=new JLabel("Password");
       l.setBounds(20, 100, 80, 30);
       p=new JPasswordField();
       p.setBounds(100,100 , 100, 30);
       b=new JButton("LOGIN");
       b.setBounds(110,150,70,20);
       f.add(u);
       f.add(l);
       f.add(tf);
       f.add(p);
       f.add(b);
       f.setLayout(null);
       f.setVisible(true);
       b.addActionListener(new ActionListener() {  
        public void actionPerformed(ActionEvent e) {       
           String data = "Username " + u.getText();  
           data += ", Password: "   
           + new String(p.getPassword());   
           label.setText(data);  
        }
          });
    }
    public static void main(String[] args){
        Passcode myObj=new Passcode();
        myObj.me();
    }
    
}
