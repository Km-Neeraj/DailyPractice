
import java.util.*;
public class AllLeapYear {
                         public static void main(String[] args) {
                                                  
                            int range;
                            Scanner sc=new Scanner(System.in);
                            range=sc.nextInt();
                            for(int i=2000;i<=range;i++)
                            {
                              int year=i;
                              if((year%400==0)||((year%4==0)&&(year%100!=0)))
                              System.out.print(year+" ");
                            }
                            sc.close();
                         }
                         
}
