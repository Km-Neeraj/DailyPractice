import java.util.*;
class Solution 
{
   static int remove(int[]arr,int n)
   {
     Arrays.sort(arr);
     int idx=1;
     for(int i=1;i<n;i++)
     {
       if(arr[i]!=arr[i-1])
       {
          arr[idx++]=arr[i];
       }
     }
     return idx;
   }
}
public class p15 {
                         public static void main(String[]abc)
                         {
                           int n;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the size of an Array");
                           n=sc.nextInt();
                           System.out.println("Enter the array elements");
                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                           {
                               arr[i]=sc.nextInt();
                           }
                           System.out.println("Array elements after Removing duplicate");
                           n=Solution.remove(arr,n);
                           for(int i=0;i<n;i++)
                           {
                              System.out.print(arr[i]+" ");
                           }
                           sc.close();
                         }
                         
}
