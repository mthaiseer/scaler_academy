package advance.class18_hashingII.classroom;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ReplicatingSubstring {

    public int solve(int A, String B) {

        if(B.length() % A != 0){
            return -1;
        }

        Map<Character, Integer> freq=new HashMap<>();
        Set<Character> visited = new HashSet<>();

        for(Character c: B.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0)+1);
        }

        for(Character c: B.toCharArray()){
            if(!visited.contains(c)){
                visited.add(c);
                if(freq.get(c) % A !=0){
                    return -1;
                }
            }

        }
        return 1;

    }

    public static void main(String[] args) {
        System.out.println(new ReplicatingSubstring().solve(2, "bbaabb"));
        System.out.println(new ReplicatingSubstring().solve(1, "ab"));
        System.out.println(new ReplicatingSubstring().solve(3, "abba"));
    }

}
