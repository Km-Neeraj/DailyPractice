import java.util.*;
class Solution 
{
     static String toggle(String s)
     {
         StringBuilder res=new StringBuilder();
         int n=s.length();
         for(int i=0;i<n;i++)
         {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
              res.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch))
            {
               res.append(Character.toUpperCase(ch));
            }
            else 
            {
                   res.append(ch);
            }
         } 
         return res.toString();               
     }
}
public class String10 {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            System.out.println("Enter String");
                            s=sc.next();
                            String res=Solution.toggle(s);
                            System.out.println("String after Toggle character "+res); 
                            sc.close();
                         }
                         
}


