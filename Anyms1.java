//Implementation of an interface by anonymous class
interface Test
{
                         void show();
}

public class Anyms1 {
                         public static void main(String[] args) {
                                                  Test t=new Test() {
                                                                           
                                                                                                    public void show()
                                                                                                    {
                                                                                                                             System.out.println("Hello");
                                                                                                    }
                                                                           
                                                  };
                                                  t.show();
                                                  
                         }
                         
}

