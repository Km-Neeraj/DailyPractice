//Left Rotate an Array by One Place 
import java.util.*;
class Solution 
{
                        
   static int[] result(int[]arr,int n)
   {
       int[] res=new int[n];
       int j=0;
       for(int i=1;i<n;i++)
       {
          res[j++]=arr[i];
       }
       res[j]=arr[0];
       return res;
   }
}
public class y11 {
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
                            for(int i=0;i<n;i++)
                            {
                                System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
