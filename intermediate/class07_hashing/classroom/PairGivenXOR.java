package intermediate.class07_hashing.classroom;

import java.util.HashSet;
import java.util.Set;

public class PairGivenXOR {

    public int solveBruteForce(int[] A, int B) {

        int count = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {

                if ((A[i] ^ A[j]) == B) {
                    count++;
                }

            }
        }
        return count;
    }

    public int solve(int[] A, int B) {

        int count = 0;
        Set<Integer>  cache = new HashSet<>();

        for(int i=0; i<A.length; i++){

            if(cache.contains(A[i]^B)){
                count++;
            }else{
                cache.add(A[i]);
            }
        }

        return count;


    }

    public static void main(String[] args) {
        PairGivenXOR obj = new PairGivenXOR();
        System.out.println(obj.solveBruteForce(new int[] {5, 4, 10, 15, 7, 6}, 5));
        System.out.println(obj.solveBruteForce(new int[] {3, 6, 8, 10, 15, 50}, 5));
        System.out.println("----optimized-----");
        System.out.println(obj.solve(new int[] {5, 4, 10, 15, 7, 6}, 5));
        System.out.println(obj.solve(new int[] {3, 6, 8, 10, 15, 50}, 5));
    }

}
