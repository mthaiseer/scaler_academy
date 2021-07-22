package class17_problemsolving06.classroom;

import java.util.ArrayList;
import java.util.List;

public class NonDecreasingArray {

    public int[] solve(int[] A, int[][] B) {

        int prefix [] = new int[A.length+1];
        List<Integer> resultList = new ArrayList<>();
        prefix[0] =0;
        prefix[1] =0;

        for(int i=1;i<A.length; i++){

            if(A[i-1]> A[i]){
                prefix[i+1] = prefix[i]+ 1;
            }else{
                prefix[i+1] = prefix[i];
            }

        }

        for(int i=0; i<B.length; i++){
            int q1 = B[i][0];
            int q2 = B[i][1];

            int R = prefix[q2] - prefix[q1] == 0 ? 1: 0;
            resultList.add(R);




        }

        int [] rArr= new int[resultList.size()];
        int i =0;
        for(int x:resultList){
            rArr[i] =x;
            i++;
        }
        return rArr;


    }

    public static void main(String[] args) {
        NonDecreasingArray obj = new NonDecreasingArray();
        int A[] =  {1,7,3,4,9};

        int B[][] = {
                {1,2},
                {2, 4}
        };
       int R[] =  obj.solve(A, B);
        for(int x:R){
            System.out.print(x + " ");
        }
        System.out.println();

        //****************
        int A1[] = {3, 5, 19, 15, 17, 14, 2, 20, 2, 15};
        int B1[][] = {
                {3, 10},
                {7, 9},
                {5, 9},
                {6, 10},
                {3, 7},
                {7, 8},
                {3, 4},
                {3, 8},
                {2, 4},
                {5, 6}
        };

        int R1[] =  obj.solve(A1, B1);
        for(int x:R1){
            System.out.print(x + " ");
        }

    }
}
