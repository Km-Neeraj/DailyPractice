import java.util.*;
class Solution 
{
   static int[] result(int[]arr,int n)
   {
      ArrayList<Integer> pos=new ArrayList<Integer>();
      ArrayList<Integer> neg=new ArrayList<Integer>();
      for(int num:arr)
      {
           if(num<0)
           {
              neg.add(num);
           }
           else 
           {
              pos.add(num);
           }
      }
     
      int posIdx=0,negIdx=0;
      int i=0;
      int[]res=new int[n];
      while(posIdx<pos.size()&&negIdx<neg.size())
      {
           res[i++]=pos.get(posIdx++);
           res[i++]=neg.get(negIdx++); 
      }
      while(posIdx<pos.size())
      {
           res[i++]=pos.get(posIdx++);
      }
      while(negIdx<neg.size())
      {
         res[i++]=neg.get(negIdx++);
      }
      return res;
   }
}
public class alternate {
                         public static void main(String[] args) {
                                                  
                            int n;
                            Scanner sc=new Scanner(System.in);
                            n=sc.nextInt();
                            int[]arr=new int[n];
                            for(int i=0;i<n;i++)
                            {
                                 arr[i]=sc.nextInt();
                            }
                            System.out.println("Array after arranging 0 and 1 alternative ");
                            int[] res=Solution.result(arr,n);
                            for(int num:res)
                            System.out.print(num+" ");
                            sc.close();
                         }
                         
}
