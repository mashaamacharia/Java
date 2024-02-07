public class Student {
    int id;
    String name;
    Student(int i,String n){
    id=i;
    name=n;
    }
    public void mine(){
        System.out.println("My name is"+name+" "+"My Identity is"+id);
    }
    public static void main(String[] args){
        Student myObj=new Student(39909941,"victor");
       // Student myObj2=new Student();
        myObj.mine();
    }
}
