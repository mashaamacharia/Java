import java.util.Scanner;
public class Throw {
    //Scanner no=new Scanner(System.in);
    public static void main(String[] args){
        Scanner no=new Scanner(System.in);
        int age;
        System.out.println("Please enter your age for you to vote");
        age=no.nextInt();
        if(age<18){
            throw new ArithmeticException("You are not eligible");
        }
        else{
            System.out.println("Welcome and vote");
        }
        System.out.println("Rest of code executes");
    }
    
}
