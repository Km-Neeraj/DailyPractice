import java.util.*;
class Solution 
{
    static int[]result(int[][]arr,int n)
    {
       int t=n*n;
       int[]freq=new int[t+1];
       int repeat=-1;
       int miss=-1;
       for(int i=0;i<n;i++)
       {
          for(int j=0;j<n;j++)
          {
               freq[arr[i][j]]++;
          }

          
       }
       for(int i=1;i<=t;i++)
       {
           if(freq[i]==2)
           repeat=i;
           else if(freq[i]==0)
           miss=i;
       }
       return new int[]{repeat,miss};
    }
}
public class TwoDMissingRepeating {
 
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[][]arr=new int[n][n];
                            for(int i=0;i<n;i++)
                            {
                                for(int j=0;j<n;j++)
                                {
                                     arr[i][j]=sc.nextInt();
                                }
                            }
                            int[]res=Solution.result(arr,n);
                            System.out.println("Missing number = "+res[1]+" Repeating number = "+res[0]);
                            sc.close();
                         }
                         
}
