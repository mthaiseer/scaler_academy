package intermediate.class12_Problemsolving01.practice;

import java.util.Arrays;

public class MissingNumber {

    /**
     * TIME : O(nLogN)
     * SPACE : 1
     * @param A
     * @return
     */
    int missingNumber_sortingNlogN(int [] A){

        if(A == null) throw new IllegalArgumentException("Invalid data");
        Arrays.sort(A);

        for(int i =1; i<A.length; i++){

            if(A[i] - A[i-1] > 1){
                return A[i-1]+1;
            }

        }
        return -1;
    }

    /**
     * TIME : O(N)
     * SPACE : O(1)
     * Issue : integer overflow if array elements are huge
     * @param A
     * @return
     */
    int missingNumber_Counting(int [] A){

        int N = Integer.MIN_VALUE;
        int currentSum =  0;
        for(int x: A){
            N = Math.max(N, x);
            currentSum+=x;
        }

        int arraySum  =  (N*(N+1))/2;
        return arraySum-currentSum;

    }

    /**
     * TIME : O(N)
     * SPACE : O(1)
     * Issue : No integer overflow even if array elements are huge
     * @param A
     * @return
     */
    int missingNumber_xor(int [] A){
        int N = Integer.MIN_VALUE;
        for(int x: A){
            N = Math.max(N, x);
        }

        int globalXOR = 0;
        for(int i=1; i<=N; i++){
            globalXOR^=i;
        }

        int arrayXOR = 0;
        for(int x: A){
            arrayXOR^=x;
        }

        return globalXOR^arrayXOR;


    }

    public static void main(String[] args) {

        MissingNumber obj = new MissingNumber();
        System.out.println(obj.missingNumber_sortingNlogN(new int[] {1,3,2,5}));
        System.out.println(obj.missingNumber_Counting(new int[] {1,3,2,5}));
        System.out.println(obj.missingNumber_xor(new int[] {1,3,2,5}));
    }

}
