import java.util.*;

class Solution {
    static int convertDecimal(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            int s1 = value(s.charAt(i));
            if (i + 1 < s.length()) {
                int s2 = value(s.charAt(i + 1));
                if (s1 >= s2) {
                    res = res + s1;
                } else {
                    res = res + (s2 - s1);
                    i++;
                }
            } else {
                res = res + s1;
            }
        }
        return res;
    }

    static int value(char ch) {
        if (ch == 'I') return 1;
        else if (ch == 'V') return 5;
        else if (ch == 'X') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        else if (ch == 'M') return 1000;
        return -1;
    }
}

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dec = Solution.convertDecimal(s);
        System.out.println("Decimal of " + s + " = " + dec);
        sc.close();
    }
}
