import java.util.*;
class Solution 
{
    static TreeSet<Integer> remove(int[]arr,int n)
    {
       TreeSet<Integer> res=new TreeSet<>();
       for(int i=0;i<n;i++)
       {
            res.add(arr[i]);
       }
       return res;
    }
}
public class p16 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            System.out.println("Enter array elements");
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            TreeSet<Integer> res=Solution.remove(arr,n);
                            System.out.println("Array elements after removing duplicate");
                            for(int c:res)
                            {
                              System.out.print(c+" ");
                            }
                            sc.close();
                         }
                         
}
