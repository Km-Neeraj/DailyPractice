import java.util.*;
class Solution 
{
      static int[] remove(int[]arr,int n)
      {
        int[]res=new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]!=0)
           {
             res[j++]=arr[i];
           }
        }
        return res;
      }
}
public class p17 {
                         public static void main(String[]abc)
                         {
                           int n;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the size of an array");
                           n=sc.nextInt();
                           int[]arr=new int[n];
                           System.out.println("Enter array elements");
                           for(int i=0;i<n;i++)
                           {
                          arr[i]=sc.nextInt();
                           }
                           System.out.println("Array Elements after placing all 0's at the end");
                           int[]res=Solution.remove(arr,n);
                           for(int i=0;i<n;i++)
                           {
                              System.out.print(res[i]+" ");
                           }
                           sc.close();
                         }
                         
}
