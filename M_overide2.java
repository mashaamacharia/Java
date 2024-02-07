public class M_overide2 {
    public int interest(){
        return 6;
    }
}
    class Coop extends M_overide2{
       public int interest(){
            return 5;
        }
    }
    class Family extends M_overide2{
        public int interest(){
            return 4;
        }
    }
    class Kcb extends M_overide2{
        public int interest(){
            return 8;
        }
    }
    class Equity extends M_overide2{
       public int interest(){
            return 6;
        }
    }
     class Test{
    public static void main(String[] args){
        Coop myObj= new Coop();
        Family myObj1=new Family();
        Equity myObj2=new Equity();

       System.out.println("Cooperative interest is" +" "+myObj.interest());
       System.out.println("Family interest is"+" "+ myObj1.interest());
       System.out.println("Equiry interest is"+" "+myObj2.interest());
    }
    
}


