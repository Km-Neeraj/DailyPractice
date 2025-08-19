import java.util.*;
public class Practise15 {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of row");
                             n=sc.nextInt();
                             for(int i=1;i<=n;i++)
                             {
                                 for(int j=1;j<=i;j++)
                                 {
                                      if(i==j||i==n||j==1)
                                      {
                                         System.out.print("*");
                                      }
                                      else{
                                               System.out.print(" ");
                                      }
                                 }
                                 System.out.println();
                             }
                             sc.close();


                         }
                         
}
