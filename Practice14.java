import java.util.*;
public class Practice14 {
                         public static void main(String[]abc)
                         {
                              int n;
                              Scanner sc=new Scanner(System.in);
                              System.out.println("Enter the number of row");
                              n=sc.nextInt();
                              for(int i=1;i<=n;i++)
                              {
                                 for(int j=n;j>i;j--)
                                 {
                                    System.out.print(" ");
                                 }
                                 for(int k=1;k<=i;k++)
                                 {
                                      System.out.print("*");
                                 }
                                 System.out.println();
                              }
                              sc.close();
                         }
                         
}
