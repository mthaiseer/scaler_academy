package advance.class07_bitwise.classroom;

import java.util.Arrays;

public class MinXORValue {

    public int findMinXor(int[] A) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(A);
        int xor= A[0];

        for(int i=1; i<A.length; i++){

            xor=A[i-1]^ A[i];
            ans = Math.min(ans, xor);

        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new MinXORValue().findMinXor(new int[]{0, 2, 5, 7}));
        System.out.println(new MinXORValue().findMinXor(new int[]{0, 4, 7, 9}));
    }
}
