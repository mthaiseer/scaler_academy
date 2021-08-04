package intermediate.class08_sorting.homework;

import java.util.Arrays;

public class ElementRemoval {

    public int solve(int[] A) {
        int sum=0;

        int [] prefixsum = new int[A.length];


        if(A==  null || A.length == 0) return 0;

        if(A.length == 1){
            return A[0];
        }

        Arrays.sort(A);

        prefixsum[0] = A[0];
        for(int i=1; i<A.length; i++){
            prefixsum[i] = prefixsum[i-1]+A[i];
        }

        for(int i=A.length-1; i>=0; i--){
            sum+=prefixsum[i];
        }


        return sum;

    }

    public static void main(String[] args) {

        ElementRemoval obj = new ElementRemoval();
//        System.out.println((obj.solve(new int[] {2,1})));
//        System.out.println((obj.solve(new int[] {2})));
//
//        System.out.println((obj.solve(new int[] {1,2,3})));
//        System.out.println((obj.solve(new int[] {2,3,1})));
        System.out.println((obj.solve(new int[] {3, 0, 9, 7, 8})));

    }
}
