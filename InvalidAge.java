import java.lang.Exception;
import java.util.Scanner;
public class InvalidAge extends Exception {
 //`1static void validate() throws InvalidAge{}
 public static void main(String[] args){
    try {
         Scanner no=new Scanner(System.in);
         int age;
         System.out.println("Please enter you age here");
         age=no.nextInt();

         if(age<18){
            throw new InvalidAge();
        }
        else{
            System.out.println("Welcome to vote !!");
        }
        //validate(13);
    } catch (Exception e) {
        System.out.println("INVALID AGE TO VOTE!!");
        
    }
 }
}
