package advance.class02_Arrays.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Pair{

    int v;
    int i;

    public Pair(int v, int i){
        this.v = v;
        this.i = i;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "v=" + v +
                ", i=" + i +
                '}';
    }
}
public class MaxDistance {

    public int maximumGap(final int[] A) {

        List<Pair> pairList = new ArrayList<>();

        //create list Pair<value, index>
        for(int i=1; i<=A.length; i++){
            pairList.add(new Pair(A[i-1], i));
        }

        //sort list based of array value
        pairList.sort(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {


                if (o1.v < o2.v)
                    return -1;
                else if (o1.v == (o2.v))
                    return 0;

                else
                    return 1;
            }
        });

        int maxDistance = 0;
        int maxIndex = pairList.get(pairList.size()-1).i;
        for(int i=pairList.size()-2; i>=0; i--){

            maxDistance = Math.max(maxDistance, (maxIndex-pairList.get(i).i));
            maxIndex = Math.max(maxIndex, pairList.get(i).i);
        }
      return maxDistance;
    }

    public static void main(String[] args) {
        MaxDistance  obj = new MaxDistance();
        System.out.println(obj.maximumGap(new int[]{3,5,4,2}));
    }


}
