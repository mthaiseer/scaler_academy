package class15_problemsolving04.homework;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInSortedArray {

    public int[] solve(int[] A) {

        int left =0;
        List<Integer> resList  = new ArrayList<>();

        for(int right =0; right< A.length; right++){

            if(A[left] !=  A[right]){
                resList.add(A[left]);
                left = right;

            }

        }

        resList.add(A[left]);

        int result[] = new int[resList.size()];
        int pos =0;
        for(int x: resList){
            result[pos++] = x;
        }

        return result;
    }




    public static void main(String[] args) {

        int R[] =  new RemoveDuplicatesInSortedArray().solve(new int[] {1,2,2,3,3,4,4,6});
        print(R);
        int R2[] =  new RemoveDuplicatesInSortedArray().solve(new int[] {1,1,1,1,1,1});
        print(R2);
        int R3[] =   new RemoveDuplicatesInSortedArray().solve(new int[] {1,2});
        print(R3);
        int R4[] =   new RemoveDuplicatesInSortedArray().solve(new int[] {1});
        print(R4);


    }

    static void print(int R[]){
        for(int x: R){
            System.out.print( x + " ");
        }
        System.out.println();
    }
}
