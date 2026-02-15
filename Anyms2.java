//Implementation of an abstract class  by anonymous class
abstract class Shape
{
                         abstract void draw();
                         
}

public class Anyms2 {
                         public static void main(String[] args) {
                                                  Shape t=new Shape() {
                                                                           
                                                                                                     void draw()
                                                                                                    {
                                                                                                                             System.out.println("Circle");
                                                                                                    }
                                                                           
                                                  };
                                                  t.draw();
                                                  
                         }
                         
}

