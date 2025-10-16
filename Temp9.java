class Solution 
{
    void fun(int x)
    {
       System.out.println("Value of x = "+x);
    }
    
}
class Solution1 extends Solution
{
       void fun(int x)
       {
            System.out.println("Value of x = "+x);
       }
}
public class Temp9 {
                         public static void main(String[] args) {
                                                  
                              Solution ob=new Solution();
                              ob.fun(100);
                              Solution1 ob1=new Solution1();
                              ob1.fun(1000);
                              
                         }
                         
}
