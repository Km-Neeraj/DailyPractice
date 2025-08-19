class A 
{
   int x=10;
   int y=20;

}
class B extends A 
{
                         int x=14;
                         void show()
                         {
                         System.out.println(x+" "+y);

                         System.out.println("Super class X = "+super.x);
                         }
}
public class Practice11 {
                         public static void main(String[]abc)
                         {
                            B b1=new B();
                            b1.show();
                         }
                         
}
