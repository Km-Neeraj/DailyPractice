import java.util.*;
public class LargestDigit {
                         public static void main(String[]abc)
                         {
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int n=s.length();
                            char[]arr=new char[n];
                            for(int i=0;i<n;i++)
                             {
                                arr[i]=s.charAt(i);
                             }
                             Arrays.sort(arr);
                             System.out.println("Largest Digit in String = "+arr[n-1]);
                             sc.close();
                         }
                         
}
