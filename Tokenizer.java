import java.util.StringTokenizer;
import java.util.*;
public class Tokenizer {
    public static void main(String [] args){
        StringTokenizer st=new StringTokenizer("Fuck off mehn !");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
    
}
