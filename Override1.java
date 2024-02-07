public class Override1 {
   public void me(){
    System.out.println("The bicycle is being fixed");
    }
    class Fixing extends Override1{
    public void me(){
        System.out.println("the bicycle has been fixed");
    }
    }
    public static void main(String[] args){
         Override1 myObj=new Override1();
         myObj.me();
    }
}
