import java.util.*;
public class AllArmstrong {
                         public static void main(String[] args) {
                                                  
                              int range;
                              Scanner sc=new Scanner(System.in);
                              range=sc.nextInt();
                              for(int i=1;i<=range;i++)
                              {
                                int temp=i;
                                int count=0;
                                while(temp!=0)
                                {
                                   count++;
                                   temp=temp/10;
                                }
                                int num=i;
                                double rev=0;
                                while(num!=0)
                                {
                                  int rem=num%10;
                                  rev=rev+Math.pow(rem,count);
                                  num=num/10;
                                }
                                if(i==rev)
                                {
                                  System.out.print(i+" ");
                                }
                              }
                              sc.close();
                         }
                         
}
