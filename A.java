
public class A {
    public void me(){
        System.out.println("I am the king");
    }
}
 class B extends A{
    public void you(){
        System.out.println("Noody can put me down");
    }
public static void main(String[] args){
    A myObj=new A();
    B myObj1=new B();
    myObj.me();
    myObj1.you();
}

}
