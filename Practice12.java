import java.util.*;
public class Practice12 {
                         public static void main(String[]abc)
                         {
                            int n,i=0;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of row");
                            n=sc.nextInt();
                            for(i=1;i<=n;i++)
                            {
                               for(int j=i;j<n;j++)
                               {
                                                  System.out.print(" ");
                               }
                               for(int k=1;k<=2*i-1;k++)
                               {
                                                  
                                                       System.out.print("*");
                               }
                               
                                                  
                               System.out.println();
                            }

                            for(i=n-1;i>=1;i--)
                            {
                               for(int j=i;j<n;j++)
                               {
                                                  System.out.print(" ");
                               }
                               for(int k=1;k<=2*i-1;k++)
                               {
                                                  
                                                       System.out.print("*");
                               }
                               
                                                  
                               System.out.println();
                            }
                            sc.close();

                         }
                         
}
