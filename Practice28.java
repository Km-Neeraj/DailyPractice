import java.util.*;
public class Practice28 {
                         public static void main(String[]abc)
                         {
                               int row;
                               Scanner sc=new Scanner(System.in);
                               System.out.println("Enter number of row");
                               row=sc.nextInt();
                             int num=1;
                             for(int i=1;i<=row;i++)
                             {
                                for(int j=1;j<=i;j++)
                                {
                                   System.out.print(num+" ");
                                   num++;
                                }
                                System.out.println();
                             }
                             
                         }
                         
}
