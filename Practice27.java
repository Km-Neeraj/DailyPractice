import java.util.*;
public class Practice27 {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             int row;
                             System.out.println("Enter row");
                             row=sc.nextInt();
                             int num=0;

                             for(int i=1;i<=row;i++)
                             {
                                  for(int j=i;j<row;j++)
                                  {
                                       System.out.print(" ");
                                  }
                                  for(int k=1;k<=i;k++)
                                  {
                                      if(i==k||k==1)
                                      {
                                         System.out.print("1"+" ");
                                      }
                                      else{
                                                System.out.print(num+" ");
                                      }
                                  }
                                  num++;
                                  System.out.println();
                             }
                         }
                         
}
