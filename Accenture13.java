import java.util.*;
class Solution 
{
    static int result(int a,int b,int c)
    {
        int res=0;
        switch(c)
        {
           case 1:
                   res=(a+b);
                   break;
            case 2:
                    res =(a-b);
                    break;
             case 3:
                     res = (a*b);
                     break;
             case 4:
                     res = (a/b);
                     break;
             
        }
        return res;
    }
}
public class Accenture13 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             System.out.println("Enter Three numbers");
                             int a=sc.nextInt();
                             int b=sc.nextInt();
                             int c=sc.nextInt();
                          int res=Solution.result(a,b,c);
                          System.out.println("Result = "+res);
                          sc.close();
                         }
                         
}
 
                         

