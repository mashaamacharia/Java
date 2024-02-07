package Multithreding;

public class Multi1 extends Thread{
    public void run(){
        System.out.println("This thread is running normally !!" );
    }
    public static void main(String[] args){
        Multi1 myObj= new Multi1();
        myObj.start();
    }
    
}
