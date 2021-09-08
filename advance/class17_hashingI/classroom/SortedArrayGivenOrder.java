package advance.class17_hashingI.classroom;

import java.util.*;

public class SortedArrayGivenOrder {

    public int[] solve(int[] A, int[] B) {

        Map<Integer, Integer> cache = new HashMap<>();
        Set<Integer> visited = new HashSet<>();
        List<Integer> answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();



        for(int a: A){
            cache.put(a, cache.getOrDefault(a, 0)+1);
        }

        for(int b: B){

            while (cache.get(b)!= null && cache.get(b)> 0){
                answer.add(b);
                cache.put(b, cache.get(b)-1);

            }
            visited.add(b);

        }

        for(int a: A){
           if(!visited.contains(a)){
               temp.add(a);
           }
        }

        Collections.sort(temp);

        for(int t: temp){
            answer.add(answer.size(), t);
        }

        int ans[] = new int[answer.size()];
        int k=0;

        for(int x: answer){
            ans[k] = x;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {
       Arrays.stream(new SortedArrayGivenOrder().solve(new int[]{1,2,3,4,5}, new int[]{5,4,2})).forEach(it->{
           System.out.print(it+ " ");
       });
        System.out.println();

        Arrays.stream(new SortedArrayGivenOrder().solve(new int[]{7,4,1,2,9}, new int[]{2,10,4,7})).forEach(it->{
            System.out.print(it+ " ");
        });
        System.out.println();

        Arrays.stream(new SortedArrayGivenOrder().solve(new int[]{10, 2, 18, 16, 16, 16}, new int[]{3, 13, 2, 16, 4, 19})).forEach(it->{
            System.out.print(it+ " ");
        });
        System.out.println();
    }

}
