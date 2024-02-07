package FrameWork;
import java.util.*;
public class Tree {
    public static void main(String[] args){
        TreeSet <Integer> set=new TreeSet <Integer>();
        set.add(19);
        set.add(20);
        set.add(21);
        set.add(22);
        set.add(23);
        set.add(24);
        
        Iterator<Integer> itr=set.iterator();
         while(itr.hasNext()){
            System.out.println(itr.next());
         }
         
        System.out.println("Head set :"+" "+set.headSet(21));
        System.out.println("  ");
        System.out.println("Subset :"+" "+set.subSet(19,23));
        System.out.println("  ");
        System.out.println(" Tailset: "+" "+set.tailSet(21, false));
        System.out.println("  ");
      
         System.out.println("In descending order");

         Iterator <Integer> itr1=set.descendingIterator();
         while(itr1.hasNext()){
            System.out.println(itr1.next());
         }
          
         //pull highest and lowest
         {
            System.out.println("Smallest element"+" "+set.pollFirst());
         }
         {
            System.out.println("Largest element"+" "+set.pollLast());
         }
         System.out.println("  ");
         //;
         {
            System.out.println(set.add(29));
            System.out.println(set);                         
         }
         set.clear();
         {
            System.out.println(set);
         }
         
      
    }
}
