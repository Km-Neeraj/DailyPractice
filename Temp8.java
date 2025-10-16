class Solution 
{
    void fun(int x,int y)
    {
      System.out.println("sum = "+(x+y));
    }
    void fun()
    {
       System.out.println("Helo");
    }
    int fun(int x)
    {
        return x;
    }
}
public class Temp8 {
                         public static void main(String[] args) {
                             Solution ob=new Solution();
                             ob.fun();
                             ob.fun(12,20);
                             System.out.println("Value of fun = "+ob.fun(890));
                         }

                         
}
