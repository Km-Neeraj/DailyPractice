import java.util.*;
class Solution 
{
    static String removeOuter(String s)
    {
       int open=0;
       int close=0;
       int start=0;
       String res=" ";
       for(int i=0;i<s.length();i++)
       {
          char ch=s.charAt(i);
          if(ch=='(')
          {
             open++;
          }
          else if(ch==')')
          {
                         close++;
          }
          if(open==close) 
          {
             res=res+s.substring(start+1,i);
             start=i+1;
          }
       }
       return res;
    }
}
public class remove {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            String s=sc.next();
                            String res=Solution.removeOuter(s);
                            System.out.println("String after removing outermost parenthesis = "+res);
                            sc.close();
                         }
                         
}
