class Abc{
             void fun()
             {
                  System.out.println("Hii Fromm parent class Fun method");
             }
             int x=10;
             int y=20;

          
}
class Abc1 extends Abc{
                            void fun()
                            {
                                System.out.println("Hello from child class fun method");
                                int sum=x+y;
                                System.out.println("sum = "+sum);
                            }
                            
}
public class Temp6 {
                         public static void main(String[] args) {
                         
                                                  Abc1 ob=new Abc1();
                                                  ob.fun();
                                                  
                             
                         }
                         
}
