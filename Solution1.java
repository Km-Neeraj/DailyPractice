public class Solution1 
{
                         static int a=20;
                          
                         static{
                                     fun();                 
                                                  System.out.println("Static block executed");
                         }
                         static void fun()
                         {
                             System.out.println("Static method executed");
                         }


public static void main(String[]abc)

{
                         System.out.println("Value of static memeber a = "+a);
}
}

/*  
Static method executed
Static block executed
Value of static memeber a = 20
*/

