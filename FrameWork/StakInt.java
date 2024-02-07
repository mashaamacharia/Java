package FrameWork;
import java.util.*;
public class StakInt {
    public static void main(String[] args){
        Stack<String> stk=new Stack<String>();
        {
            System.out.println(stk);
            try {
                stk.pop();
            } catch (EmptyStackException e) {
                System.out.println("The stack is empty ,please insert values in the stack");
            }
        }
                    pushelmnt(stk, 20);  
                    pushelmnt(stk, 13);  
                    pushelmnt(stk, 89);  
                    pushelmnt(stk, 90);  
                    pushelmnt(stk, 11);  
                    pushelmnt(stk, 45);  
                    pushelmnt(stk, 18); 
              popelmnt();
              popelmt();
              popelmt();
          //invoke push method
          stk.push(new Integer(x));             
    
    }
    
}
