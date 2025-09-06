import java.util.*;
class Solution 
{
    static void count(String s)
    {
                         int n=s.length();
                         s=s.toLowerCase();

                         int c=0,c1=0;
        for(int i=0;i<n;i++)
        {
           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
           {
                         c++;
           }
           else 
           {
               c1++;
           }
        }
        System.out.println("Number of Vowels = "+c+" and number of consonants = "+c1);
    }
}
public class String4 {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.next();
                             System.out.println("Vowels and Consonants in the given String ");
                             Solution.count(s);
                             sc.close();
                         }
                         
}
