package class07_hashing.homework;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.*;

public class ColorfulNumber {

    public int colorful(int A) {

        List<Integer> digits = new ArrayList<>();

        while(A > 0){
            int digit = A %10;
            digits.add(digit);
            A = A/10;
        }

        Collections.reverse(digits);
        int[] digitArray = digits.stream().mapToInt(i->i).toArray();

        Set<Integer> cache = new HashSet<>();
        for(int i=0; i<digitArray.length; i++){
            int product =1;
            for(int j=i; j<digitArray.length; j++){
                product =  product * digitArray[j];

                if(cache.contains(product)){
                    return 0;
                }
                cache.add(product);
            }
        }


        return 1;
    }

    public static void main(String[] args) {
        ColorfulNumber obj = new ColorfulNumber();
        System.out.println(obj.colorful(23));
        System.out.println(obj.colorful(236));

    }
}
