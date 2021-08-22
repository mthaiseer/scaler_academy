package advance.class11_sortingI.homework;

import java.util.Arrays;

public class NumberConsecutive {

    public int solve(int[] A) {

        int result =1;

        Arrays.sort(A);

        for(int i=1; i<A.length; i++){
            if((A[i] - A[i-1]) >  1){
                return 0;
            }
        }


        return result;
    }

    public static void main(String[] args) {
        System.out.println(new NumberConsecutive().solve(new int[] {3, 2, 1, 4, 5}));
        System.out.println(new NumberConsecutive().solve(new int[] {1, 3, 2, 5}));
    }

}
