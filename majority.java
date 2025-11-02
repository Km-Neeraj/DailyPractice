import java.util.*;
class Solution 
{
   static int result(int[]arr,int n)
   {
       int candidate=-1;
       int count=0;
       for(int num:arr)
       {
          if(count==0)
          {
            candidate=num;
            count=1; 
          }
          else if(num==candidate)
          count++;
          else 
            count--;
       }
       count=0;
       for(int num:arr)
       {
             if(num==candidate)
             count++;
       }
       if(count>n/2)
       return candidate;
       else 
       return -1;
       
   }
}
public class majority {
                         public static void main(String[] args) {
                                                  
                           int n;
                           Scanner sc=new Scanner(System.in);
                           n=sc.nextInt();

                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                           {
                              arr[i]=sc.nextInt();
                           }
                           int res=Solution.result(arr,n);
                           System.out.println("Majority element = "+res);
                           sc.close();
                         }
                         
}
