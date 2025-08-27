import java.util.*;
public class Practice26 {
                         public static void main(String[]abc)
                         
                         {
                               Scanner sc=new Scanner(System.in);
                               int row;
                               System.out.println("Enter number of row ");
                               row=sc.nextInt();
                               for(int i=1;i<=row;i++)
                               {
                                      for(int j=1;j<i;j++)
                                      {
                                          System.out.print(" ");
                                      }
                                      for(int k=1;k<=row;k++)
                                      {
                                         System.out.print("*");
                                      }
                                      System.out.println();
                               }
                         }
                         
}
