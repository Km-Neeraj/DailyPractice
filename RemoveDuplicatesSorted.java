//   Remove Duplicates from a Sorted Array 
import java.util.*;
class Solution {
                         static int[] removeDuplicateSortedArray(int[]arr,int n)
                         {
                                                  Arrays.sort(arr);
                                                  ArrayList<Integer> res=new ArrayList<>();
                                                  for(int i=0;i<n;i++)
                                                  {
                                                      if(!res.contains(arr[i]))
                                                      {
                                                         res.add(arr[i]);
                                                      }
                                                  }
                                                  int[]r=new int[res.size()];
                                                  for(int i=0;i<res.size();i++)
                                                  {
                                                      r[i]=res.get(i);
                                                  }
                                                  return r;
                                                  
                         }

}
public class RemoveDuplicatesSorted {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Number of an Array Elements");
                             n=sc.nextInt();
                             int arr[]=new int[n];
                             System.out.println("Enter Array Elements");
                             for(int i=0;i<n;i++)
                             {
                                 arr[i]=sc.nextInt();
                             }
                             int[]res=Solution.removeDuplicateSortedArray(arr,n);
                             for(int i=0;i<res.length;i++)
                             {
                                 System.out.print(res[i]+" ");
                             }
                             sc.close();
                         }
                         
}
