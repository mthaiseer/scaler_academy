package advance.class11_sortingI.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeTwoSortedArrays {

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {


        int i=0;
        int j =0;
        int m  = A.size();
        int n = B.size();

        ArrayList<Integer> result = new ArrayList<>();

        while( i < m && j <n ){

            if(A.get(i) < B.get(j)){
                result.add(A.get(i));
                i++;
            }else{
                result.add(B.get(j));
                j++;
            }
        }

        while(i < m){
            result.add(A.get(i));
            i++;
        }

        while(j < n){
            result.add(B.get(j));
            j++;
        }

        return result;

    }

    public static void main(String[] args) {

        System.out.println(new MergeTwoSortedArrays().solve(Arrays.asList(4, 7, 9), Arrays.asList(2, 11, 19) ));
        System.out.println(new MergeTwoSortedArrays().solve(Arrays.asList(1), Arrays.asList(2) ));
    }

}
