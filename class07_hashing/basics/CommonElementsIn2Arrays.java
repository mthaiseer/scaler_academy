package class07_hashing.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsIn2Arrays {

    private List<Integer> solve(int A[], int B[]){

        List<Integer> result= new ArrayList<>();
        Set<Integer> cache = new HashSet<>();

        for (int i=0; i<A.length; i++){
            cache.add(A[i]);
        }

        for (int i=0; i<B.length; i++){

            if(cache.contains(B[i])){
                result.add(B[i]);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        CommonElementsIn2Arrays obj= new CommonElementsIn2Arrays();
        List<Integer>  result = obj.solve(new int[] {1,2,3,4,2, 8}, new int[] {1,3,2,10});
        System.out.println(result);

    }
}
