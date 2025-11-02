import java.util.*;
class Solution 
{
     static int[] result(int[]arr,int n,int target)
     {
        Arrays.sort(arr);
        int left=0,right=n-1;
        while(left<right)
        {
           int sum=arr[left]+arr[right];
           if(sum==target)
           return new int[]{arr[left],arr[right]};
           else if(sum<target)
            left++;
            else 
               right--;
        }
        return new int[]{};
     }
}
public class PairSum {
                         public static void main(String[] args) {
                          
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter Target");
                            int target=sc.nextInt();

                            int[]res=Solution.result(arr,n,target);

                            for(int i=0;i<res.length;i++)
                            {
                               System.out.print(res[i]+" ");  
                            }
                            sc.close();
                         }
                         
}
