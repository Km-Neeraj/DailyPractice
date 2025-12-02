import java.util.*;
class Solution 
{
    static String result(String s)
    {
         
         for(int i=s.length()-1;i>=0;i--)
         {
              char ch=s.charAt(i);
              int digit=ch-'0';
              if(digit%2!=0)
              {
                  return s.substring(0,i+1);
              }
         }
         return "";
    }
}
public class odd {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            String s=sc.next();
                            String res=Solution.result(s);
                            System.out.println("Longest substring = "+res);
                            sc.close();
                         }
                         
}
