public class practice30 {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w)) {
                return w;  
            }
        }
        return "";
    }

    private boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    // Testing the solution
    public static void main(String[] args) {
        practice30 sol = new practice30();

        String[] words1 = {"abc","car","ada","racecar","cool"};
        System.out.println(sol.firstPalindrome(words1)); // Output: "ada"

        
    }
}
