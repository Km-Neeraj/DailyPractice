import java.util.*;
public class PrintAllPalindrome {
                         public static void main(String[]abc)
                         {
                            int range;
                            Scanner sc=new Scanner(System.in);
                            range=sc.nextInt();
                            int rem,rev,temp;
                            for(int i=1;i<=range;i++)
                            {
                              temp=i;
                              int num=i;
                              rev=0;
                              while(num!=0)
                              {
                                rem=num%10;
                                rev=rev*10+rem;
                                num=num/10;
                              }
                              if(rev==temp)
                              System.out.print(temp+" ");
                            }
                            sc.close();
                         }
                         
}
