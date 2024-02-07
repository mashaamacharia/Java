import java.util.Scanner;
public class Factorial {
    Scanner no=new Scanner(System.in);
    public void me(){
        int num;
        Scanner no=new Scanner(System.in);
       System.out.println("Enter upto the number you wish ro get the factorial");
       num=no.nextInt();
       if(num==1){
        System.out.println(num);
       }
       else{
        System.out.println(num*(num-1));
       }
    }
    public static void main(String[] args){
        Factorial myObj=new Factorial() ;
        myObj.me();
    }
    
}
