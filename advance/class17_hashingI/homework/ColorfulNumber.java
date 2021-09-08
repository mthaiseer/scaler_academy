package advance.class17_hashingI.homework;

import java.util.*;

public class ColorfulNumber {

    /**
     * 1. extract each digits
     * 2. find product of each subaraay and store to HashMap
     * 3. If product found again, return 0, else 1
     * @param A
     * @return
     */
    public int colorful(int A) {

        List<Integer> digits = new ArrayList<>();
        Set<Integer> cache =new HashSet<>();

        while(A> 0){
            int d = A%10;
            digits.add(d);
            A = A/10;

        }

        Collections.reverse(digits);

        int[] digitArray = digits.stream().mapToInt(Integer::intValue).toArray();

        for(int i=0; i<digitArray.length; i++){
            int product =1;
            for(int j=i; j<digitArray.length; j++){

                product*= digitArray[j];

                if(cache.contains(product)){
                    return 0;
                }
                cache.add(product);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(new ColorfulNumber().colorful(236));
        System.out.println(new ColorfulNumber().colorful(23));
    }

}
