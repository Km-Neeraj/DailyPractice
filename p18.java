import java.util.*;
class Solution 
{
   static ArrayList<Integer> merge(int[]arr1,int n,int[]arr2,int m)
   {
       ArrayList<Integer> res=new ArrayList<>();
       for(int i=0;i<n;i++)
       {
           res.add(arr1[i]);
       }
       for(int i=0;i<m;i++)
       {
          res.add(arr2[i]);
       }
       Collections.sort(res);
       return res;
   }
}
public class p18 {
                         public static void main(String[]abc)
                         {
                           int n,m;
                           Scanner sc=new Scanner(System.in);
                           System.out.println("Enter the size of array1 and array2");
                           n=sc.nextInt();
                           m=sc.nextInt();
                           int[]arr1=new int[n];
                           int[]arr2=new int[m];
                           System.out.println("Enter the first array elements");
                           for(int i=0;i<n;i++)
                           {
                              arr1[i]=sc.nextInt();
                           }
                           System.out.println("Enter second array elements");
                           for(int i=0;i<m;i++)
                           {
                              arr2[i]=sc.nextInt();
                           }
                           ArrayList<Integer> res=Solution.merge(arr1,n,arr2,m);
                           System.out.println("Array after merging together");
                           for(int c:res)
                           {
                             System.out.print(c+" ");
                           }
                           sc.close();
                         }
                         
}
