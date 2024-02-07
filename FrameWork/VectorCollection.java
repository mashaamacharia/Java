package FrameWork;
import java.util.*;
public class VectorCollection {
    public static void main(String[] args){
        Vector<String> v=new Vector<String>();
           v.addElement("Mashaa");
           v.addElement("Vickie");
           v.addElement("Nesh");
           v.addElement("You");
           v.addElement("Then");
           v.addElement("Me");
           v.addElement("Them");

            Iterator<String> itr=v.iterator();
            while(itr.hasNext()){
              System.out.println(itr.next());
            }
        //v.size();
        System.out.println( "The size of the vector is"+" "+v.size());  
        
        v.addElement("her");
        v.addElement("Him");
        v.addElement("Then");  
          System.out.println(v);  
          System.out.println( "New size of the vector is"+"  "+v.size());
          if(v.contains("Him"))
          {
              System.out.println("Him is presemt in this vector at index"+" "+v.indexOf("Him"));
          }
          else{
            System.out.println("Him is absent in the list");
          }
         //v.firstElement();
         {
            System.out.println("First element:"+" "+v.firstElement());
            System.out.println("Last element:"+" "+v.lastElement());
         } 
         //v.removeFirstOccurrence("him");
         v.remove("Then");
         {
          System.out.println("After removal of first occurrence of Then "+v);
         }
         System.out.println("The hashcode of this vector is"+v.hashCode());
         System.out.println("");
          //v.get(1)
         {
            System.out.println("Getting index 1"+" "+v.get(1));
         }
         {
          System.out.println("Setting at index 2");
           v.set(2,"yooh");
           System.out.println(v);
         }
         v.clear();
         {
         System.out.println(v);
         }
         //get and set elements
         
    }
}
