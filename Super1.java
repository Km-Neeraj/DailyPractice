class Parent
{
                          int a=10;
                         Parent()
                         {
                            System.out.println("Parent class Constructor called");
                         }
                         void show()
                         {
                            System.out.println("This is Parent class Method");
                         }
}
class Child extends Parent 
{
   int a=20;
   Child()
   {
                         super();
                         System.out.println("Child class Constructor called");
   }
   void show()
   {
      System.out.println("Child class method Invoked");
   }
   void display()
   {
      super.show();
      show();
      System.out.println("Value of child class a ="+a);
      System.out.println("Value of Parent class a ="+super.a);

   }

}
public class Super1 {
                         public static void main(String[]abc)
                         {
                              Child ob=new Child();
                              ob.display();
                         }
                         
}
