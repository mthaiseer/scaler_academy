package intermediate.class08_sorting.homework;

import java.util.Arrays;

public class WaveArray {

    public int[] wave(int[] A) {

        Arrays.sort(A);

        for(int i=0; i<A.length; i+=2){

            if((i+1) < A.length){
                swap(A, i, i+1);
            }


        }

        return A;
    }

    void swap(int [] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
        WaveArray obj = new WaveArray();

        int a[] =  obj.wave(new int[] {1,2,3,4});
        for(int x: a){
            System.out.print(x + " ");
        }

        System.out.println();

        int a2[] =  obj.wave(new int[] {1,2,3,4, 5});
        for(int x: a2){
            System.out.print(x + " ");
        }

        System.out.println();

        int a3[] =  obj.wave(new int[] {1,2});
        for(int x: a3){
            System.out.print(x + " ");
        }

        System.out.println();

        int a4[] =  obj.wave(new int[] {1});
        for(int x: a4){
            System.out.print(x + " ");
        }

        System.out.println();
        int a6[] =  obj.wave(new int[] {4, 5,3, 1,2});
        for(int x: a6){
            System.out.print(x + " ");
        }

    }
}
