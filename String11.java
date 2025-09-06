//Longest Words in sentence
import java.util.*;
class Solution{
                         static int longest(String s)
                         {
                            String[] ch=s.split(" ");
                            int len=0;
                            for(String w:ch)
                            {
                               if(len<w.length())
                               {
                                   len=w.length();
                               }
                            }
                            return len;
                         }
}
public class String11 {
                         public static void main(String[]abc)
                         {
                             String s;
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter String");
                             s=sc.nextLine();
                             int res=Solution.longest(s);
                             System.out.println("Longest words length = "+res);
                             sc.close();
                         }
                         
}
