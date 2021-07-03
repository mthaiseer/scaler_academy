package class12_Problemsolving01.practice;

public class MaximumSumBEnds {

    int solution_ON(int A[], int B){

        int N = A.length;

        int prefixSum  [] = new int[B+1];
        int suffixSum  [] = new int[B+1];

        prefixSum[0] =0;
        for(int i=1; i<=B; i++){
            prefixSum[i]=  prefixSum[i-1]+ A[i-1];
        }

        suffixSum[B] =0;
        int bLen = B-1;

        for(int i=N-1; i>= (N-B); i--){
            suffixSum[bLen] = suffixSum[bLen+1]+ A[i];
            bLen--;
        }

        int max =0;
        for(int i=0; i<=B; i++){
            max = Math.max(suffixSum[i], prefixSum[i]);
        }
         return max;

    }

    int solution(int A[], int B){

        int sum = 0;
        for(int i=0; i<B; i++){

        }

        return -1;
    }

    public static void main(String[] args) {
        MaximumSumBEnds obj = new MaximumSumBEnds();
        System.out.println(obj.solution_ON(new int[]{7, -1, 100, 2, 1, 5 ,6}, 3));
    }
}
