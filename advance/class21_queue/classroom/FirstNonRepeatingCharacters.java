package advance.class21_queue.classroom;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class FirstNonRepeatingCharacters {

    public String solve(String A) {


        Map<Character, Integer> charMap = new HashMap<>();
        Deque<Character> queue = new LinkedList<>();
        StringBuffer buffer = new StringBuffer();
        for(int i=0; i<A.length(); i++){
            char c = A.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
            queue.addLast(c);

            while(queue.isEmpty() == false && charMap.get(queue.peek()) > 1){
                queue.removeFirst();
            }
            if(!queue.isEmpty()){
                buffer.append(queue.peek());
            }else{
                buffer.append("#");
            }
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(new FirstNonRepeatingCharacters().solve("abadbc"));
        System.out.println(new FirstNonRepeatingCharacters().solve("abcabc"));
    }

}
