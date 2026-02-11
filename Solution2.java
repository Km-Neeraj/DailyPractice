public class Solution2
{
                         static int a=10;
                          static int b;
                          
                         static{
                                                    
                                                  System.out.println("Static block executed");
                                                  System.out.println("Value of b = "+b);
                         }
                         static{
                            fun();
                         }
                          
                         static void fun()
                         {
                            b=20;
                             System.out.println("Static method executed");
                             System.out.println("Value of a = "+a);
                         }


public static void main(String[]abc)

{
                         System.out.println("Value of static memeber b = "+b);
}
}



