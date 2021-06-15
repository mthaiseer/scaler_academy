package class07_hashing.classroom;

import java.util.*;

public class CommonElements {

    public int[] solve(int[] A, int[] B) {

        Map<Integer, Integer> counterMap = new HashMap<>();
        List<Integer> resList = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            counterMap.put(A[i], counterMap.getOrDefault(A[i], 0) + 1);
        }

        for (int i = 0; i < B.length; i++) {
            if (counterMap.get(B[i]) != null && counterMap.get(B[i]) > 0) {
                resList.add(B[i]);
                counterMap.put(B[i], counterMap.get(B[i]) - 1);

                if (counterMap.get(B[i]) == 0) {
                    counterMap.remove(B[i]);
                }
            }
        }

        int[] result = new int[resList.size()];
        int i = 0;
        for (int c : resList) {
            result[i++] = c;
        }

        return result;

    }

    public static void main(String[] args) {
        CommonElements obj = new CommonElements();
        int result[] = obj.solve(new int[]{1, 2, 2, 1}, new int[]{2, 3, 1, 2});
        for (int r : result) {
            System.out.print(r + " ");
        }

        System.out.println();

        int result1[] = obj.solve(new int[]{2, 1, 4, 10}, new int[]{3, 6, 2, 10, 10});
        for (int r : result1) {
            System.out.print(r + " ");
        }

    }
}
