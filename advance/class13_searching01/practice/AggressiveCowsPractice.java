package advance.class13_searching01.practice;

import java.util.Arrays;

public class AggressiveCowsPractice {


    private boolean canPlaceCow(int[] stalls, int cows, int N, int nextPosition) {

        int lastCow = stalls[0];
        int count = 1;
        for (int i = 1; i < N; i++) {

            if (stalls[i] - lastCow >= nextPosition) {

                lastCow = stalls[i];
                count++;

                if (count == cows) {
                    return true;
                }
            }
        }
        return false;
    }


    int findDistance(int[] stalls, int cows) {


        Arrays.sort(stalls);
        int N = stalls.length;

        int start = 0;
        int ans = 0;
        int end = stalls[N - 1] - stalls[0];


        while (start <= end) {

            int mid = (start + end) / 2;
            boolean isPossible = canPlaceCow(stalls, cows, N, mid);

            if (isPossible) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new AggressiveCowsPractice().findDistance(new int[]{1,2,4,8,9}, 3));
    }
}
