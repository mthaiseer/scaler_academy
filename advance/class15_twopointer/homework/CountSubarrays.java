package advance.class15_twopointer.homework;

import java.util.HashMap;
import java.util.Map;

public class CountSubarrays {

    public int solve(int[] A) {
        int M = 1000000007;
        long ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();

        int l = 0;
        int r = 0;
        int N = A.length;

        while (r < N) {

            freq.put(A[r], freq.getOrDefault(A[r], 0) + 1);

            while (freq.get(A[r]) > 1) {


                freq.put(A[l], freq.get(A[l]) - 1);
                l++;
                if (freq.get(A[l]) <= 0) {
                    freq.remove(freq.get(A[r]));
                }
            }

            ans = (ans%M + (r - l)%M + 1)%M;
            r++;
        }
        return (int)ans%M;

    }

    public static void main(String[] args) {
        System.out.println(new CountSubarrays().solve(new int[]{3, 2, 5, 3, 2}));
        System.out.println(new CountSubarrays().solve(new int[]{2, 3, 2, 5, 2}));
        System.out.println(new CountSubarrays().solve(new int[]{2, 1, 2}));
        System.out.println(new CountSubarrays().solve(new int[]{93, 9, 12, 32, 97, 75, 32, 77, 40, 79, 61, 42, 57, 19, 64, 16, 86, 47, 41, 67, 76, 63, 24, 10, 25, 96, 1, 30, 73, 91, 70, 65, 53, 75, 5, 19, 65, 6, 96, 33, 73, 55, 4, 90, 72, 83, 54, 78, 67, 56, 8, 70, 43, 63}));
    }

}
