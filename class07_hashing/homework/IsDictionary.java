package class07_hashing.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * base : https://www.geeksforgeeks.org/lexicographically-largest-string-for-given-dictionary-order/
 */
public class IsDictionary {

    public int solve(String[] A, String B) {

        int[] characters = new int[26];
        for(int i=0;i<B.length(); i++){
            characters[B.charAt(i) - 'a']  =i;
        }

        String ans = A[0];
        for(int i=1; i<A.length; i++){
            int compare  = compare(characters, ans, A[i]);
            if(compare >= 1){
                return 0;
            }
            ans  = A[i];

        }

        return 1;
    }

    private int compare( int[] characters , String S1, String S2){
        int i=0;
        int j=0;
        int compare = 0;

        while(i <S1.length() && j< S2.length()){

            compare  = characters[S1.charAt(i) - 'a'] - characters[S2.charAt(i) - 'a'];
            if(compare > 0){
                return 1;
            }

            if(compare < 0 ){
                return -1;
            }

            i++;
            j++;


        }

        if(compare == 0 ){
            if(S1.length() > S2.length()){
                return 1;
            }
        }

        return -1;
    }


    public static void main(String[] args) {

        IsDictionary obj = new IsDictionary();
        System.out.println(obj.solve(new String[]{"hello", "scaler", "interviewbit"}, "adhbcfegskjlponmirqtxwuvzy"));
        System.out.println(obj.solve(new String[]{"fine", "none", "no"}, "qwertyuiopasdfghjklzxcvbnm"));
        System.out.println(obj.solve(new String[]{ "ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow"}, "nbpfhmirzqxsjwdoveuacykltg"));
    }




}
