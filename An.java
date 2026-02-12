interface Test 
{
                         void show();
}

public class An {
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
