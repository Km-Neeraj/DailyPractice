import java.util.*;
public class Practice29 {
                         public static void main(String[]abc)
                         {
                           int row;
                           int num=1;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter number of row");
                           row=sc.nextInt();
                           for(int i=1;i<=row;i++)
                           {
                               for(int j=i;j<=row;j++)
                               {
                                    System.out.print(num);
                               }
                               num++;
                               System.out.println();
                           }
                             num=1;
                           for(int i=row-1;i>=1;i--)
                           {
                               for(int j=i;j<=row;j++)
                               {
                                    System.out.print(num);
                               }
                               num++;
                               System.out.println();
                           }

                            


                         }
                         
}
