import java.util.*;
class Solution 
{
    static int result(int[]arr,int n)
    {
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
           if(arr[i]>max)
           {
              max=arr[i];
           }
        }
        return max;
    }
}
public class y9 {
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
                             System.out.println("Largest element = "+res);
                             sc.close();
                         }
                         
}
