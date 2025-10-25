import java.util.*;
class Solution 
{
   static boolean result(int[]arr,int n,int k)
   {
       for(int i=0;i<n;i++)
       {
           if(arr[i]==k)
           return true;
       }
       return false;
   }
}
public class y16 {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            System.out.println("Enter key");
                            int k=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();

                            }
                            boolean res=Solution.result(arr,n,k);
                            if(res)
                            System.out.println("yes element found");
                            else 
                            System.out.println("Element is not found");
                            sc.close();
                         }
                         
}
