import java.lang.Exception;
public class NestedTry {
    public static void main(String[] args){
        try {
            try {
                int data=50/0;
                int me[]=new int[5];
                me[5]=4;
            } catch (ArithmeticException e) { 
                System.out.println("The divisor is INVALID !!");
            }
            try {
                int me[]=new int[5];
                me[5]=4;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
            }
            System.out.println("Other statements");
        } catch (Exception e) {
            System.out.println("Ecxeptions have been handled");
        }
        System.out.println("Normal flow of the program");
    }
    
}
