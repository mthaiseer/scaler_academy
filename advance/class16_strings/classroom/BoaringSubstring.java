package advance.class16_strings.classroom;

import intermediate.class11_maths01.basics.Basics;

import java.util.Arrays;

public class BoaringSubstring {

    public int solve(String A) {

        StringBuffer oddBuffer = new StringBuffer();
        StringBuffer evenBuffer = new StringBuffer();

        for(int i= 0; i<A.length(); i++){

            if(A.charAt(i) % 2 == 0){
                evenBuffer.append(A.charAt(i));
            }else{
                oddBuffer.append(A.charAt(i));
            }
        }

        char[] evenArr = evenBuffer.toString().toCharArray();
        char[] oddArr = oddBuffer.toString().toCharArray();

        Arrays.sort(evenArr);
        Arrays.sort(oddArr);

        int ei = 0;
        int ee = evenArr.length-1;

        int oi = 0;
        int oe = oddArr.length-1;

        if(evenArr[ee] - oddArr[oi] > 1){
            return 1;
        }

        if(oddArr[oe] - evenArr[ei] > 1){
            return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new BoaringSubstring().solve("abcd"));
        System.out.println(new BoaringSubstring().solve("aab"));
    }

}
