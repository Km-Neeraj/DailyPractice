import java.util.*;
class Solution 
{
   static int[]result(int[]arr,int n)
   {
      int d=2;
      int[]res=new int[n];
      int j=0;
      for(int i=n-d;i<n;i++)
      {
         res[j++]=arr[i];
      }
      for(int i=0;i<n-d;i++)
      {
         res[j++]=arr[i];
      }
      return res;
   }
}
public class y14 {
                         public static void main(String[] args) {
                                                  
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             int[]res=Solution.result(arr,n);
                             for(int i=0;i<n;i++)
                             {
                                System.out.print(res[i]+" ");
                             }
                             sc.close();
                         }
                         
}
