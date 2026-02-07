import java.util.*;
class Solution 
{
    static void binarySearch(int[]arr,int key,int n)
    {
        int left=0,right=n-1;
        boolean flag=false;
        while(left<=right)
        {
           int mid=left+(right-left)/2;
           if(arr[mid]==key)
           {
                 System.out.println(key+" present at "+mid+" index");
                 flag=true;
                 break;
           }
                        
           else if(arr[mid]<key)
             left=mid+1;
            else 
                         right=mid-1;
        }
        if(!flag)
        System.out.println( key+" would be placed at "+left+" to maintain order");

    }
}
public class SearchinsertPos {
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
        Solution.binarySearch(arr,key,n);
        
        sc.close();
                         }
                         
}
