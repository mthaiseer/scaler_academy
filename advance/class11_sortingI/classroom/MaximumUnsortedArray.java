package advance.class11_sortingI.classroom;

import java.util.Arrays;

public class MaximumUnsortedArray {

    public int[] subUnsort(int[] A) {

        int B[] = A.clone();
        Arrays.sort(B);
        int l= -1;
        int r = -1;

        for(int i=0;i<A.length; i++){

            if(A[i] != B[i]){
                l  = i;
                break;
            }

        }

        for(int i=A.length-1;i>=0; i--){

            if(A[i] != B[i]){
                r  = i;
                break;
            }

        }

        if(l != -1){
            int[] res = new int[2];
            res[0] = l;
            res[1] = r;
            return res;
        }



        return new int[] {-1};


    }

    public static void main(String[] args) {
        Arrays.stream(new MaximumUnsortedArray().subUnsort(new int[] {1, 3, 2, 4, 5})).forEach(it->{
            System.out.print(it+  " ");
        });
        System.out.println();

        Arrays.stream(new MaximumUnsortedArray().subUnsort(new int[] {1, 2, 3, 4, 5})).forEach(it->{
            System.out.print(it);
        });
    }

}
