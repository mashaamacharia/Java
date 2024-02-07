package Multithreding;

public class Priority1 extends Thread{
    public void run(){
        System.out.println("This is a thread");
        System.out.println("Its running normally !!");
    }
    public static void main(String[] args){
         Priority1 my=new Priority1();
         Priority1 my1=new Priority1();
         my.setPriority(Thread.MIN_PRIORITY);
         my1.setPriority(MAX_PRIORITY);
         my.start();
         my1.start();
    }
}
