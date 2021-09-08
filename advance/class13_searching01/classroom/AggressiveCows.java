package advance.class13_searching01.classroom;

import java.util.Arrays;

public class AggressiveCows {

    private boolean placeCows(int[] A, int B, int N, int currentDistance) {

        int nextCow = A[0];
        int count  =1; //placed first cow

        for(int i=1; i<N; i++){

            if(A[i] - nextCow >= currentDistance){

                nextCow = A[i];
                count++;

                //placed all cows
                if(count == B){
                    return true;
                }
            }
        }
        return false;

    }

    public int solve(int[] A, int B) {

        int N = A.length;
        Arrays.sort(A);
        int start =0;
        int end = A[N-1] - A[0];//search space

        int ans = 0;


        while(start<=end){

            int mid = (start+end)/2;

            boolean canPlace=  placeCows(A, B, N, mid);
            if(canPlace){
                ans = mid;
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        System.out.println(new AggressiveCows().solve(new int[]{1,2,3,4,5}, 3));
        System.out.println(new AggressiveCows().solve(new int[]{1,2}, 2));
    }



}
