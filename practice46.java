//remove duplicate elements using hashSet
import java.util.*;
class Solution 
{
                         static int removeDuplicates(int[]arr,int n)
                         {
                              Set<Integer> set=new HashSet<>();
                              int idx=0;
                              for(int i=0;i<n;i++)
                              {
                                 if(!set.contains(arr[i]))
                                 {
                                     set.add(arr[i]);
                                     arr[idx++]=arr[i];
                                 }
                              }
                              return idx;
                         }
   
}
public class practice46 {
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
                            int idx=Solution.removeDuplicates(arr,n);
                            System.out.println("ArrayElements after removing duplicates");
                            for(int i=0;i<idx;i++)
                            {
                               System.out.println(arr[i]+" ");
                            }
                            sc.close();
                         }
                         
}
