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
                             sc.close();
                         
                         }
                         
}
