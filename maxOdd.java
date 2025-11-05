import java.util.*;
class Solution 
{
   static String maximumOdd(String s)
   {
       
         for(int i=s.length()-1;i>=0;i--)
         {
              if(s.charAt(i)%2!=0)
              {
                    String s1=s.substring(0,i+1);
                    return s1;
              }
         }
         return "";
   }
}
public class maxOdd {
                       public static void main(String[] args) {
                         
                         String s;
                         Scanner sc=new Scanner(System.in);
                         s=sc.next();
                   String res=Solution.maximumOdd(s);
                   System.out.println("Maximum Odd number "+res);
                   sc.close();

                       }
                         
}
