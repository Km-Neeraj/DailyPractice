import java.util.*;
class Solution 
{
   static String replaceChar(String s,char ch1,char ch2)
   {
                         String res="";
       for(int i=0;i<s.length();i++)
       {
          if(s.charAt(i)==ch1)
          {
             res=res+ch2;
          }
          else if(s.charAt(i)==ch2)
          {
              res=res+ch1;
          }
          else 
          {
             res=res+s.charAt(i);
          }
       }
       return res;

   }
}
public class Accenture11 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             String s;
                             s=sc.next();
                             System.out.println("Enter Character 1 ang Char 2 to replace it with String char");
                             char ch1=sc.next().charAt(0);
                             char ch2=sc.next().charAt(0);
                          String res=Solution.replaceChar(s,ch1,ch2);
                          System.out.println("string after replacing char 1 character with char and vice versa = "+res);
                          sc.close();
                         }
                         
}
