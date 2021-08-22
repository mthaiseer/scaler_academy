package advance.class08_recursion.practice;

import java.util.HashSet;
import java.util.Set;

public class UniqueStringPermutation {

    void permute(String str, int l, int r, Set<String> partial){

        if(l == str.length()){

            partial.add(new String(str));
            return;

        }

        for(int i=l ; i<=r; i++){
            str = swap(str, l, i);
            permute(str, l+1, r, partial);
            str = swap(str, l, i);
        }
    }

    String swap(String input, int i, int j) {

        char arr[] = input.toCharArray();
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return new String(arr);

    }

    public static void main(String[] args) {

        String str = "ABB";
        Set<String> partial = new HashSet<>();
        new UniqueStringPermutation().permute(str, 0, str.length()-1, partial);
        System.out.println(partial);


    }

}
