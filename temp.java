import java.util.*;
public class temp {
                         public static void main(String[] args) {
                             int num1,num2;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter two numbers");
                             num1=sc.nextInt();
                             num2=sc.nextInt();
                             System.out.println("Numbers before swapping num1 = "+num1+" num2 = "+num2);
                             int c=num1;
                             num1=num2;
                             num2=c;
                             System.out.println("Numbers after swapping num1 = "+num1+" num2 = "+num2);
                             sc.close();



                         }
                         
}
