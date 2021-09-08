package advance.class15_twopointer.classroom;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int MOD= 1000000007;
        ArrayList<Integer> res = new ArrayList<>();
        int arr[] =  A.stream().mapToInt(Integer::intValue).toArray();

        int i =0;
        int j =0;
        int N = arr.length;
        int sum = 0;

        while(j<N){

            sum=(sum %MOD +arr[j]%MOD) %MOD;

            while(sum> B){
                sum-=arr[i];
                i++;
            }

            if(sum< B){
                j++;
            }

            if(sum ==  B){

                for(int k=i; k<=j; k++){
                    res.add(arr[k]);
                }
                return res;

            }


        }



        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(4);
        A.add(20);
        A.add(10);
        A.add(3);
        A.add(5);
        System.out.println(new SubarrayWithGivenSum().solve(A, 33));
    }

}
