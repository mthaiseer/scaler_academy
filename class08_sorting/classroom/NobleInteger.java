package class08_sorting.classroom;

import java.util.Arrays;

public class NobleInteger {

    public int solve(int[] A) {

        if(A == null || A.length == 0 ) return -1;

        Arrays.sort(A);

        if(A.length ==1 && A[0] == 0) return 1;


        if(A.length> 1 && A[A.length-1] == 0 ){
            return 1;
        }

        for(int i=0; i<A.length-1; i++){

            if(i < A. length-1 && A[i] == A[i+1]){
                //  i++;
                continue;
            }

            if(A[i] ==  (A.length -  i - 1)){
                return 1;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        NobleInteger obj = new NobleInteger();
        System.out.println(obj.solve(new int[]{1,2,3,3}));
        System.out.println(obj.solve(new int[]{1,2,4,5,6,8,10,11}));
        System.out.println(obj.solve(new int[]{1,1,1,5}));
        System.out.println(obj.solve(new int[]{-1, -2, 0, 0, 0, -3}));
        System.out.println(obj.solve(new int[]{0}));
        System.out.println(obj.solve(new int[]{-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5 }));
    }

}
