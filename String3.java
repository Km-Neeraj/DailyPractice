import java.util.*;
class Solution 
{
    static boolean isPalindrome(String s)
    {
       StringBuilder res=new StringBuilder(s);
       res.reverse();
       return s.equals(res.toString());
    }
}
public class String3 {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String");
                            s=sc.next();
                            boolean res=Solution.isPalindrome(s);
                            if(res)
                            {
                              System.out.println(s+" is a Palindrome");
                            }
                            else 
                            {
                              System.out.println(s+ " is not a palindrome");
                            }
                            sc.close();
                         }
                         
}
