import java.util.*;
class Solution {
                         static int removeDuplicate(int[]arr,int n)
                         {
                              int idx=1;
                              Arrays.sort(arr);
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
public class Practice55 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter The number of an array Elements");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array Elements");
                            for(int i=0;i<n;i++)
                            {
                                arr[i]=sc.nextInt();
                            }
                            int idx=Solution.removeDuplicate(arr,n);
                            System.out.println("Array Elements After removing duplicates");
                            for(int i=0;i<idx;i++)
                            {
                              System.out.print(arr[i]+" ");
                            }
                            sc.close();
                         }
                         
}
