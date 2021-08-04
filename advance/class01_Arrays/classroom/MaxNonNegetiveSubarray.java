package advance.class01_Arrays.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Kadane algorithms
 */
public class MaxNonNegetiveSubarray {

    public int[] maxset(int[] A) {

        int left = -1;
        int ansLeft = 0;
        int right = 0;
        int ansRight = 0;
        long maxSum = Integer.MIN_VALUE;
        long windowSum = 0;


        for (right = 0; right < A.length; right++) {

            windowSum += A[right]==0L ? 1: A[right];

            if (windowSum > maxSum) {

                maxSum = Math.max(windowSum, maxSum);
                ansLeft = left;
                ansRight = right;

            }
            if (A[right] < 0) {
                left = right;
                windowSum = 0;
            }


        }

        if(maxSum <0){
            return new int[]{};
        }
        List<Integer> ansList = new ArrayList<>();
        for(int i= (ansLeft + 1); i<=ansRight; i++){

            ansList.add(A[i]);
        }

        return ansList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {

        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{1, 2, 5, -7, 2, 3})).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{10, -1, 2, 3, -4, 100})).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{1, 2, 5, -7, 2, 3, -10, 3, 5, 6, 8, 9})).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{ -1, -1, -1, -1, -1})).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{ 0, 0, -1, 0})).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{  -846930886, -1714636915, 424238335, -1649760492 })).forEach(e -> {
            System.out.print(e + " ");
        });

        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{  -54961, 3510, -50805, -82137, -39096, -47421  })).forEach(e -> {
            System.out.print(e + " ");
        });

        System.out.println("************");
        Arrays.stream(new MaxNonNegetiveSubarray().maxset(new int[]{  1967513926, 1540383426, -1303455736, -521595368 })).forEach(e -> {
            System.out.print(e + " ");
        });
    }



}
