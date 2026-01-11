//Rotate an Array by d - Counterclockwise or Left


import java.util.*;
class Solution 
{
    static void leftRotateDplaces(int[]arr,int n,int d)
    {
         d=d%n;
        rotate(arr,0,d-1);
        rotate(arr,d,n-1);
        rotate(arr,0,n-1);
    }
    static void rotate(int[]arr,int left,int right)
    {
        while(left<right )
        {
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
        }
    }
}

public class LeftRotateByDplaces {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                              arr[i]=sc.nextInt();
                            }
                            System.out.println("Enter value of d ");
                            int d=sc.nextInt();
                            Solution.leftRotateDplaces(arr,n,d);
                            System.out.println("Array elements after rotating d places Left");
                            for(int num:arr)
                            System.out.print(num+" ");
                            sc.close();
                         }
                         
}
