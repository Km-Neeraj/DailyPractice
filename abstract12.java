  abstract class abc 
 {
       abstract void sound();
 }
 class Dog extends abc{
   public void sound()
   {
  
     System.out.println("Dog Barks");
   }
 }
public class abstract12 {
                         public static void main(String[] args) {
                             Dog ob=new Dog();
                             ob.sound();
                                                  
                             
                         }
                         
}
