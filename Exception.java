public class Exception{
    public static void main(String[] args){
    try  {
        int num= 25/0;
        System.out.println(num);
    } 
    catch(ArithmeticException e){
        System.out.println("Please enter a valid divisor");
    }
    catch (NullPointerException e) {
        System.out.println(e);
        //System.out.println("Please enter a valid divisor");
    }
    finally{
        System.out.println("The finally block is always excecuted");
    }
    System.out.println("Rest of the code executes");
}
}