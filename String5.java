import java.util.*;
class Solution 
{
    static String reverse(String s)
    {
       String res="";
       int n=s.length();
       for(int i=n-1;i>=0;i--)
       {
          res=res+s.charAt(i);
       }
       return res;
    }
}
public class String5 {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String");
                            s=sc.next();
                            String res=Solution.reverse(s);
                            System.out.println("Reverse of "+s+" = "+res);
                            sc.close();
                         }
                         
}
