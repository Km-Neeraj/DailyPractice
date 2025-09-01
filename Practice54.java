//    Remove Duplicates from a Sorted Array 
import java.util.*;
class Solution {
                         static ArrayList<Integer> removeDuplicate(int[]arr,int n)
                         {
                              ArrayList<Integer> set=new ArrayList<>();
                              for(int i=0;i<n;i++)
                              {
                                  if(!set.contains(arr[i]))
                                  {
                                      set.add(arr[i]);
                                  }
                              }
                              Collections.sort(set);
                              return set;
                         }

}
public class Practice54 {
                         public static void main(String[]abc)
                         {
                             int n;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter the number of an array Elements");
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             System.out.println("Enter Array Elements");
                             for(int i=0;i<n;i++)
                             {
                               arr[i]=sc.nextInt();
                             }
                             ArrayList<Integer> res=Solution.removeDuplicate(arr,n);
                             for(int c:res)
                             {
                               System.out.print(c+" ");
                             }
                             sc.close();

                         }
                         
}
