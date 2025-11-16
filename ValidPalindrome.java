import java.util.*;
class Solution 
{
   static boolean validPalindrome(String s)
   {
      int left=0,right=s.length()-1;
      while(left<right)
      {
          if(!Character.isLetterOrDigit(s.charAt(left)))
          left++;
          else if(!Character.isLetterOrDigit(s.charAt(right)))
          right--;
          else if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right)))
          {
          left++;
          right--;
          }
          else 
          return false;
      }
      return true;
   }
}
public class ValidPalindrome {
                         public static void main(String[] args) {
                           Scanner sc=new Scanner(System.in);
                           String s;
                           s=sc.nextLine();
                           boolean res=Solution.validPalindrome(s);
                           if(res)
                           {
                              System.out.println("String is valid Palindrome");
                           }
                           else 
                           {
                              System.out.println("String is not valid Palindrome");
                           }
  sc.close();

                         }
                         
}
