import java.util.*;
class Solution 
{
    static int[]result(int[]arr,int n)
    {
       int[]freq=new int[n+1];
       int repeating=-1;
       int missing=-1;
       for(int i=0;i<n;i++)
       {
            freq[arr[i]]++;
       }
       for(int i=1;i<=n;i++)
       {
           if(freq[i]==2)
           repeating =i;
           else if(freq[i]==0)
           missing = i;
       }
       return new int[]{repeating, missing};
    }
}
public class missingAndRepeating {
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
                             System.out.println("Repeating number = "+res[0]+" missing number = "+res[1]);
                             sc.close();

                         }
                         
}
