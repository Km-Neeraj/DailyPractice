//Largest Elements in an array
import java.util.*;
class Solution {
                         static int largestElement(int[]arr,int n)
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
public class Practice41 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of an array elements");
                            n=sc.nextInt();
                            System.out.println("Enter Array Elements");
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int res=Solution.largestElement(arr,n);
                            System.out.println("Largest Element = "+res);
                            sc.close();
                         }
                         
}
