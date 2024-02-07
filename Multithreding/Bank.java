package Multithreding;
import java.util.*;
public class Bank  {
    Scanner no=new Scanner(System.in);
    int balance=10000;
    float num;
    float cBalance;
    int n;

    Calendar cal=Calendar.getInstance(); 

        public void login() 
            {
                int pass;
                 System.out.println();
                  System.out.println(".......... Hello ! Esteemed customer...........");
                 System.out.println();
                  System.out.println("Please enter your password to continue");
                  //System.out.println();
                  pass=no.nextInt();
                  if(pass==4402)
                  {
                    System.out.println("      .......................   ");
                    System.out.println("      .  LOGiN SUCCESSFUL ! .     ");
                    System.out.println("      .......................   ");
                    System.out.println();
                  }
                  else{
                    System.out.println("##### INCORRECT PASSWORD #### !");
                    login();
                  }

            }
    public void user()
      {
        System.out.println("Press the following to");
        System.out.println("   1:  Credit your account");
        System.out.println("   2:  Debit your account ");
           n=no.nextInt();
          
           if(n==1){
                    deposit(num);
                 }
           else if(n==2){
                     withdraw();
                  } 
            else{
                System.out.println("INVALID CHOICE !!");
                System.out.println();            
                user();
            }         
            
     }
    
        
    synchronized void withdraw(){
        System.out.println("Please enter the amount you wish to withdraw ");
                        System.out.println("");
        num=no.nextFloat();
        System.out.println("Please wait as we process your withdrawal request");
                         System.out.println("");
        if(balance<num){
           me();
        }else{
            
            System.out.println("Withdrawal was succesful ..");
            cBalance=balance-=num;
            System.out.println("       Current balance is "+".........KSH.. "+cBalance);
               System.out.println("THANKYOU !! Withral processed on"+" "+cal.getTime());
                          System.out.println("");
                   /* Vector<String>vec =new Vector<String>(100); 
                      System.out.println("Your receipt number is"+"..........."+vec.hashCode()); 
                      System.out.println(""); */
                    user();      
        
        }
    }
     
    public void me(){
         try {
                if(balance<num);
                   System.out.println("Less balance waiting deposit your current balance is"+balance);
                         System.out.println("Enter a lower mount please");
                             withdraw();
                                System.out.println("");       
            } catch (Exception e) {
                System.out.println(e);
                
            }
        }


    float c2;
    int balance2=10000;
     synchronized void deposit(float num2){
        System.out.println("Please enter the amount you wish to deposit !");
        num2=no.nextFloat();
                   System.out.println("");
       {
        c2=balance2+=num2;
        System.out.println("Successful deposit your current balance is ....KSH.."+c2);
           System.out.println("THANKYOU !! deposit was processed on "+" "+cal.getTime());
                 System.out.println("");
                 user();
        }
        
    }
    public static void main(String[] args){
        final Bank myObj=new Bank();
        myObj.login();
        myObj.user();
        new Thread(){
            public void run()
                {
                    myObj.withdraw();
                }
        }.start();
        new Thread(){
            public void run()
            {
                myObj.deposit(0);
            }
        }.start();
        
    }
}
