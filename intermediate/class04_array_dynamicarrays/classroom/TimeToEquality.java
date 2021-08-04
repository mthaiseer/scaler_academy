package intermediate.class04_array_dynamicarrays.classroom;

import java.util.Arrays;

public class TimeToEquality {

    public static int solve(int[] A) {
        int seconds = 0;
        if (A == null || A.length <= 1) {
            return 0;
        }
        Arrays.sort(A);
        int max = A[A.length - 1];

        for (int i = 0; i < A.length - 1; i++) {

            seconds += max - A[i];

        }

        return seconds;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 4, 1, 3, 2}));
        System.out.println(solve(new int[]{2, 2,2,2,2}));
    }
}
