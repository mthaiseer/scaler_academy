package intermediate.class07_hashing.homework;

import java.util.*;

public class Equals {

    public int[] equal(int[] A) {


        Map<Integer, int[]> cache = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();
        int result[]= new int[4];
        for(int i=0; i<A.length; i++){
            for(int j=i+1; j<A.length; j++){

                int sum  = A[i] + A[j];

                if(cache.containsKey(sum)){
                    int prev[] = cache.get(sum);

                    int k =  prev[0];
                    int l =  prev[1];
                    int m =  i;
                    int n =  j;

                    if(k != m && k!=n && l!= m && l!=n){
                        List<Integer> sub = new ArrayList<>();
                        sub.add(k);
                        sub.add(l);
                        sub.add(m);
                        sub.add(n);

                        res.add(sub);
                    }

                }else{
                    int[] sub = new int[2];
                    sub[0] = i;
                    sub[1] = j;
                    cache.put(sum, sub);
                }

            }
        }

       if(res != null){
           Collections.sort(res, new ListComparator<>());
           List<Integer> resList = res.get(0);
           int[] resArray = new int[4];
           resArray[0] = resList.get(0);
           resArray[1] = resList.get(1);
           resArray[2] = resList.get(2);
           resArray[3] = resList.get(3);

           return resArray;


       }

        return new int[] {};
    }

    public static void main(String[] args) {

        Equals obj = new Equals();
        int res[] =  obj.equal(new int[]{3, 4, 7, 1, 2, 9, 8} );
        for(int x: res){
            System.out.print( x + " ");
        }

        System.out.println();

        int res2[] =  obj.equal(new int[]{2,5,1,6} );
        for(int x: res2){
            System.out.print( x + " ");
        }


    }

    class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

        @Override
        public int compare(List<T> o1, List<T> o2) {
            for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
                int c = o1.get(i).compareTo(o2.get(i));
                if (c != 0) {
                    return c;
                }
            }
            return Integer.compare(o1.size(), o2.size());
        }

    }

}
