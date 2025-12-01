import java.util.*;
class Solution 
{
    static void result(String s)
    {
       int vowel=0;
       int consonant=0;
       int specialChar=0;
       int digit=0;
       s=s.toLowerCase();
       for(char ch:s.toCharArray())
       {
          if(ch>='a'&&ch<='z')
          {
                 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                 {
                        vowel++;
                 }
                 else 
                 {
                    consonant++;
                 }
          }
          else if(ch>='0'&&ch<='9')
          {
             digit++;
          }
          else 
          {
             specialChar++;
          }
       }
       System.out.println("Total number of vowel = "+vowel);
       System.out.println("Total number of Consonant = "+consonant);
       System.out.println("Total number of digit = "+digit);
       System.out.println("Total number of specialChar = "+specialChar);
    }
}
public class CountString {
                         public static void main(String[]abc)
                         {
                             Scanner sc=new Scanner(System.in);
                             String s=sc.nextLine();
                         Solution.result(s);
                         sc.close();
                         }
                         
}
