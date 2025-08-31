//Maximum Consecutive Ones 
import java.util.*;
class Solution {
                         static int maxConsecutivesOnes(int[]arr,int n)
                         {
                             int max=0,count=1;
                             for(int i=1;i<n;i++)
                             {
                                if(arr[i]==arr[i-1])
                                {
                                    count++;
                                }
                                else 
                                {
                                                  max=Math.max(max,count);
                                }
                             }
                             return Math.max(max,count);
                         }

}
public class MaximumConsecutiveOnes {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter Number of an Array Element");
                            n=sc.nextInt();
                            System.out.println("Enter Array Elements");
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int res=Solution.maxConsecutivesOnes(arr,n);
                            System.out.println("Maximum Consecutives Ones ="+res);
                          sc.close();                         }
                         
}
