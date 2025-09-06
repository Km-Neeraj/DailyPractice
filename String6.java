import java.util.*;
class Solution 
{
    static String remove(String s)
    {
       String res="";
       int n=s.length();
       s=s.toLowerCase();
       for(int i=0;i<n;i++)
       {
          char ch=s.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
          {
              continue;
          }
          else
          {
                         res=res+ch;
          }
       }
       return res;
    }
}
public class String6 {
                         public static void main(String[]abc)
                         {
                            String s;
                            System.out.println("Enter String");
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            System.out.println("String after Removing vowels");
                            String res=Solution.remove(s);
                            System.out.println(res);
                            sc.close();
                         }
                         
}
