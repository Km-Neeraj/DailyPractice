import java.util.*;
class Solution 
{
    static int rotate(int[]arr,int n,int k)
    {
        for(int i=n-k,j=n-1;i<j;i++,j--)
        {
          int temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        for(int i=0,j=n-k-1;i<j;i++,j--)
        {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
        }
        for(int i=0,j=n-1;i<j;i++,j--)
        {
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp; 
        }
        return n;
    }
}
public class P14 {
                         public static void main(String[]abc)
                         {
                            int n;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter the size of an array");
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            System.out.println("Enter the array elements");
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter the position to rotate an array");
                            int k=sc.nextInt();
                            System.out.println("Array Elements after k position rotation");
                            n=Solution.rotate(arr,n,k);
                            for(int i=0;i<n;i++)
                            {
                              System.out.print(arr[i]+" ");
                            }
                            sc.close();
                         }
                         
}
