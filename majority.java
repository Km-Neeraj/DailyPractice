import java.util.*;
class Solution
{
   static int majorityEl(int[]arr,int n)
   {
      int cnt=0;
      int cnd=0;
      for(int num:arr)
      {
         if(cnt==0)
         {
             cnd=num;
             cnt=1;
         }
         else if(num==cnd)
                         cnt++;
        else 
                         cnt--;
      }
      cnt=0;
      for(int num:arr)
      {
          if(num==cnd)
          {
                         cnt++;
          }
      }
      if(cnt>n/2)
      {
                         return cnd;
      }
      return -1;
   }
}
public class majority {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int majority=Solution.majorityEl(arr,n);
                            if(majority!=-1)
                            System.out.println("Majority element = "+majority);
                         else 
                                                  System.out.println("Majority element doesn't exist");
                            sc.close();
                         }
                         
}
