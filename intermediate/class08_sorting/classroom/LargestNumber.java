package intermediate.class08_sorting.classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

    public String largestNumber(final int[] A) {

        if(A == null || A.length ==0) return null;
        if(A.length == 1){
            return ""+A[0];
        }

        boolean allZeros  = true;
        for(int i=1; i<A.length; i++){
            if(A[i] != 0){
                allZeros = false;
            }
        }

        if(allZeros) return "0";

        List<String> strings = new ArrayList<>();
        for(int i=0 ;i<A.length; i++){
            strings.add(""+A[i]);
        }

        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String A, String B) {

                String AB = A+B;
                String BA = B+A;
                return AB.compareTo(BA) > 0? -1: 1;
            }
        });

        StringBuilder builder = new StringBuilder();

        for(String s: strings){
           builder.append(s);
        }


        return builder.toString();

    };

    public static void main(String[] args) {

        LargestNumber obj = new LargestNumber();
        String  res =  obj.largestNumber(new int[]{3, 30, 34, 5, 9});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{2, 3, 9, 0});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{9,9,9,9});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{0,0,0,0});
        System.out.println(res);

        res =  obj.largestNumber(new int[]{1});
        System.out.println(res);
    }

}
