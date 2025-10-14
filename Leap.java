import java.util.*;
public class Leap {
                         public static void main(String[] args) {
                                                  
                             int year;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter year to check leap or not");
                             year=sc.nextInt();
                             if((year%400==0)||((year%4==0)&&(year%100!=0)))
                             {
                              System.out.println(year+" is leap year");    
                             }
                             else 
                             {
                               System.out.println(year+" is not leap year");
                             }
                             sc.close();

                         }
                         
}
