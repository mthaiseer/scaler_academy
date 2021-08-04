package intermediate.class15_problemsolving04.homework;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArrays {

    public int[] solve(final int[] A, final int[] B) {

        int p1 =0;
        int p2 = 0;
        int N1 = A.length;
        int N2 = B.length;
        List<Integer> resList = new ArrayList<>();

        while(p1< N1 && p2 < N2){

            if(A[p1]< B[p2]){
                resList.add(A[p1]);
                p1++;
            }else{
                resList.add(B[p2]);
                p2++;
            }
        }

        while(p1< N1){
            resList.add(A[p1]);
            p1++;
        }

        while (p2< N2){
            resList.add(B[p2]);
            p2++;
        }

       int res[] = new int[resList.size()];
        int counter =0;
        for(int x :resList){
            res[counter++] = x;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] A =  {4,7,9,20, 24, 50};
        int [] B = {2,11, 19};

        int R [] =  new MergeSortedArrays().solve(A, B);
        for(int x: R){
            System.out.print(x + " ");
        }
        System.out.println();
    }

}
