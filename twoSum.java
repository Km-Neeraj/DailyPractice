import java.util.*;
class Solution 
{
   static void twoSum(int[]arr,int target,int n)
   {
       int left=0,right=n-1;
       while(left<right)
       {
                         int sum=arr[left]+arr[right];
         if(sum==target)
         {
             System.out.print("Element of index "+ left +" "+ right + " = "+target );
             return;
         }
         if(sum<target) 
         {
                         left++;
         }
         else if(sum>target)
         right--;
       }
       System.out.println("No pair Found");
   }
}
public class twoSum {
                         public static void main(String[] args) {
                                                  
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.nextInt();
                                                  }

                                                  System.out.println("Enter target sum");
                                                  int target=sc.nextInt();
                                                  Solution.twoSum(arr,target,n);
                                                  sc.close();
                                                  
                         
                         }
                         
}
