import java.io.IOException;
public class Throws {
    public void m() throws IOException{
        throw new IOException("Device error");
    }
    public void n() throws IOException{
        m();
    }
    public void p(){
      try {
        n();
      } catch (IOException e) {
        System.out.println("Exception handled");
        // TODO: handle exception
      }
      finally{
        System.out.println("Programmer of all times");
      }
    }
    public static void main(String[] args){
        Throws myObj=new Throws();
        myObj.p();
        System.out.println("Normal excecution of the program");
    }
   // System.out.println("Me");
}
