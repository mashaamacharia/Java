import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Gui extends Jframe {

    JFrame f=new JFrame("Calculator");
       try
       {
        //Set look and feel
           UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
       }
       catch(Exception e){
           System.err.println(e.getMessage());
       }

    JtextField tf=new JtextField();
    tf.setEditable(flase);

    //create a number of buttons and operators
    JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bd,bm,beq,beql;
    //create buttons
    b0=new JButton("0");
    b1=new JButton("1");
    b2=new JButton("2");
    b3=new JButton("3");
    b4=new JButton("4");
    b5=new JButton("5");
    b6=new JButton("6");
    b7=new JButton("7");
    b8=new JButton("8");
    b9=new JButton("9");
      //equals button
    beq1=new JButton("=");  
    //create operator buttons
    ba=new JButton("+");
    bs=new JButton("-");
    bd=new JButton("/");
    bm=new JButton("*");
    beq=new JButton("%");
    //create a panel
    JPanel p=new JPanel();
    //add action listeners
    bm.addActionListener(c);
    bd.addActionListener(c);
    bs.addActionListener(c);
    ba.addActionListener(c);
    b9.addActionListener(c);
    b8.addActionListener(c);
    b7.addActionListener(c);
    b6.addActionListener(c);
    b5.addActionListener(c);
    b4.addActionListener(c);
    b3.addActionListener(c);
    b2.addActionListener(c);
    b1.addActionListener(c);
    b0.addActionListener(c);
    beq.addActionListener(c);
    beq1.addActionListener(c);
    //add elements o panel
    p.add(1);
    p.add(ba);
    p.add(b1);
    p.add(b2);
    p.add(b3);
    p.add(bs);
    p.add(b4);
    p.add(b5);
    p.add(b6);
    p.add(bm);
    p.add(b7);
    p.add(b8);
    p.add(b9);
    p.add(bd);
    p.add(b0);
    p.add(beq);
    p.add(beq1);
    //set background of panel
    p.setBackground(color.blue);
    //add panel to frame
    f.add(p);
    f.setSize(200,220);
    f.display();
} 
