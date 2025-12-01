import java.util.*;
class Solution 
{
   static String reverseWords(String s)
   {
       String[]ch=s.split("\\s+");
       StringBuilder res=new StringBuilder();
       for(int i=ch.length-1;i>=0;i--)
       {
          res.append(ch[i]);
          if(i>0)
          {
            res.append(" ");
          }
       }
       return res.toString();


   }
}
public class ReverseWords {
                         public static void main(String[]abc)
                         {
                            Scanner sc=new Scanner(System.in);
                            String s;
                            s=sc.nextLine();
                            String res=Solution.reverseWords(s);
                            System.out.println("String after reversing each words = "+res);
                            sc.close();

                         }
                         
}
