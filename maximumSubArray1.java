import java.util.*;
class Solution 
{
    static int maximumSubarray(int[]arr,int n)
    {
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
             int currSum=0;
             for(int j=i;j<n;j++)
             {
                currSum=currSum+arr[j];
                res=Math.max(res,currSum);
             }
        }
        return res;
    }
}
public class maximumSubArray1 {

                         public static void main(String[] args) {
                                                  
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             int max=Solution.maximumSubarray(arr,n);
                             System.out.println("Maximum  subarray sum = "+max);
                             sc.close();
                         }
                         
}
