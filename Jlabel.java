import javax.swing.JFrame;
import javax.swing.*;
public class Jlabel {
    public static void main(String[] args){
        JFrame f=new JFrame("vickie");
        Jlabel l1,l2;
        l1=new Jlabel("me");
        l1.setBounds(50,50,100,20);
        l2=new Jlabel("you");
        l2.setBounds(50,50,100,20);
        f.add(l1);
        f.add(l2);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);


    }
    
}
