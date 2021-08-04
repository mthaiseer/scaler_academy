package intermediate.class04_array_dynamicarrays.classroom;

import java.util.Arrays;

public class GoodPair {


    public static int solve(int[] A, int B) {

        if(A == null || A.length <=1 ){
            return 0;
        }
        Arrays.sort(A);

        int left = 0;
        int right = A.length-1;

        while(left < right){

            if(A[left]+A[right] ==  B){
                return 1;
            }

            if(A[left]+A[right] > B){
                right--;
            }

            if(A[left]+A[right] < B){
                left++;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {1,2,3,4}, 7));
        System.out.println(solve(new int[] {1,2,4}, 4));
        System.out.println(solve(new int[] {1,2,2}, 4));
        System.out.println(solve(new int[] {633299, 189622, 811214, 549111, 864962, 673215, 526221, 271580, 78335, 890164 }, 968499));
    }

}
