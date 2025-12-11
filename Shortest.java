
import java.util.*;
public class Shortest {


                         public int findShortestSubArray(int[] nums) {

        int n = nums.length;

        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> f = new HashMap<>();
        Map<Integer, Integer> l = new HashMap<>();

        int degree = 0;

        for (int i = 0; i < n; i++) {
            int v = nums[i];

            count.put(v, count.getOrDefault(v, 0) + 1);

            if (!f.containsKey(v)) {
                f.put(v, i);
            }

            l.put(v, i);

            degree = Math.max(degree, count.get(v));
        }

        int ans = n;

        for (int v : count.keySet()) {
            if (count.get(v) == degree) {
                ans = Math.min(ans, l.get(v) - f.get(v) + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Shortest obj = new Shortest();

        int[] nums1 = {1, 2, 2, 3, 1};
        System.out.println(obj.findShortestSubArray(nums1));

        int[] nums2 = {1, 2, 2, 3, 1, 4, 2};
        System.out.println(obj.findShortestSubArray(nums2));
    }
}

                         

