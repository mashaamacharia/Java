package FrameWork;
import java.util.*;
public class HashTableCollection {

public static void main(String[] args){
    Hashtable <Integer,String> hm=new Hashtable<Integer,String>();
    hm.put(100,"Mashaa");
    hm.put(200,"Nesh" );
    hm.put(300,"Flex");
    for(Map.Entry m:hm.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
}
}
}
