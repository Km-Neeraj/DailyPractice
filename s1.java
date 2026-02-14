import java.util.*;
class Solution 
{
    static void change(int[]arr,int n)
    {

                         int low=0,high=n-1;
                         while(low<=high)
                         {
                             if(arr[low]==1)
                             {
                                 int temp=arr[low];
                                 arr[low]=arr[high];
                                 arr[high--]=temp;
                             }
                             low++;
                             
                         }
    }
}
public class s1 {
                         public static void main(String[] args) {
                         
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
                             Solution.change(arr,n);
                             System.out.println("Array after shifting all 1 right");
                             for(int num:arr)
                             {
                                                  System.out.println(num+" ");
                             }
                             sc.close();
                         }
                         
}
