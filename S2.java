import java.util.*;
public class S2 {
                         public static void main(String[] args) {
                                                  
                             Scanner sc=new Scanner(System.in);
                             String s=sc.next();
                             int p=0;
                             for(char ch:s.toCharArray())
                             {
                                int num=ch-'0';
                                p=p*10+num;
                             }
                             System.out.println(p);
                             int rem, rev=0;
                             int temp=p;
                             while(p!=0)
                             {
                                 rem=p%10;
                                 rev=rev*10+rem;
                                 p=p/10;
                             }
                             if(temp==rev)
                             {
                                                  System.out.println("Palindrome");
                             }
                             else 
                             {
                                                  System.out.println("Not Palindrome");
                             }
                             sc.close();
                         
                         }
                         
}
