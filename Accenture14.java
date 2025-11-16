import java.util.*;
class Solution 
{
   static void result(int[]arr,int n)
   {
       ArrayList<Integer> even =new ArrayList<>();
       ArrayList<Integer> odd =new ArrayList<>();
       even.add(arr[0]);
       for(int i=1;i<n;i++)
       {
           if(i%2==0)
           {
                even.add(arr[i]);
           }
           else 
           {
              odd.add(arr[i]);
           }
       }
       Collections.sort(even);
       Collections.sort(odd);
       System.out.println("Sorted even index element of an Array = ");
       System.out.println(even);
       System.out.println("Sorted odd index element of an Array = ");
       System.out.println(odd);
   System.out.println("Sum of second largest element of even and odd = "+(even.get(even.size()-2)+(odd.get(odd.size()-2))));

       
   }
}
public class Accenture14 {
  
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n;
                             n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }
              Solution.result(arr,n);
              sc.close();
                         }
                         
}
