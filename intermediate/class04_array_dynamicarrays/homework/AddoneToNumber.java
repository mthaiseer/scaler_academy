package intermediate.class04_array_dynamicarrays.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddoneToNumber {

    public static int[] plusOne(int[] A) {

        //check base conditioon
        if(A == null){
            return A;
        }
        //reverse array
        reverse(A);

        List<Integer> resultList = new ArrayList<>();

        //add calculation
        int carry = 1;
        for(int i=0; i<A.length; i++){

            int add = A[i] + carry;
            resultList.add(add % 10);
            carry = add /10;

        }

        if(carry > 0){
            resultList.add(carry);
        }
        Collections.reverse(resultList);

        while(resultList.get(0) == 0){
            resultList.remove(0);
        }

        int result [] = new int[resultList.size()];
        int i =0;

        for(int a: resultList){
            result[i] = a;
            i++;
        }

        return result;
    }

    static void print(int A[]){
        for(int i=0; i<A.length; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int A[]){

        int start = 0;
        int end = A.length-1;

        while(start <= end){

            int temp = A[start];
            A[start ] = A[end];
            A[end] = temp;

            start++;
            end--;
        }



    }

    public static void main(String[] args) {

        int A[] =  plusOne(new int[] {9,9,9});
        print(A);
        int B[] =  plusOne(new int[] {1,2,3});
        print(B);
        int C[] =  plusOne(new int[] { 0, 3, 7, 6, 4, 0, 5, 5, 5});
        print(C);

        int D[] =  plusOne(new int[] { 0, 0,1,2,3,4});
        print(D);

    }

}
