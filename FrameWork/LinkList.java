package FrameWork;
import java.util.*;
public class LinkList {
    public static void main(String[] args){

        LinkedList<String> li=new LinkedList<String>();
        li.add("Monday");
        li.add("Tuesday");
        li.add("Wednesday");
        li.add("thursday");
        li.add("Friday");
        li.add("Saturday");
        li.add("sunday");

        {
            Iterator<String> itr =li.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
       }
        li.add(4,"Sherehe");
           {
            System.out.println(li);
           }
        LinkedList<String> li2=new LinkedList<String>() ;
          li2.add("Works");
          li2.add("Ni ka works");
          li.add("Kufanto"); 
          {
            li.addAll( li2);
            {
                Iterator<String> itr2=li.descendingIterator();
                while (itr2.hasNext())
                {
                System.out.println(itr2.next());
                }
          } 
          //list addition at specific point
         LinkedList<String> li3=new LinkedList<>();
           li3.add("Trade");
           li3.add("Profits only");
            {
                li.addAll(0,li3);
                {
                    System.out.println("List update 2"+li);
                }
            }
            li.addFirst("Boom !!");
            {
                System.out.println("Index one updated"+li);
            }
            li.addLast("All blues");
            {
                System.out.println("Index last updated"+li);
            }
            //size checking
            //li.size();
            {
                System.out.println("Size updated"+" "+li.size());
            }
         //popping ,index object
            li.remove("Trade");
                {
                  System.out.println(li);
                }
            li.remove(0);
            {
                System.out.println(li);
            }   
            li.removeAll(li2);
            {
                System.out.println("After removing list 2"+li);
            }
         //popping first and last
         li.removeFirst();
         {
            System.out.println("After removal of first element"+li);
         }
         li.removeLast();
         {
             System.out.println("After last element  removal"+li);
         }
         li.removeFirstOccurrence("Friday");
         {
            System.out.println("After removal of first occurrence"+li);
         }
         li.clear();
         {
            System.out.println("Clearing"+li);
         }
    }
    
    }}
