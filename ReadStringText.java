import java.io.Console;
public class ReadStringText {
    public static void main(String[] args){
        Console c=System.console();
        System.out.println("Enter your Name");
        String n=c.readLine();
        System.out.println("Welcome"+ "  "+n);

    }
    
}
