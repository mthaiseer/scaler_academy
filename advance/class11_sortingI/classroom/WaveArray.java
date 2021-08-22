package advance.class11_sortingI.classroom;

import java.util.Arrays;

public class WaveArray {

    void swap(int A[], int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public int[] wave(int[] A) {

        Arrays.sort(A);
        for(int i=0; i<A.length-1; i+=2){
            swap(A, i, i+1);
        }
        return A;
    }

    public static void main(String[] args) {
        Arrays.stream(new WaveArray().wave(new int[]{1, 2, 3, 4})).forEach(it->{
            System.out.print(it+ "  ");
        });
        System.out.println();

        Arrays.stream(new WaveArray().wave(new int[]{3,9,7,6,2})).forEach(it->{
            System.out.print(it+ "  ");
        });
    }

}
