public class Enum {
    public enum Season{Summer,winter,Spring,Fall}
    public static void  main(String[] args){
        for(Season s:Season.values()){
            System.out.println(s);
        }

    }
}
