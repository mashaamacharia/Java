import java.util.Scanner;
public class Calculator {
        Scanner no=new Scanner(System.in);
                float num1,num2;
        public void user()
        {
              num1=no.nextFloat();
              num2=no.nextFloat();
        }
        
        public void sign()
        {
            float ans;
            char sin;
            sin=no.next().charAt(0);
            switch (sin){
                case '+':
                        ans=num1+num2;
            System.out.println(ans);
            break;
                 case '-':
                         ans=num1-num2;
            System.out.println(ans);
            break;
                  case '*':
                          ans=num1*num2;
            System.out.println(ans);
            break;
                  case '/':
                          ans=num1/num2;
            System.out.println(ans);
            break;
                  case '%':
                          ans=num1%num2;
            System.out.println(ans);
            break;

            default:System.out.println("INVALID SIGN !");
            }
        }
        public static void main(String[] args){
            final Calculator myObj=new Calculator();
                    myObj.user();
                    myObj.sign();
        }
    }

