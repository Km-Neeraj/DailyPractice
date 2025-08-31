//Largest Element by sorting 
import java.util.*;
class Solution 
{
                          static int largestElement(int[]arr,int n)
                          {
                              Arrays.sort(arr);
                              return arr[n-1];
                          }

}
public class Practice42 {
                         public static void main(String[]abc)
                         {
                           int n;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the number of an array elements");
                           n=sc.nextInt();
                           int[]arr=new int[n];
                           System.out.println("Enter Array Elements");
                           for(int i=0;i<n;i++)
                           {
                             arr[i]=sc.nextInt();
                           }
                           int res=Solution.largestElement(arr,n);
                           System.out.println("Largest Element = "+res);
                           sc.close();
                         }
                         
}
