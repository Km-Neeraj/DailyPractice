import java.util.*;
class Solution 
{
     static boolean isPalindrome(String s)
     {
       int i=0, j=s.length()-1;
       while(i<j)
       {
          if(s.charAt(i)!=s.charAt(j))
          {
                         return false;
          }
          i++;
          j--;
       }
       return true;

     }
}
public class String2 {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String to check Palindrome or not");
                            s=sc.next();
                            boolean res=Solution.isPalindrome(s);
                            if(res)
                            {
                               System.out.println(s+" is Palindrome");
                            }
                            else 
                            {
                               System.out.println(s+" is not a Palindrome");
                            }
                            sc.close();
                         }
                         
}
