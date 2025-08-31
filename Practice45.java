// Remove Duplicates from a Sorted Array 
import java.util.*;
class Solution {
                         static int[] removeDuplicates(int[]arr,int n)
                         {
                             Set<Integer> res=new TreeSet<>();

                             for(int i=0;i<n;i++)
                             {
                               res.add(arr[i]);
                             }
                         
                             int[]r=new int[res.size()];
                             int i=0;
                             for(int c:res)
                             {
                                r[i]=c;
                                i++;
                             }
                             return r;

                         }

}
public class Practice45 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of an array elements");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int[]res=Solution.removeDuplicates(arr,n);
                            System.out.println("Array Elements after removing duplicates");
                            for(int i=0;i<res.length;i++)
                            {
                                   System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
