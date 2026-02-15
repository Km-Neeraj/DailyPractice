class Parent 
{
                         int a=10;
                         Parent()
                         {
                             System.out.println("Default constructor");
                         }
                         void show()
                         {
                             System.out.println("Hello from Parent class");
                         }
                         Parent(int x,int y)
                         {
                                                  this();
                                                  int sum=x+y;
                                                  System.out.println("sum = "+sum);
                         }
}
class Child extends Parent 
{
       void show()
       {
                         System.out.println("Hello from Child Class");
       }  
       Child()
       {
           
                         super(10,20);
                         
                         System.out.println("Child class Constructor executed");
                         
       }    
       void display()
       {
                         show();
                         super.show();
       }            
}
public class SuperKy {
                         public static void main(String[] args) {
                            
                                                  Child ob=new Child();
                                                  ob.display();

                         }
                         
}
