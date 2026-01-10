import java.util.*;
class Solution 
{
    static void reverse(int[]arr,int n)
    {
       int left=0;
       int right=n-1;
       while(left<right)
       {
         int temp=arr[left];
         arr[left]=arr[right];
         arr[right]=temp;
         left++;
         right--;
       }

    }
}
public class ReverseArray {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter number of rows ");
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter array elements ");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            Solution.reverse(arr,n);
                            System.out.println("Array elements after reverse");
                            for(int i=0;i<n;i++)
                            {
                               System.out.print(arr[i]+" ");
                            }
                            sc.close();
                         }
                         
}
