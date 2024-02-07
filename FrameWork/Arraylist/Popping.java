package FrameWork.Arraylist;
import java.util.*;
public class Popping {
    public static void main(String[] args){
         ArrayList<String> al=new ArrayList<String>();
          al.add("Vicflex");
          al.add("morgan");
          al.add("Victor");
          al.add("Nesh");
          al.add("Munene");
          al.add("Mashaa");
          al.add("Macharia");

             Iterator <String>itr= al.iterator();

             while(itr.hasNext())
             {
               System.out.println(itr.next());
             }
         //Popping
         al.remove("Nesh");
         System.out.println("New"+al);
          al.remove(4);  
          System.out.println("Final list"+al);
          
          
          //list 2
          ArrayList<String> al1=new ArrayList<String>();
          al1.add("morgan");
          al1.add("Eunice");
          al1.add("linet");
            al.addAll(al1);
            System.out.println("New elements from all lists"+al);

           al.retainAll(al1);
           System.out.println("After retaining"+al);
           //adding at specic point
           ArrayList <String> al2=new ArrayList<>();
           //al2.add("Wangui");
           al2.add("Roba"); 
           al.addAll(0, al2);
           System.out.println("After combing all the lists"+al);
            al.removeAll(al1);
            System.out.println("After removal"+al);
            al.clear();
            System.out.println(al);
         
    }
    
}
