import java.util.*;
public class ArmStrongNum {
                         public static void main(String[] args) {
                                                  
                            int num;
                            Scanner sc=new Scanner(System.in);
                            num=sc.nextInt();
                            int count=0;
                            double rev=0;
                            int temp=num;
                            while(num!=0)
                            {
                              count++;
                              num=num/10;
                            }
                            num=temp;
                            while(num!=0)
                            {
                                 int rem=num%10;
                                  rev=rev+Math.pow(rem,count);
                                 num=num/10;
                              
                            }
                            if(rev==temp)
                            {
                               System.out.print(temp+" is an armstrong");
                            }
                            else 
                            {
                                 System.out.println(temp+" is not an armstrong");
                            }
                            sc.close();

                         }
                         
}
