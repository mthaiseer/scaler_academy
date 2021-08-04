package intermediate.class06_arrayProblems;

import java.util.HashMap;
import java.util.Map;

public class MinimizeDifference {

    public int solve(int[] A, int B) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int x : A){
            min = Math.min(min, x);
            max = Math.max(max, x);
            countMap.put(x, countMap.getOrDefault(x, 0)+1);
        }

        while(B>0){

            if((max - min) ==0 ){
                return 0;
            }

            if(countMap.get(min) <= countMap.get(max)){
                if(B>=countMap.get(min)){

                    B -= countMap.get(min);
                    countMap.put(min+1, countMap.get(min)+ (countMap.get(min+1)== null? 0: countMap.get(min+1)));
                    countMap.put(min, 0);

                    min++;


                }else{
                    break;
                }
            }else{

                if(B>=countMap.get(max)){

                    B -= countMap.get(max);
                    int nextLowestCount = countMap.get(max-1) == null? 0: countMap.get(max-1);
                    countMap.put(max-1, (countMap.get(max)+nextLowestCount));
                    countMap.put(max, 0);
                    max--;
                }else{
                    break;
                }

            }


        }
        return (max-min);
    }

    public static void main(String[] args) {
        MinimizeDifference obj = new MinimizeDifference();
//        System.out.println(obj.solve(new int[] {2, 6, 3, 9, 8}, 3));
//        System.out.println(obj.solve(new int[] {4, 6, 3, 1, 4}, 5));
        System.out.println(obj.solve(new int[] {4, 1}, 6));
    }



}
