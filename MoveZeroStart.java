import java.util.*;
class Solution 
{
   static void moveZeroStart(int[]arr,int n)
   {
        
       int cnt=0;
       for(int i=0;i<n;i++)
       {
           if(arr[i]==0)
            cnt++;
       }
       int idx=n-1;
       for(int i=n-1;i>=0;i--)
       {
           if(arr[i]!=0)
           {
             arr[idx--]=arr[i];
           }
       }
       for(int i=0;i<cnt;i++)
       {
          arr[i]=0;
       }
      
   }
}
public class MoveZeroStart{
                         public static void main(String[]abc)
                         {
                           Scanner sc=new Scanner(System.in);
                           int n=sc.nextInt();
                           int[]arr=new int[n];
                           for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            
                           
                            
                             Solution.moveZeroStart(arr,n);
                            
                             System.out.println("Array elements after moving all zeros Start");
                             for(int i=0;i<n;i++)
                             {
                                 System.out.print(arr[i]+" ");
                             }
                            
                            sc.close();
                         }
                         
}
