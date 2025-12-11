import java.util.Scanner;
class Solution 
{
   static int result(int[]arr,int n)
   {
                         int max=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
      {
                         int sum=0;
          for(int j=i;j<n;j++)
          {
             sum=sum+arr[j];
           if(sum>max)
               max=sum;
           

          }
      }
      return max;
   }
}
public class tsum{

                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array elements ");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                         }
//System.out.println("Enter Target value");
                        // int target=sc.nextInt();
                         int res=Solution.result(arr,n);
                         System.out.println("Maximum sum = "+res);
                         
                         sc.close();
 }
                         
}
