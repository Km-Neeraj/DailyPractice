import java.util.*;
class Solution 
{
    static int min(int[]arr,int n)
    {
        Arrays.sort(arr);
        return arr[0];
    }
}
public class P13 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            System.out.println("Enter an array elements");
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                                                  arr[i]=sc.nextInt();
                            }
                            int min=Solution.min(arr,n);
                            System.out.println("Minimum element = "+min);
                            sc.close();
                         }
                         
}
