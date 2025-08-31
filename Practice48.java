//Left Rotate an Array by One Place 
import java.util.*;
class Solution 
{
                          static int[] leftRotate1(int[]arr,int n)
                          {
                             int[]res=new int[n];
                             int idx=0;
                             res[n-1]=arr[0];
                              for(int i=1;i<n;i++)
                              {
                                 res[idx++]=arr[i];
                              }
                              return res;
                              
                          }

}
public class Practice48 {
                         public static void main(String[]abc)
                         {
                           int n;
                           System.out.println("Enter the number of an  Array Elements");
                           Scanner sc=new Scanner(System.in);
                           n=sc.nextInt();
                           int[]arr=new int[n];
                           System.out.println("Enter Array Elements");
                           for(int i=0;i<n;i++)
                           {
                              arr[i]=sc.nextInt();
                           }
                           int[] idx=Solution.leftRotate1(arr,n);
                           System.out.println("Array Elements after rotating one place");
                           for(int i=0;i<n;i++)
                           {
                              System.out.print(idx[i]+" ");
                           }
                         }
                         
}
