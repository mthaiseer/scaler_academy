package intermediate.class14_problemsolving03.classroom;

import java.util.Arrays;

public class SortUnsortedArray {

    public int solve(int[] A) {

        if(A == null) return -1;

        //make a copy
        int [] B = new int[A.length];
        for(int i=0; i<A.length; i++){
            B[i] = A[i];
        }

        Arrays.sort(A);
        int leftI = 0;
        int rightI =0;

        for(int i=0; i<A.length; i++){
            if(A[i] != B[i]){
                leftI = i;
                break;
            }
        }

        for(int i = A.length-1; i>=0; i--){
            if(B[i] != A[i]){
                rightI = i;
                break;
            }
        }

        if(leftI == 0 && rightI == 0){
            return  0;
        }
        return (rightI - leftI)+1;
    }

    public static void main(String[] args) {
        SortUnsortedArray obj = new SortUnsortedArray();
        System.out.println(obj.solve(new int[]{0, 1, 15, 25, 6, 7, 30, 40, 50}));
        System.out.println(obj.solve(new int[]{10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60}));
        System.out.println(obj.solve(new int[]{1,2,3,4,5,6}));
    }

}
