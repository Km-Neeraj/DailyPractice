import java.util.*;
class Solution 
{
   static int result(int[]arr,int n)
   {
       int maxLen=0;
       for(int i=0;i<n;i++)
       {
          int sum=0;
          for(int j=i;j<n;j++)
          {
             sum+=arr[j];
             if(sum==0)
             maxLen=Math.max(maxLen,j-i+1);
          }

       }
       return maxLen;
   }
}
public class LongestSubArray0Sum {
   public static void main(String[] args) {
                         
     int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int[]arr=new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=sc.nextInt();

     }
     int res=Solution.result(arr,n);
     System.out.println("Longest SubArray length with 0 sum = "+res);
     sc.close();
   }
                         
}
