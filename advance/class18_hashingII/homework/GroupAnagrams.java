package advance.class18_hashingII.homework;

import java.util.*;

public class GroupAnagrams {


    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {

        List<String> hashCodeStringList = convertToCode(A);
        Map<String, ArrayList<Integer>> res = new LinkedHashMap<>();

        ArrayList<ArrayList<Integer>> finalResult  = new ArrayList<>();


        int k =0;
        for(String str: hashCodeStringList){

            if(res.get(str) == null){
                ArrayList<Integer> inner = new ArrayList<>();
                inner.add(k+1);
                k++;
                res.put(str,inner);
            }else{
                ArrayList<Integer> inner  =  res.get(str);
                inner.add(k+1);
                k++;
                res.put(str, inner);
            }
        }

        for (Map.Entry<String, ArrayList<Integer>> entry : res.entrySet()) {
            ArrayList<Integer> value = entry.getValue();
            finalResult.add(value);
        }
        return finalResult;
    }

    private List<String> convertToCode(List<String> A) {

        List<String> result  = new ArrayList<>();

        for(String a : A){
            int[] ascii = new int[26];
            for(int i=0; i<a.length(); i++){
                int c = a.charAt(i) - 'a';
                ascii[c]++;
            }
            StringBuffer buffer = new StringBuffer();
            for(int i=0; i<26; i++){
                buffer.append("#").append(ascii[i]);
            }
            result.add(buffer.toString());
        }

        return result;

    }

    public static void main(String[] args) {
        System.out.println(new GroupAnagrams().anagrams( Arrays.asList("cat", "dog", "god", "tca")));
        System.out.println(new GroupAnagrams().anagrams( Arrays.asList("rat", "tar", "art")));
    }


}
