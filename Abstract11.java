import javax.swing.plaf.FontUIResource;

abstract class Fun 
{
    abstract void fan();
}
class Result extends Fun {
                         public void fan()
                         {
                             System.out.println("Hii From nornal class");
                         }
   
}
public class Abstract11 {
                         public static void main(String[] args) {
                                                  
                              Result ob=new Result();
                              ob.fan();
                         }
                         
}
