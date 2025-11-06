import java.util.*;
public class l6 {
                         public static void main(String[] args) {
                                                  
                            String s;
                            Scanner sc=new Scanner(System.in);
                            s=sc.next();
                            int n=s.length();
                            int substring=n*(n+1)/2;
                            System.out.println("Number of substring = "+substring);
                            sc.close();
                         }
                         
}
