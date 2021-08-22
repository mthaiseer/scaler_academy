package advance.class09_backtracking.practice;

import java.util.Arrays;

public class GenerateBinaryString01 {

    void generateBinaryString(int A[], int idx){

        if(idx == A.length){


            for(int i=0; i<A.length; i++){
                System.out.print(A[i]);
            }
            System.out.println();
            return;
        }

        A[idx] = 0;
        generateBinaryString(A, idx+1);

        //backtracking
        A[idx] = 1;
        generateBinaryString(A, idx+1);

    }

    public static void main(String[] args) {

        int N =5;
        int A[] = new int[N];
        new GenerateBinaryString01().generateBinaryString(A, 0);

    }

}
