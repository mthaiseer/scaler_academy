package intermediate.class09_strings.homework;

public class LongestPalidromePrefix {

    public String longestCommonPrefix(String[] A) {

        if(A == null || A.length ==0) return null;

        if(A.length == 1){
            return A[0];
        }

        String prev = A[0];
        StringBuilder builder = null;
        StringBuilder prevBuilder = new StringBuilder();
        for (int i = 1; i < A.length; i++) {

            char pchar[] = prev.toCharArray();
            char curChar[] = A[i].toCharArray();
            builder = new StringBuilder();
            int minSize = pchar.length < curChar.length ? pchar.length : curChar.length;

            for (int j = 0; j < minSize; j++) {

                if (pchar[j] == curChar[j]) {
                    builder.append(pchar[j]);
                }


            }
            if(prevBuilder.toString().length() == 0 ){
                prevBuilder = builder;
            }

            if(builder.toString().length() < prevBuilder.toString().length()){
                prevBuilder = builder;
            }
            prev = A[i];

        }


        return prevBuilder.toString();
    }

    public static void main(String[] args) {
        LongestPalidromePrefix obj = new LongestPalidromePrefix();
        System.out.println(obj.longestCommonPrefix(new String[]{"abab", "ab", "abcd"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"abcdefgh", "aefghijk", "abcefgh"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"ABCD"}));
        System.out.println(obj.longestCommonPrefix(new String[]{"aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa "}));

    }


}
