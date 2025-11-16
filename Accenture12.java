import java.util.*;
class Solution 
{
    static int result(int a,int b,int c)
    {
        switch(c)
        {
           case 1:
                   return (a+b);
            case 2:
                    return (a-b);
             case 3:
                     return (a*b);
             case 4:
                     return (a/b);
              default:
                       return -1;
        }
    }
}
public class Accenture12 {
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
