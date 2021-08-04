package intermediate.class15_problemsolving04.homework;

import java.util.Arrays;
import java.util.List;

public class NBy3RepeatNumber {

    static int appearsNBy3(List<Integer> a) {
        int count1 = 0, count2 = 0;
        int n = a.size();
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (first == a.get(i))
                count1++;

            else if (second == a.get(i))
                count2++;

            else if (count1 == 0) {
                count1++;
                first = a.get(i);
            } else if (count2 == 0) {
                count2++;
                second = a.get(i);
            }
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for (int i = 0; i < n; i++) {
            if (a.get(i) == first)
                count1++;

            else if (a.get(i) == second)
                count2++;
        }

        if (count1 > n / 3)
            return first;

        if (count2 > n / 3)
            return second;

        return -1;
    }

    public int repeatedNumber(final List<Integer> a) {

        int n = a.get(0);
        int candidate = 0;
        int count = 0;
        int globalCount = 0;

        for (int x : a) {

            if (count == 0) {
                candidate = x;
                count = 1;
            } else if (candidate != x) {
                count -= 1;
            } else {
                count++;
            }

        }

        for (int x : a) {
            if (x == candidate) {
                globalCount++;
            }
        }

        int N = a.size() / 3;

        return globalCount >= N ? candidate : n;


    }

    public static void main(String[] args) {
        System.out.println(new NBy3RepeatNumber().repeatedNumber(Arrays.asList(1, 2, 3, 1, 1)));
        System.out.println(new NBy3RepeatNumber().repeatedNumber(Arrays.asList(1, 1, 1, 2, 3, 5, 7)));
        System.out.println(new NBy3RepeatNumber().appearsNBy3(Arrays.asList(1, 1, 1, 2, 3, 5, 7)));
    }


}
