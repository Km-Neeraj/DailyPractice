import java.util.*;
class Solution 
{
    static int largest(int[]arr,int n)
    {
                         int max=arr[0];
                         for(int i=1;i<n;i++)
                         {
                             if(arr[i]>max)
                             {
                                max=arr[i];
                             }
                         }
                         return max;
    }
}
public class p12 {
                         public static void main(String[]abc)
                         {
                           int n;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the size of an array:");
                           n=sc.nextInt();
                           int[]arr=new int[n];
                           System.out.println("Enter an Array elements");
                           for(int i=0;i<n;i++)
                           {
                             arr[i]=sc.nextInt();
                           }
                           int max=Solution.largest(arr,n);
                           System.out.println("Max element in an array = "+max);
                           sc.close();

                         }
                         
}
