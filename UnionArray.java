//Find the Union of Two Arrays 
import java.util.*;
class Solution 
{
     static int[] unionArray(int[]arr1,int n,int[]arr2,int m)
     {
             ArrayList<Integer> res=new ArrayList<>();

             for(int i=0;i<n;i++)
             {
                  if(!res.contains(arr1[i]))
                  {
                      res.add(arr1[i]); 
                  }
             }
             for(int i=0;i<m;i++)
             {
                    if(!res.contains(arr2[i]))
                    {
                       res.add(arr2[i]);
                    }
             }
             Collections.sort(res);
              int[]un=new int[res.size()];

              for(int i=0;i<res.size();i++)
              {
                     un[i]=res.get(i);
              }
              return un;
     }
}
public class UnionArray {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter The number of an Array Elements of Arra1 and Array2");
                            n=sc.nextInt();
                            int m=sc.nextInt();
                            int[]arr1=new int[n];
                            int[]arr2=new int[m];
                            System.out.println("Enter First Array Elements");
                            for(int i=0;i<n;i++)
                            {
                               arr1[i]=sc.nextInt();
                            }
                            System.out.println("Enter Second Array Elements");
                            for(int i=0;i<m;i++)
                            {
                               arr2[i]=sc.nextInt();
                            }
                            int[]res=Solution.unionArray(arr1,n,arr2,m);
                            System.out.println("Union of two arrys");
                            for(int i=0;i<res.length;i++)
                            {
                               System.out.print(res[i]+" ");
                            }
                            sc.close();
                         }
                         
}
