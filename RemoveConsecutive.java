import java.util.*;
class Solution 
{
    static String removeConsecutive(String s)
    {
       int n=s.length();
       if(s.isEmpty())
       return s;
       StringBuilder res=new StringBuilder();
       for(int i=0;i<n;i++)
       {
          if(res.length()==0 || res.charAt(res.length()-1)!=s.charAt(i))
          {
               res.append(s.charAt(i));
          }

       }
       return res.toString();
    }
}
public class RemoveConsecutive {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             String s;
                             s=sc.next();
         String res=Solution.removeConsecutive(s);
         System.out.println("String after removing consecutive Duplicates = "+res);
         sc.close();
                         }
                         
}

/*   
aabccba
String after removing consecutive Duplicates = abcba */