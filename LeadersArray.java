import java.util.*;
class Solution
{
                         static ArrayList<Integer> leaderArray(int[]nums,int n)
                         {
                            int max=nums[n-1];
                            ArrayList<Integer> res=new ArrayList<>();
                            res.add(max);
                            for(int i=n-2;i>=0;i--)
                            {
                               if(nums[i]>max)
                               {
                                                  max=nums[i];
                                                  res.add(max);
                               }
                            }
                            Collections.reverse(res);
                            return res;

                         }
}
public class LeadersArray {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                           ArrayList<Integer> res= Solution.leaderArray(arr,n);
                           System.out.println("Leaders in an array");
                           for(int num:res)
                           {
                              System.out.print(num+" ");
                           }
                           sc.close();

                         }
                         
}

/* 
Example: arr[]={1,5,16,4,2}
output: res[]={16,4,2}
 */
