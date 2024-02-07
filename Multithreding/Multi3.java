package Multithreding;
public class Multi3 implements Runnable {
     public void run(){
        System.out.println("The thread is running normally !!");
     }
     public static void main(String[] args){
        Multi3 myObj= new Multi3();
        Thread my=new Thread(myObj);
        my.start();
     }
}