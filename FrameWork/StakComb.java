package FrameWork;
import java.util.*;
public class StakComb {
    public static void main(String[] args){
           Stack <String> stk=new Stack <String>();
           //Checking if the stack is empty or full
           boolean result=stk.isEmpty();
               
           {
            System.out.println("Is the stack empty ?"+" "+result);
            System.out.println();
                         System.out.println(stk);
                              try {
                                      stk.pop();
                                  }
                              catch (EmptyStackException e)
                                  {
                                      System.out.println("The stack is empty ,please insert values in the stack");
                                  }
           } 
        //push in the stack
            stk.push("Chapati");
            stk.push(" beef");
            stk.push("mutton");
            stk.push("Peanut");
            stk.push("Fruits");
            stk.push("Chicken");
            stk.push("Milk");
            stk.push("Sweet potatoes");
            //pushelmnt(stk,23);

               stk.push(new String());
        Iterator<String> itr=stk.iterator();
        while(itr.hasNext())
        {
          System.out.println(itr.next());
          System.out.println();
        }   
             System.out.println("Is the stack empty"+" "+stk.isEmpty());
             {
                int location=stk.search("Chapati");
                System.out.println("Mutton is on location"+" "+location);
             }
         stk.pop(); 
         stk.pop();
         //stk.clear();
                  try {
                         stk.pop();
                  } catch (EmptyStackException e) {
                      System.out.println("Empty stack please add values to the stack");
                  }
         Iterator<String> itr1=stk.iterator();
        while(itr1.hasNext())
        {
          System.out.println(itr1.next());
          System.out.println();
        }   
            //System.out.println("New stack"+" "+stk);
           

    }
}
