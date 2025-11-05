//Left Rotate an Array by One Place 

import java.util.Scanner;
class Solution 
{
   static int[] result(int[]arr,int n)
   {
                         int last=arr[0];
                     int[]res=new int[n];
                     for(int j=1;j<n;j++)
                     {
                        res[j-1]=arr[j];
                     }
                     res[n-1]=last;
                     return res;
       
   }
}
public class l4 {
                   public static void main(String[] args) {
                     
                         
                   
                         int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     int[]arr=new int[n];
     for(int i=0;i<n;i++)
     {
       arr[i]=sc.nextInt();
     }
     int[]res=Solution.result(arr,n);
     System.out.println("Array elements after rotating one place left");
     for(int i=0;i<n;i++)
     {
         System.out.print(res[i]+" ");
     }
     sc.close();
}
}
