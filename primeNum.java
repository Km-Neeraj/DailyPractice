public class primeNum {
                         public static void main(String[] args) {
                           
                             int range=30;
                             for(int i=1;i<=range;i++)
                             {
                                 int count=0;
                                 for(int j=1;j<=i;j++)
                                 {
                                    if(i%j==0)
                                    {
                                       count++;
                                    }
                                 }
                                 if(count==2)
                                 {
                                    System.out.print(i+" ");
                                 }
                             }
                             
                         }
                         
}
