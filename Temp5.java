class Solution 
{
                         Solution()
                         {
                            System.out.println("Hello from non parametrized constructor");
                         }
                         Solution(int a,int b)
                         {
                            int sum=a+b;
                            System.out.println("Hii from parametrized constructor");
                            System.out.println("Sum of two num = "+sum);
                         }
}
public class Temp5 {

                         public static void main(String[]abc)
                         {
                             Solution s=new Solution();
                             Solution s1=new Solution(10,20);
                             
                         }
                         
                         
                         
}
