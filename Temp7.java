class fun 
{
     int x=10;
     int y=20;
}
class fun1 extends fun{
                         int sum=x+y;
}
class fun2 extends fun1{
                             void res()
                             {
                                System.out.println("Value of x and y = "+x+" "+y);
                                System.out.println("Value of sum = "+sum);
                                System.out.println("Value of multiplication = "+(sum*x*y));
                             }
}
public class Temp7 {
                         public static void main(String[] args) {
                                                  
                               fun2 ob=new fun2();
                               ob.res();

                         }
                         
}
