import java.util.*;
class Solution 
{
                         static void nextPermutation(int[]nums,int n)
                         {
                            int i=n-2;
                            while(i>=0&&nums[i]>=nums[i+1])
                            {
                                                  i--;
                            }
                            if(i>=0)
                            {
                            int j=n-1;
                            while(nums[j]<=nums[i])
                            {
                                                  j--;
                            }
                         
                            int temp=nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                           
                         }
                          reverse(nums,i+1,n-1);
}
   private static void reverse(int[]arr,int left,int right)
   {
                         while(left<right )
                         {
                                                  int temp=arr[left];
                                                  arr[left++]=arr[right];
                                                  arr[right--]=temp;
                         }
   }
}
public class nextPermutation {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             Solution.nextPermutation(arr,n);
                             System.out.println("Next permutation = ");
                             for(int num:arr)
                             {
                                                  System.out.print(num);
                             }
                             sc.close();
                         }
                         
}
