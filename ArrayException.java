import java.lang.Exception;
public class ArrayException {
    public void me(){
        int data[]=new int[5];
        try {
        data[5]=4/0;
        //data[7]=
            
        } catch (ArithmeticException e) {
            System.out.println("please enter a valid divisor");
            // TODO: handle exception
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The array is out of bound please");
        }
        catch(Exception e){
            System.out.println(" Nothing here");
        }
       /* catch(final Exception e){
            System.out.println("nothing is here");
        }*/
        finally{
            System.out.println("The exceptionn has been handled");
        }
    }
    public static void main(String[] args){
        ArrayException myObj=new ArrayException();
        myObj.me();
        System.out.println("The program is running normally");
    }
    
}
