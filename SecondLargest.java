import java.util.*;
class Solution 
{
   static int secondLargest(int[]arr,int n)
   {
      int max=Integer.MIN_VALUE;
      int sMax=Integer.MIN_VALUE;
      for(int num: arr)
      {
                         if(num>max)
                         {
                            sMax=max;
                            max=num; 
                         }
                         else if(num>sMax&&num!=max)
                         {
                            sMax=num;
                         }
      }
      return sMax;
   }
}
public class SecondLargest {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int sLargest=Solution.secondLargest(arr,n);
                            System.out.println("Second Largest = "+sLargest);
                            sc.close();
                         }
                         
}
