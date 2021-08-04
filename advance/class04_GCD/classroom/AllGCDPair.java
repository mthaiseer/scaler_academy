package advance.class04_GCD.classroom;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class AllGCDPair {

    public int[] solve(int[] A) {

        int N = A.length;

        //sort A in ascending order and reverse
        Arrays.sort(A);
        reverse(A);

        //create frequency array
        int[] frequecy = new int[A[0]+1];
        for(int i=0; i<A.length; i++){

            frequecy[A[i]]++;

        }
        //create new result array which SQRT(size A)
        int resultSize = (int)Math.sqrt(N);
        int [] result = new int [resultSize];
        int leftWindow =0;


        //iterate new sorted array, so
        for(int i=0; i<A.length; i++){

            if(frequecy[A[i]] > 0 && leftWindow < N){

                result[leftWindow] = A[i];
                frequecy[result[leftWindow]]--;
                leftWindow++;
                for(int j=0; j <leftWindow; j++){

                    if(i != j){

                        int gcd = GDC(A[i], result[j]);
                        frequecy[gcd] -=2;

                    }

                }
            }
        }
        return result;
    }

    int GDC(int A, int B){
        if(B  == 0) return A;
        return GDC(B, A%B);

    }

    void print(int A[]){
        for(int c: A){
            System.out.print(" "+c);
        }
        System.out.println();
    }

    void reverse(int[] A){

        int start =0;
        int end = A.length-1;

        while(start < end){

            int temp  = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;

        }


    }

    public static void main(String[] args) {
        AllGCDPair obj = new AllGCDPair();
        int arr[] =  obj.solve(new int [] {4,2,4,2,6,2,4,2,8});
        for(int i=0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }

        System.out.println();

        int arr2[] =  obj.solve(new int [] {5, 5, 5, 15});
        for(int i=0; i<arr2.length; i++){
            System.out.print( arr2[i] + " ");
        }
    }






}
