import java.util.*;
class Solution 
{
   static void sort012(int[]arr,int n)
   {
       int left=0;
       int mid=0;
       int right=n-1;
       while(mid<=right)
       {
          if(arr[mid]==1)
            mid++;
          else if(arr[mid]==0)
          {
             int temp=arr[left];
             arr[left++]=arr[mid];
             arr[mid++]=temp;
          }
          else if(arr[mid]==2)
          {
             int temp=arr[mid];
             arr[mid]=arr[right];
             arr[right--]=temp;

          }
       }
   }
}
public class Sort012 {
                         public static void main(String[] args) {
                                                  
                                                  Scanner sc=new Scanner(System.in);
                                                  int n=sc.nextInt();
                                                  int[]arr=new int[n];
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      arr[i]=sc.nextInt();
                                                  }

                                                  
                                                  Solution.sort012(arr,n);
                                                  System.out.println("Array elements after sorting 0 1 and 2");
                                                  for(int num:arr)
                                                  {
                                                      System.out.print(num+" ");
                                                  }
                                                  sc.close();
                                                  
                         
                         }
                         
}
