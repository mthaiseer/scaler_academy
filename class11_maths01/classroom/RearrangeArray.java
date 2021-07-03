package class11_maths01.classroom;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangeArray {

    public void arrange(List<Integer> a) {

        int N  = a.size();

        for(int i=0; i< N; i++){
            int c  = a.get(a.get(i));
            int r = (c%N)  * N;
            a.set(i, a.get(i)+r );
        }

        for(int i=0; i< N; i++){
            a.set(i, a.get(i)/N);
        }

    }

    public static void main(String[] args) {
        RearrangeArray obj = new RearrangeArray();

        //obj.arrange(Arrays.asList(1,0));
        obj.arrange(Arrays.asList(3, 2, 0, 1));
    }

}
