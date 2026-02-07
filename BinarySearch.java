import java.util.*;
class Solution 
{
    static int binarySearch(int[]arr,int key,int n)
    {
        int left=0,right=n-1;
        while(left<=right)
        {
           int mid=left+(right-left)/2;
           if(arr[mid]==key)
                         return mid+1;
           else if(arr[mid]<key)
             left=mid+1;
            else 
                         right=mid-1;
        }
        return -1;

    }
}
public class BinarySearch {
                         public static void main(String[] args) {
                                                  
                            Scanner sc=new Scanner(System.in);
                            int n=sc.nextInt();

                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                               arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter key to search");
                            int key=sc.nextInt();
        int res=Solution.binarySearch(arr,key,n);
        if(res==-1)
        {
           System.out.println(key+" is not present in array");

        }
        else 
        {
                         System.out.println(key+" is present at "+res+" position in array");

        }
        sc.close();
                         }
                         
}
