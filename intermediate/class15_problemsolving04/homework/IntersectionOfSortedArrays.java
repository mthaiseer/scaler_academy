package intermediate.class15_problemsolving04.homework;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfSortedArrays {

    public int[] intersect(final int[] A, final int[] B) {

        int p1 =0;
        int p2 =0;
        List<Integer> resList = new ArrayList<>();

        int N1 = A.length;
        int N2 = B.length;

        while(p1<N1 && p2 <N2){

            if(A[p1] < B[p2]){
                p1++;
            }else if(A[p1] > B[p2]){
                p2++;
            }else{
                resList.add(A[p1]);
                p1++;
                p2++;
            }
        }

        int [] res = new int[resList.size()];
        int count =0;
        for(int x: resList){
            res[count++] = x;
        }

        return res;
    }

    public static void main(String[] args) {
        IntersectionOfSortedArrays obj = new IntersectionOfSortedArrays();
        int R1[] = obj.intersect(new int[] {1, 2, 3, 3, 4, 5, 6}, new int[] {3,3,5});
       print(R1);
        int R2[] =  obj.intersect(new int[] {3, 5}, new int[] {1, 2, 3 ,3, 4 ,5, 6});
        print(R2);


    }


    static void print(int R[]){
        for(int x: R){
            System.out.print( x + " ");
        }
        System.out.println();
    }

}
