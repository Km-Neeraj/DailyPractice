import java.util.*;
class Solution 
{
   static LinkedHashSet<Integer> result(int[]arr1,int n,int[]arr2,int m)
   {
     LinkedHashSet<Integer> res=new LinkedHashSet<>();
     for(int i=0;i<n;i++)
     {
        res.add(arr1[i]);
     }
     for(int i=0;i<m;i++)
     {
        res.add(arr2[i]);
     }
     return res;

   }
}
public class y20 {
                         public static void main(String[] args) {
                                                  
                            int n,m;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter size of two arrays");
                            n=sc.nextInt();
                            m=sc.nextInt();
                            int[]arr1=new int[n];
                            int[]arr2=new int[m];
                            for(int i=0;i<n;i++)
                            {
                               arr1[i]=sc.nextInt();
                            }
                            for(int i=0;i<m;i++)
                            {
                               arr2[i]=sc.nextInt();
                            }
                            LinkedHashSet<Integer> res=Solution.result(arr1,n,arr2,m);
                            System.out.println(res);
                            sc.close();
                         }
                         
}
