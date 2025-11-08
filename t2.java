//Sort an Array of 0's, 1's, and 2's (Dutch National Flag Problem) 
import java.util.*;
class Solution 
{
    static void result(int[]arr,int n)
    {
       int left=0;
       int right=n-1;
       int mid=0;
       while(mid<=right)
       {
          if(arr[mid]==0)
          {
             int temp=arr[left];
             arr[left++]=arr[mid];
             arr[mid++]=temp;
          }
          else if(arr[mid]==1)
          mid++;
          else
          {
             int temp=arr[right];
             arr[right--]=arr[mid];
             arr[mid]=temp;
          }

       }
    }
}
public class t2 {
                         public static void main(String[] args) {
                                                  
                             int n;
                             Scanner sc=new Scanner(System.in);
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             Solution.result(arr,n);
                             System.out.println("Array elements after arranging 0 1 and 2 ");
                             for(int i=0;i<n;i++)
                             {
                                 System.out.print(arr[i]+" ");
                             }
                             sc.close();
                         }
                         
}
