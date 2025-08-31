//    Check if the Array is Sorted 
import java.util.*;
class Solution {
                         static boolean isSorted(int[]arr,int n)
                         {
                         
                              for(int i=1;i<n;i++)
                              {
                                if(arr[i]<arr[i-1])
                                return false;
                                  
                              }
                              return true;
                              
                         }

}   
public class Practice44 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of an array element");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter an Array elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            boolean res=Solution.isSorted(arr,n);
                            if(res)
                            {
                               System.out.println("Array is sorted");
                            }
                            else 
                            {
                                                  System.out.println("Array is not sorted");
                            }
                            sc.close();
                         }
                         
}
