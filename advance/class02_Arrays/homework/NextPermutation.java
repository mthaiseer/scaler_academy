package advance.class02_Arrays.homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NextPermutation {

    void swap(int[] A, int i, int j){

        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;

    }

    public int[] nextPermutation(int[] A) {

        int N  = A.length;
        int V[] = A.clone();
        int dip =0;
        //find first dip

        for(int i=N-2; i>=0; i--){

            if(V[i] < V[i+1] ){
                dip = i;
                break;
            }

        }

        //swap next greater element from dip
        for(int i=N-1; i>=dip; i--){

            if(V[i] > V[dip]){
                swap(V, i,dip);
                dip++;
            }

        }

        //sort from dip
        for(int i=0; i<(N-dip)/2; i++){
            swap(V,i+dip, N-i-1);
        }

        int result[] = new int[V.length];
        for(int i=0; i<V.length; i++){
            result[i] = V[i];
        }


        return result;

    }

    public static void main(String[] args) {
        int A[] =  new NextPermutation().nextPermutation(new int[]{1,2,3,6,5,4});
        Arrays.stream(A).forEach(it->{
            System.out.print(it + " ");
        });

        System.out.println();
        Arrays.stream(new NextPermutation().nextPermutation(new int[]{3,2,1})).forEach(it->{
            System.out.print(it+ " ");
        });
    }
}
