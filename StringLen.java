import java.util.*;
class Solution 
{
    static String result(String s)
    {
      String[]arr=s.split("\\s+");
      StringBuilder res=new StringBuilder();
      for(int i=0;i<arr.length;i++)
      {
            String temp=arr[i];
           String len=""+temp.length();
           StringBuilder ch=new StringBuilder(temp);
           ch.reverse();
           res.append(ch);
           res.append(len);
           if(i<arr.length)
           {
               res.append(" ");
           }


      }
      return res.toString();
    }
}
public class StringLen {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            String s=sc.nextLine();
                         String res=Solution.result(s);
                         System.out.println("Resultant String = "+res);
                         sc.close();
                         }
                         
}
