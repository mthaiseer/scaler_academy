package advance.class07_bitwise.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerOf3 {

    public ArrayList<Integer> solve(int A) {

        List<Integer> power = new ArrayList<>();
        while(A> 0){

           power.add(A%3);
           A/=3;

        }
        int raiseTo =0 ;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x: power){
            while(x> 0){
               ans.add((int)Math.pow(3, raiseTo));
                x--;
            }
            raiseTo++;
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new PowerOf3().solve(14));
        System.out.println(new PowerOf3().solve(13));
        System.out.println(new PowerOf3().solve(3));
    }

}
