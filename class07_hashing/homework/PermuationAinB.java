package class07_hashing.homework;

import java.util.HashMap;
import java.util.Map;

public class PermuationAinB {

    public int solve(String A, String B) {

        int N = A.length();
        int M = B.length();

        Map<Character, Integer> aFreqMap = new HashMap<>();
        Map<Character, Integer> bFreqMap = new HashMap<>();

        for(int i =0; i<A.length(); i++){
            aFreqMap.put(A.charAt(i), aFreqMap.get(A.charAt(i)) == null? 1 : aFreqMap.get(A.charAt(i))+1);
        }

        int start =0;
        int count =0;
        for(int end =0; end<M; end++){

            bFreqMap.put(B.charAt(end), bFreqMap.get(B.charAt(end)) == null? 1 : bFreqMap.get(B.charAt(end))+1);

            if(end >=N-1){

                if(aFreqMap.equals(bFreqMap)){
                    count++;
                }
                bFreqMap.put(B.charAt(start), bFreqMap.get(B.charAt(start))-1);

                if(bFreqMap.get(B.charAt(start)) != null && bFreqMap.get(B.charAt(start))== 0){
                    bFreqMap.remove(B.charAt(start));
                }
                start++;




            }

        }
         return count;
    }

    public static void main(String[] args) {
        PermuationAinB obj = new PermuationAinB();
//        int s = obj.solve("abc", "abcbacabc");
//        System.out.println(s);

        int s = obj.solve("p", "pccdpeeooadeocdoacddapacaecb");
        System.out.println(s);

    }


}
