//import java.util.*;
import java.util.*;
class Solution 
{
     static int largest(int[]arr,int n)
     {
        Arrays.sort(arr);
        return arr[n-1];
     }
}
public class p11 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an Array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter tha array elements");
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            int max=Solution.largest(arr,n);
                            System.out.println("Max elemet of an array = "+max);
                            sc.close();
                         }
                         
}
