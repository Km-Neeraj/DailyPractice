import java.util.*;
class Solution 
{
     static String rev(String ch)
     {
              String[]w=ch.trim().split("\\s+");
                               StringBuilder res=new StringBuilder();
                               for(int i=w.length-1;i>=0;i--)
                               {
                                  res.append(w[i]);
                                  if(i>0)
                                  res.append(" ");
                               }
                               return res.toString();
                         }
               
     }

public class RevWord {
                         public static void main(String[] args) {
                               String ch;
                               Scanner sc=new Scanner(System.in);
                               ch=sc.nextLine();
                               String s=Solution.rev(ch);
                               System.out.println(s);
                               sc.close();
                         }
                               
                         
}
