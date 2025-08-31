//Largest Element by Collections.max
import java.util.*;
class Solution {
                         static int largestElement(int[]arr,int n)
                         {
                            ArrayList<Integer> res=new ArrayList<>();
                            for(int i=0;i<n;i++)
                            {
                               res.add(arr[i]);
                            }
                            return Collections.max(res);
                         }

}
public class Practice43 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the number of an Array Elements");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter Array Elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            int res=Solution.largestElement(arr,n);
                            System.out.println("Largest Element = "+res);
                            sc.close();
                         }
                         
}
