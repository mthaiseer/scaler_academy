package advance.class18_hashingII.classroom;

import java.util.HashMap;
import java.util.Map;

public class WindowString {

    public String minWindow(String A, String B) {

        int windowStart = 0, matched = 0, minLength = A.length() + 1, subStrStart = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : B.toCharArray())
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);


        for (int windowEnd = 0; windowEnd < A.length(); windowEnd++) {
            char rightChar = A.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) >= 0) // count every matching of a character
                    matched++;
            }
            while (matched == B.length()) {
                if (minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subStrStart = windowStart;
                }

                char leftChar = A.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0)
                        matched--;
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }

        return minLength > A.length() ? "" : A.substring(subStrStart, subStrStart + minLength);
    }

    public static void main(String[] args) {
        System.out.println(new WindowString().minWindow("ADOBECODEBANC", "ABC"));
    }
}
