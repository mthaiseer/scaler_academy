package intermediate.class08_sorting.classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortByColor {

    public List<Integer> sortColors(List<Integer> A) {
        if(A== null || A.size() == 0) return new ArrayList<>();

        ArrayList<Integer> result = new ArrayList<>();
        int[] counter = new int[3];
        for(int i=0; i<A.size(); i++){
            counter[A.get(i)]++;
        }

        int start = 0;
        int end = start + counter[0];

        for(int i=start; i<end; i++){
            result.add(0);
        }

        start = counter[0];
        end = start+counter[1];

        for(int i=start; i<end; i++){
            result.add(1);
        }

        start = counter[1];
        end = start+counter[2];

        for(int i=start; i<end; i++){
            result.add(2);
        }


        return result;

    }

    public static void main(String[] args) {

        SortByColor  obj = new SortByColor();
        List<Integer> result  = obj.sortColors(Arrays.asList(0, 1, 2, 0, 1, 2));
        System.out.println(result);
        result  = obj.sortColors(Arrays.asList(0));
        System.out.println(result);

        result  = obj.sortColors(Arrays.asList(1,2,1,2,1,2,0,2,1,1,1,0,0,0,0,2,1,1,1,1,1,2));
        System.out.println(result);

    }
}
