//Second Largest
import java.util.*;
class Solution {
                         static int sLargest(int[]arr,int n)
                         {
                             Arrays.sort(arr);
                             return arr[n-2];
                         }
}
public class SLargest {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                                 arr[i]=sc.nextInt();
                            }
                            int sMax=Solution.sLargest(arr,n);
                            System.out.println("Second Largest = "+sMax);
                            sc.close();
                         }
                         
}
