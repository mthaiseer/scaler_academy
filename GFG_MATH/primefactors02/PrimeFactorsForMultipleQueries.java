package GFG_MATH.primefactors02;

import java.util.Arrays;
import java.util.List;

public class PrimeFactorsForMultipleQueries {

    //** find seieve technique for find smallest primes for each number
    // find seive slot number and divide N to find next smallest

    void smallestDivisorsMutlpleQueries(List<Integer> L) {

        int N = 1000;

        int[] seive = new int[N + 1];

        //pre-calculate Sieve with smallest primes in its multiples
        for (int i = 2; i * i <= N; i++) {

            for (int j = i * 2; j <= N; j += i) {
                if (seive[j] == 0) {
                    seive[j] = i;
                }

            }

        }

        for (int x : L) {

            System.out.println();
            while (x > 1) {

                int divisor  = seive[x] == 0? x : seive[x];
                System.out.print(divisor + " ");

                x /= divisor;
            }


        }

    }

    public static void main(String[] args) {
        PrimeFactorsForMultipleQueries obj = new PrimeFactorsForMultipleQueries();
        obj.smallestDivisorsMutlpleQueries(Arrays.asList(10, 50, 12, 21, 23));
    }

}
