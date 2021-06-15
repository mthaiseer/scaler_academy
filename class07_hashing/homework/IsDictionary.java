package class07_hashing.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsDictionary {

    public int solve(String[] A, String B) {

        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i=0; i<B.length(); i++){

            indexMap.put(B.charAt(i), i);
        }

        int currentPos = -1;
        List<Integer> indexStore = new ArrayList<>();

        for(int i=0; i<A.length; i++){
            char currentChar = A[i].charAt(0);
            currentPos = indexMap.get(currentChar);
            indexStore.add(currentPos);

        }

        int[] array = indexStore.stream().mapToInt(i->i).toArray();
        for(int i=1; i<array.length; i++){
            if(array[i-1] > array[i]){
                return 0;
            }
        }
         return 1;
    }

    public static void main(String[] args) {

        System.out.println("fine".compareTo("none"));
        System.out.println("none".compareTo("no"));
        System.out.println("no".compareTo("none"));


        System.out.println("hello".compareTo("scaler"));
        System.out.println("scaler".compareTo("interviewbit"));

        System.out.println("-------------------");

        IsDictionary obj = new IsDictionary();
        System.out.println(obj.solve(new String[]{"hello", "scaler", "interviewbit"}, "adhbcfegskjlponmirqtxwuvzy"));
        System.out.println(obj.solve(new String[]{"fine", "none", "no"}, "qwertyuiopasdfghjklzxcvbnm"));
        System.out.println(obj.solve(new String[]{ "ipial", "qjqgt", "vfnue", "vjqfp", "eghva", "ufaeo", "atyqz", "chmxy", "ccvgv", "ghtow"}, "nbpfhmirzqxsjwdoveuacykltg"));
    }

}
