package class09_strings.homework;

import java.util.*;

public class ChangeCharacter {

    public int solve(String A, int B) {

        if(A == null)  return -1;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        List<Character> charList = new ArrayList<>();

        //find freq
        for(int i=0; i<A.length(); i++){
            char ch  = A.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0)+1);
        }

        //sort based on frequency
        frequencyMap.entrySet().stream()
                .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                .forEach(record -> {
                    Character key = record.getKey();
                    if(!charList.contains(key)){
                        charList.add(key);
                    }

         });

        int pointer = charList.size()-1;

        while(B>0 && pointer>=0){

            char highestChar = charList.get(0);
            char lastChar  =  charList.get(pointer);
            int  lastItemCount  =  frequencyMap.get(lastChar);
            if(B>= lastItemCount){
                B -= lastItemCount;
                frequencyMap.put(highestChar, frequencyMap.get(highestChar)+lastItemCount);
                frequencyMap.remove(lastChar);
                pointer--;
            }else{
                break;
            }
        }
        return frequencyMap.size();
    }


    public static void main(String[] args) {
        ChangeCharacter obj = new ChangeCharacter();
        System.out.println(obj.solve("abcabbccd", 3));
        System.out.println(obj.solve("qghumeaylnlfdxfircvscxggbwkfnqduxwfnfozvsrtkjprepggxrpnrvystmwcysyycqpevikeffmznimkkasvwsrenzkycxfxtlsgypsfadpooefxzbcoejuvpvaboygpoeylfpbnpljvrvipyamyehwqnqrqpmxujjloovaowuxwhmsncbxcoksfzkvatxdknlyjyhfixjswnkkufnuxxzrzbmnmgqooketlyhnkoaugzqrcddiuteiojwayyzpvscmpsajlfvgubfaaovlzylntrkdcpwsrtesjwhdizcobzcnfwlqijtvdwvxhrcbldvgylwgbusbmborxtlhcsmpxohgmgnkeufdxotogbgxpeyanfetcukepzshkljugggekjdqzjenpevqgxiepjsrdzjazujllchhbfqmkimwzobiwybxduunfsksrsrtekmq", 119));
    }
}
