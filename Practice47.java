//remove duplicates elements from array
import java.util.*;
class Solution {
                         static int removeDuplicate(int[]arr,int n)
                         {
                            int idx=1;
                            for(int i=1;i<n;i++)
                            {
                                                  if(arr[i]!=arr[i-1])
                                                  {
                                                     arr[idx++]=arr[i];
                                                  }
                            }
                            return idx;
                         }

}
public class Practice47 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of an array elements");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter array elements");
                            for(int i=0;i<n;i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            int idx=Solution.removeDuplicate(arr,n);
                            System.out.println("Array Elements after removing duplicates");
                            for(int i=0;i<idx;i++)
                            {
                               System.out.print(arr[i]+" ");
                            }
                            sc.close();
                         }
                         
}
