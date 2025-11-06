import java.util.*;
class Solution 
{
    static int result(String s)
    {
       int sign=1,res=0,idx=0;
       while(idx<s.length()&&s.charAt(idx)==' ')
       {
            idx++;
       }
       while(idx<s.length()&&(s.charAt(idx)=='-'||s.charAt(idx)=='+'))
       {
            if(s.charAt(idx++)=='-')
            {
            sign=-1;
            }

       }
       while(idx<s.length()&&s.charAt(idx)>='0'&&s.charAt(idx)<='9')
       {
             if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10 && s.charAt(idx)-'0'>7))
             {
                         return sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE;
             }
             res=10*res+(s.charAt(idx++)-'0');
       }
       return res*sign;
    }
}
public class l5 {
                         public static void main(String[] args) {
                                                  
                              String s;
                              Scanner sc=new Scanner(System.in);
                              s=sc.next();
                              int digit=Solution.result(s);
                              System.out.println("Digit = "+digit);
                              sc.close();
                         }
                         
}
