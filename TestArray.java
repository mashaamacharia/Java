public class TestArray {
    public static void main(String[] args){
        double a[]={1.1,1.2,1.5,1.4,1.5};
         int i;
        for(i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        System.out.println("");

        double total=0;
        for(i=0;i<a.length;i++){
            total+=a[i];
        }
        System.out.println(total);
        double max=a[0];
        for(i=0;i<a.length;i++)
        {
           if(a[i]>max) max=a[i];
        }
             System.out.println("The maximum number is"+max);
    }
    
}
