package FrameWork;
//import java.util.PriorityQueue;
import java.util.*;
public class PriorityQ {
public static void main(String[] args){
   PriorityQueue<String> queue=new PriorityQueue<String>() ;
    queue.add("Me");
    queue.add("You");
    queue.add("Her");
    queue.add("Him");
    queue.add("Them");
    queue.add("They");
Iterator <String> itr=queue.iterator();
while(itr.hasNext()){
    System.out.println(itr.next());
}
 System.out.println("Head :"+queue.element());
 System.out.println("Head 2 :"+queue.peek());
 queue.poll();
 queue.remove();
 {
    System.out.println("After removing two elements :"+queue);
 }
 queue.comparator();
 System.out.println(queue);
 queue.removeAll(queue);
 {
    System.out.println(queue);
 }
// queue.comparator();

}
}
