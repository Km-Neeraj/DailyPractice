public class Practice36 {
                         public static void main(String[]abc)
                         {
                            int num=123;
                            int rem=0,res=0;
                            int count=num;
                            while(num!=0)
                            {
                               rem=num%10;
                               res=res*10+rem;
                               num=num/10;
                            }
                            if(res==count)
                            {
                                                  System.out.println(count+" is Palindrome");
                            }
                            else 
                            {
                                                  System.out.println(count+" is not Palindrome");
                            }
                         }
                         
}
