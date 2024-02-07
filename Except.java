import java.util.Scanner;

public class Except { 

    public void user()
         {  
            Scanner no=new Scanner(System.in);
        int result ,num1,num2;

        System.out.println("Please enter the first number");
        num1=no.nextInt();
        System.out.println("Please enter the second number");
        num2=no.nextInt();  
        System.out.println();
        
        try {
            result=num1/num2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurred");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println(e);
         }
         finally{
            System.out.println("The try catch block is complete");
         }
         }
    public static void main (String[] args){
           Except myObj=new Except();
           myObj.user();
       System.out.println("Program continua !!");
    }
    
}
