import java.util.*;
class Solution 
{
      static boolean isPalindrome(String s)
      {
            int n=s.length();
             String res="";
            for(int i=n-1;i>=0;i--)
            {
                         res=res+s.charAt(i);
            }
            return s.equals(res);

      }
}
public class String1 {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.next();
                             boolean res=Solution.isPalindrome(s);
                             if(res)
                             {
                                System.out.println(s+" is palindrome");
                             }
                             else 
                             {
                                                  System.out.println(s+" is not palindrome");
                             }
                             sc.close();
                         }
                         
}
