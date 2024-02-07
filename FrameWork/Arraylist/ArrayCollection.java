package FrameWork.Arraylist;
import java.util.*;
public class ArrayCollection {
    public static void main(String[] args){
        ArrayList <String> list= new ArrayList<String>();
        list.add("Mashaa");
        list.add("Vickie");
        list.add("Bancy");
        list.add("Linet");
        list.add("Morgan");
        list.add("Eunice");
        
         Iterator<String> itr =list.iterator();
           while (itr.hasNext()){
             System.out.println(itr.next());
           }
    }
}
