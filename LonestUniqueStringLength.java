import java.util.*;
class Solution 
{
    
    static int result(String s)
    {
                         int res=0;
       int n=s.length();
       for(int i=0;i<n;i++)
       {
           boolean[]vis=new boolean[26];
           for(int j=i;j<n;j++)
           {
               if(vis[s.charAt(j)-'a']==true)
               break;
               else 
               {
                  
                   res=Math.max(res,j-i+1);
                   vis[s.charAt(j)-'a']=true;
               }
           }
       }
       return res;
    }
}
public class LonestUniqueStringLength {
    public static void main(String[] args) {
                         
     Scanner sc=new Scanner(System.in);
     String s=sc.next();
     int res=Solution.result(s);
     System.out.println("Length of longest Unique substring = "+res);
     sc.close();
    }
                         
}
