package advance.class08_recursion.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Permulation {

    void generatePermutation(int [] arr, List<Integer> partial, boolean [] used ){

        if(arr.length == partial.size()){
            System.out.println(partial);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!used[i]){
                used[i ]= true;
                partial.add(arr[i]);
                generatePermutation(arr, partial, used);

                used[i ]= false;
                partial.remove(partial.size()-1);
            }
        }

    }

    public static void main(String[] args) {
        boolean [] used = new boolean[9];
        new Permulation().generatePermutation(new int[]{1,2,3}, new ArrayList<>(),  used);
    }

}
