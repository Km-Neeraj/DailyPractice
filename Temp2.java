import java.util.*;
public class Temp2 {
                         public static void main(String[] args) {
                                                  
                            int num1,num2;
                            Scanner sc=new Scanner(System.in);
                            num1=sc.nextInt();
                            num2=sc.nextInt();
                            System.out.println("Numbers before swapping num1 = "+num1+" num2 ="+num2);
                            num1=num1+num2;
                            num2=num1-num2;
                            num1=num1-num2;
                            System.out.println("Numbers After swapping num1 "+num1+" num2 = "+num2);
                            sc.close();
                         }
                         
}
