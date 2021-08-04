package intermediate.class07_hashing.homework;

import java.util.HashMap;
import java.util.Map;

public class PerfectCards {

    public String solve(int[] A) {

        Map<Integer, Integer> freqMapper = new HashMap<>();

        for(int i=0; i<A.length; i++){

            freqMapper.put(A[i], freqMapper.get(A[i]) == null ? 1 : freqMapper.get(A[i])+1 );
            if(freqMapper.size() > 2){
                return "LOSE";
            }
        }

        int count1= -1;
        int count2 =0;

        for (int C : freqMapper.values()){

            if(count1 ==-1){
                count1 =  C;
            }else{
                count2 = C;
            }


        }

        if(freqMapper.size() == 2 && count1 == count2){
            return "WIN";
        }



        return "LOSE";
    }

    public static void main(String[] args) {
        PerfectCards obj = new PerfectCards();
        System.out.println(obj.solve(new int[] {1,2}));
        System.out.println(obj.solve(new int[] {1, 1, 2, 2, 3}));
    }

}
