package advance.class16_strings.classroom;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(ArrayList<String> A) {

        int minLen = Integer.MAX_VALUE;
        StringBuffer buffer = new StringBuffer();
        String minString = null;
        for (String s : A) {

            if (s.length() < minLen) {
                minString = s;
                minLen = s.length();
            }

        }


        for (int i = 0; i < minLen; i++) {
            char charCurrent = minString.charAt(i);
            boolean isQualified = true;

            for (int j = 0; j < A.size(); j++) {

                if (A.get(j).charAt(i) != charCurrent) {
                    isQualified = false;
                    break;
                }


            }

            if (isQualified) {
                buffer.append(charCurrent);
            } else {
                return buffer.toString();
            }


        }


        return buffer.toString();
    }

    public static void main(String[] args) {

        ArrayList<String> A = new ArrayList<>();
        A.add("abz");
        A.add("abc");
        A.add("abcd");

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(A));

    }

}
