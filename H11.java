class A 
{
     public void m1()
     {
            System.out.println("Hello A");
     }
     public void m2()
     {
               System.out.println("Hii A");

               }
     
}
class B extends A 
{
                         public void m1()
                         {
                              System.out.println("Helloo B");
                         }
}
public class H11 {
                         public static void main(String[]abc)
                         {
                             B b = new B();
                             b.m1();
                             b.m2();
                         }
                         
}
