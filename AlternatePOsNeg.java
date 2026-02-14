import java.util.Scanner;

class Solution 
{
    static void alternate(int[]arr,int n)
    {
        int j=0;
        for(int i=0;i<n;i++)
        {
           if(arr[i]<0)
           {
              int temp=arr[i];
              arr[i]=arr[j];
              arr[j++]=temp;
           }
        }
        int pos=j;
        int ng=0;
        while(pos<n&&ng<pos&&arr[ng]<0)
        {
                         int temp=arr[ng];
                         arr[ng]=arr[pos];
                         arr[pos]=temp;
                         pos++;
                         ng=ng+2;
        }
    }
}

public class AlternatePOsNeg {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             int n=sc.nextInt();
                             int[]arr=new int[n];
                             for(int i=0;i<n;i++)
                             {
                                arr[i]=sc.nextInt();
                             }

                             Solution.alternate(arr,n);
                             System.out.println("Elements after alternate Solution");
                             for(int num:arr)
                             {
                                                  System.out.print(num+" ");
                             }
                             sc.close();
                         }
                         
}
