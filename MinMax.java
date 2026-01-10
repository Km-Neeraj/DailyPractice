import java.util.*;
class Solution 
{
    static void minMax(int[]arr,int n)
    {
      int max=arr[0];
      int min=arr[0];
      for(int num:arr)
      {
         if(num>max )
                         max=num;
          if(num<min )
                         min=num;
      }
      System.out.println("Min = "+min+" max = "+max);
    }
}
public class MinMax {
                         public static void main(String[]abc)
                         {
                           Scanner sc=new Scanner(System.in);
                           int n=sc.nextInt();
                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                           {
                             arr[i]=sc.nextInt();
                           }
                           Solution.minMax(arr,n);
                           sc.close();
                         }
                         
}
